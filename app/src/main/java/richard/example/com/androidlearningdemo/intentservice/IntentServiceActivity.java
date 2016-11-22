package richard.example.com.androidlearningdemo.intentservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import richard.example.com.androidlearningdemo.R;

/**
 * Created by richardxu on 21/11/2016.
 */

public class IntentServiceActivity extends Activity {

    //Call LaunchTestService() in the activity to startup the service
    public void lunchTestService(){
        //Construct our Intent specifying the Service
        Intent i = new Intent(this, MyTestService.class);
        // Add extras to the bundle
        i.putExtra("foo", "bar");
        //Start the service
        startService(i);
    }

    public MyTestReceiver receiverForTest;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.);
        setupServiceReceiver();
    }

    //Starts the IntentService
    public void onStartService(){
        Intent i = new Intent(this, MyTestService.class);
        i.putExtra("foo", "bar");
        i.putExtra("receiver", receiverForTest);
        startService(i);
    }

    //Setup the callback for when data is recived from the service
    public void setupServiceReceiver(){
        receiverForTest =  new MyTestReceiver(new Handler());

        //This is where we specify what happens when data is received from the service
        receiverForTest.setReceiver(new  MyTestReceiver.Receiver() {

            @Override
            public void onReceiveResult(int resultCode, Bundle resultData) {
                if(resultCode == RESULT_OK){
                    String resultValue = resultData.getString("resultValue");
                    Toast.makeText(IntentServiceActivity.this, resultValue,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
