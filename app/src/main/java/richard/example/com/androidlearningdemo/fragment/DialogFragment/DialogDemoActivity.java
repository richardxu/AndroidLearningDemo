package richard.example.com.androidlearningdemo.fragment.DialogFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import richard.example.com.androidlearningdemo.R;

/**
 * Created by Administrator on 2016/11/11.
 */

public class DialogDemoActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        showEditDialog();
    }

    private void showEditDialog(){
        FragmentManager fm = getSupportFragmentManager();

        //Two types of dialog to show 
//        EditNameDialogFragment editNameDialogFragment = EditNameDialogFragment.newInstance("some title");
//        editNameDialogFragment.show(fm, "fragment_edit_name");

        MyAlertDialogFragment myAlertDialogFragment = MyAlertDialogFragment.newInstance("some title");
        myAlertDialogFragment.show(fm, "fragment_alert");
    }

}


