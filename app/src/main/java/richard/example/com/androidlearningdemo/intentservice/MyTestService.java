package richard.example.com.androidlearningdemo.intentservice;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

/**
 * Created by richardxu on 21/11/2016.
 */

public class MyTestService extends IntentService {
    public MyTestService() {
        // Used to name the worker thread, important only for debuging
        super("test-service");
    }

    @Override
    public void onCreate(){
        super.onCreate();   //if you override onCreate(),make sure to call super().
        // If a Context object is needed, call getApplicationContext() here.
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // Extract the receiver passed into the service
        ResultReceiver rec = intent.getParcelableExtra("receiver");
        // Extract additional values from the bundle
        String val = intent.getStringExtra("foo");
        // To send a message to the Activity, create a pass a Bundle
        Bundle bundle = new Bundle();
        bundle.putString("resultValue", "My Result Value. Passed in: " + val);
        // Here we call send passing a resultCode and the bundle of extras
        rec.send(Activity.RESULT_OK, bundle);
    }
}
