package richard.example.com.androidlearningdemo;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/11/8.
 */

public class MyApplication extends Application {

    public static String TAG = "MyApplication";

    private static Context mContext;

    MyApplication()
    {
        mContext = this;
    }

    public static Context getrichardContext()
    {
        return mContext;
    }

    /**
     * Richard: need to pay attention: the onCreate()
     * is no the same with Activity's onCreate(Bundle onSaveInstanceState)
     *
     */
    @Override
    public void onCreate()
    {
        Log.d(TAG, "===========  onCreate ==========");
        Log.d(TAG, "===========  onCreate ==========");
        Log.d(TAG, "===========  onCreate ==========");
        Log.d(TAG, "===========  the application starting point ==========");
    }
}
