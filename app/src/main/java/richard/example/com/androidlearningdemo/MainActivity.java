package richard.example.com.androidlearningdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import richard.example.com.androidlearningdemo.activity.lifecycle.ActivityLifecycle;
import richard.example.com.androidlearningdemo.context.ContextActivity;

public class MainActivity extends AppCompatActivity {

    public final static String TAG  = "richard";

    public Button buttonActivity;
    public Button buttonContext;
//    public ListView mlistView;
   public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonActivity = (Button) findViewById(R.id.button_activity);
        buttonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "============== buttongActivity clicked ============= ");
            }
        });

        buttonContext = (Button) findViewById(R.id.button_context);


        buttonContext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "============== button Context clicked ============= ");
                intent  = new Intent(MainActivity.this, ActivityLifecycle.class);
                startActivity(intent);
            }
        });

//        mlistView = (ListView) findViewById(R.id.listview_activities);


    }
}
