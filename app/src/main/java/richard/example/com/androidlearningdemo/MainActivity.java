package richard.example.com.androidlearningdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import richard.example.com.androidlearningdemo.activity.lifecycle.ActivityLifecycle;
import richard.example.com.androidlearningdemo.context.ContextActivity;
import richard.example.com.androidlearningdemo.fragment.DialogFragment.DialogDemoActivity;
import richard.example.com.androidlearningdemo.fragment.FragmentLifecyle;
import richard.example.com.androidlearningdemo.fragment.TabLayout.TabLayoutFragment;
import richard.example.com.androidlearningdemo.webview.ActivtyWebView;

public class MainActivity extends AppCompatActivity {

    public final static String TAG  = "richard";

    public Button buttonActivity;
    public Button buttonContext;
    public Button buttonFragmentCyle;
    public Button buttonTabLayoutFragment;
    public Button buttonDialogFragment;

//    public ListView mlistView;
   public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        setContentView(R.layout.framelayout);
//        setContentView(R.layout.activity_linearlayout);

//        mlistView = (ListView) findViewById(R.id.listview_activities);
//
        //============================================================================
        buttonActivity = (Button) findViewById(R.id.button_activity);
        buttonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "============== buttongActivity clicked ============= ");
                intent  = new Intent(MainActivity.this, ActivityLifecycle.class);
                startActivity(intent);
            }
        });


        //============================================================================
        buttonContext = (Button) findViewById(R.id.button_context);
        buttonContext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "============== button Context clicked ============= ");
                intent  = new Intent(MainActivity.this, ContextActivity.class);
                startActivity(intent);
            }
        });

        //=================================================================================
        buttonFragmentCyle = (Button) findViewById(R.id.button_fragment_cycle);
        buttonFragmentCyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "============== button Context clicked ============= ");
                intent  = new Intent(MainActivity.this, FragmentLifecyle.class);
                startActivity(intent);
            }
        });

        //=================================================================================
        buttonFragmentCyle = (Button) findViewById(R.id.button_fragment_tablayout);
        buttonFragmentCyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "============== button fragment tablayout clicked ============= ");
                intent  = new Intent(MainActivity.this, TabLayoutFragment.class);
                startActivity(intent);
            }
        });

        //=================================================================================
        buttonFragmentCyle = (Button) findViewById(R.id.button_fragment_dialog);
        buttonFragmentCyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "============== button fragment tablayout clicked ============= ");
                intent  = new Intent(MainActivity.this, DialogDemoActivity.class);
                startActivity(intent);
            }
        });

        //=================================================================================
        buttonFragmentCyle = (Button) findViewById(R.id.button_fragment_webview);
        buttonFragmentCyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "============== button fragment webview clicked ============= ");
                intent  = new Intent(MainActivity.this, ActivtyWebView.class);
                startActivity(intent);
            }
        });


    }
}
