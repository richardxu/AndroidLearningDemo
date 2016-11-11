package richard.example.com.androidlearningdemo.fragment.DialogFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import richard.example.com.androidlearningdemo.R;

/**
 * Created by Administrator on 2016/11/11.
 */

public class DialogDemoActivity extends AppCompatActivity
        implements EditNameDialogFragment.EditNameDialogListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        showEditDialog();
//        showAlertDialog();
    }

    private void showEditDialog(){
        FragmentManager fm = getSupportFragmentManager();

        //Two types of dialog to show
        EditNameDialogFragment editNameDialogFragment = EditNameDialogFragment.newInstance("some title");
        editNameDialogFragment.show(fm, "fragment_edit_name");

    }

    private void showAlertDialog(){
        FragmentManager fm = getSupportFragmentManager();
        MyAlertDialogFragment myAlertDialogFragment = MyAlertDialogFragment.newInstance("some title");
        myAlertDialogFragment.show(fm, "fragment_alert");
    }

    //3. This method is invoked in the activity when the listener is triggere
    //Acess the data result passed to the activity here
    @Override
    public void onFinishEditDialog(String inputText) {
        Toast.makeText(this, "Hi, " + inputText, Toast.LENGTH_SHORT).show();
    }
}


