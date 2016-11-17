package richard.example.com.androidlearningdemo.theme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import richard.example.com.androidlearningdemo.MyApplication;
import richard.example.com.androidlearningdemo.R;

/**
 * Created by Administrator on 2016/11/17.
 */

public class ThemeActivity extends AppCompatActivity {
    private Spinner spThemes;

    //Here we set the theme for the activity
    @Override
    protected void onCreate(Bundle onSavedInstanceState){
        super.onCreate(onSavedInstanceState);

        //MUST be set before setContentView
        Utils.onActivityCreateSetTheme(this);
        // AFTER SETTING THEME
        setContentView(R.layout.activity_theme);
        setupSpinnerItemSelection();
    }

    private void setupSpinnerItemSelection(){
        spThemes = (Spinner) findViewById(R.id.spThemes);
        spThemes.setSelection(MyApplication.currentPosition);
        MyApplication.currentPosition = spThemes.getSelectedItemPosition();

        spThemes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long id) {
                if(MyApplication.currentPosition != position){
                    Utils.changeToTheme(ThemeActivity.this, position);
                }
                MyApplication.currentPosition = position;
            }
        });
    }
}
