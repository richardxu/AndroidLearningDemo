package richard.example.com.androidlearningdemo.listener;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/11/18.
 */

public class MyParentActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // ...
        //Create the custom object
        MyCustomObject object = new MyCustomObject();
        //Step 4 --- Setup the listener for this object
        object.setCustomObjectListener(new MyCustomObject.MyCustomObjectListener() {
            @Override
            public void ObjectReady(String title) {
                //Code the handle object ready
                Log.d("Richard", " =========== Code the handle object ready ======");
            }

            @Override
            public void onDataLoader(){
//            public void onDataLoader(SomeData data) {
                // Code to handle data loaded from network
                // Use the data here!
            }
        });
    }
}
