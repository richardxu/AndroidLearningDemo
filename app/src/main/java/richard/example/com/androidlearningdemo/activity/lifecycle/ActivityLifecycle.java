package richard.example.com.androidlearningdemo.activity.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.view.Menu;

import richard.example.com.androidlearningdemo.R;

import static richard.example.com.androidlearningdemo.activity.lifecycle.Util.LifecycleState.CALL_TO_SUPER;
import static richard.example.com.androidlearningdemo.activity.lifecycle.Util.LifecycleState.RETURN_FROM_SUPER;
import static richard.example.com.androidlearningdemo.activity.lifecycle.Util.recLifeCycle;

/**
 * Created by Administrator on 2016/11/7.
 * Lifecycle Method	Description	Common Uses
 onCreate()	The activity is starting (but not visible to the user)
    ============= Most of the activity initialization code goes here. This is where you setContentView() for the activity, initialize views, set up any adapters, etc.
 onStart()	The activity is now visible (but not ready for user interaction)
    ============== This lifecycle method isn't used much, but can come in handy to register a BroadcastReceiver to monitor for changes that impact the UI (since the UI is now visible to the user).
 onResume()	The activity is now in the foreground and ready for user interaction
    ============= This is a good place to start animations, open exclusive-access devices like the camera, etc.
 onPause()	Counterpart to onResume(). The activity is about to go into the background and has stopped interacting with the user.
    =============  This can happen when another activity is launched in front of the current activity.	It's common to undo anything that was done in onResume() and to save any global state (such as writing to a file).
 onStop()	Counterpart to onStart(). The activity is no longer visible to the user.
    =============  It's common to undo anything that was done in onStart().
 onDestroy()	Counterpart to onCreate(...).
    ============ This can be triggered because finish() was called on the activity or the system needed to free up some memory.	It's common to do any cleanup here. For example, if the activity has a thread running in the background to download data from the network, it may create that thread in onCreate() and then stop the thread here in onDestroy()
 onRestart()	Called when the activity has been stopped, before it is started again
    ============ It isn't very common to need to implement this callback.
 */

public class ActivityLifecycle extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onCreate(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
        setContentView(R.layout.activity_lifecycle);


        FragmentManager.enableDebugLogging(true);
        LoaderManager.enableDebugLogging(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        //Inflate the menu; this adds items to the action bar if it is present;
//        getMenuInflater().inflate(android.R.menu.main, menu);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
        return true;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onActivityResult(requestCode,resultCode,data);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

    }

    @Override
    public void onAttachedToWindow(){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onAttachedToWindow();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onConfigurationChanged(newConfig);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onContentChanged(){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onContentChanged();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onDestroy(){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onDestroy();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onDetachedFromWindow(){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onDetachedFromWindow();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected  void onNewIntent(Intent intent){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onNewIntent(intent);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onPause(){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPause();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPostCreate(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onPostResume(){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPostResume();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public boolean onPrepareOptionsMenu(final Menu menu){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        boolean result = super.onPrepareOptionsMenu(menu);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
        return  result;
    }


    @Override
    protected void onRestart(){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onRestart();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void  onResume(){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onResume();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onRestoreInstanceState(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onWindowFocusChanged(hasFocus);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onUserLeaveHint(){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onUserLeaveHint();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected  void onStart()
    {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onStart();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected  void onStop()
    {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onStop();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onSaveInstanceState(final Bundle  outState){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onSaveInstanceState(outState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onUserInteraction(){
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onUserInteraction();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
    }

}

