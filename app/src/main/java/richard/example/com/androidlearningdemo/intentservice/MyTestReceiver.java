package richard.example.com.androidlearningdemo.intentservice;

import android.content.ReceiverCallNotAllowedException;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/**
 * Created by richardxu on 21/11/2016.
 */

public class MyTestReceiver extends ResultReceiver {

    private Receiver receiver;

    public MyTestReceiver(Handler handler) {
        super(handler);
    }

    //Setter for assigning the receiver
    public void setReceiver(Receiver receiver){
        this.receiver = receiver;
    }

    // Define our event interface for commuication
    public interface Receiver{
        public void onReceiveResult(int resultCode, Bundle resultData);
    }

    //Delegate method which passes the result to the receiver if the receiver has been assign
    @Override
    protected void onReceiveResult(int resultCode, Bundle resultData){
        if(receiver != null){
            receiver.onReceiveResult(resultCode, resultData);
        }
    }
}
