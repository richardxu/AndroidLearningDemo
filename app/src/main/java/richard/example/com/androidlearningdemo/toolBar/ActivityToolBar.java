package richard.example.com.androidlearningdemo.toolBar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import richard.example.com.androidlearningdemo.R;

/**
 * Created by Administrator on 2016/11/15.
 */

public class ActivityToolBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        //Find the toolbar view inside the activity
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for the Activity window
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
    }

    //Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
}
