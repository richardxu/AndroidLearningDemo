package richard.example.com.androidlearningdemo.touchevent.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.Button;

import richard.example.com.androidlearningdemo.touchevent.util.DebugTag;

/**
 * Created by Administrator on 2016/11/21.
 */

public class MyButton extends Button {
    private int index = 1;
    public MyButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public MyButton(Context context, AttributeSet attributeSet, int defStyle){
        super(context, attributeSet, defStyle);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event){
        DebugTag.syso(DebugTag.MyButton, DebugTag.dispatchTouchEvent);
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                DebugTag.syso(DebugTag.MyButton, DebugTag.ACTION_DOWN);
                break;
            case MotionEvent.ACTION_MOVE:
                DebugTag.syso(DebugTag.MyButton, DebugTag.ACTION_MOVE);
                break;
            case MotionEvent.ACTION_UP:
                DebugTag.syso(DebugTag.MyButton, DebugTag.ACTION_UP);
                break;
            default:
                break;
        }
        DebugTag.syso(DebugTag.MyButton, DebugTag.dispatchTouchEvent
                + "$$$$ " + index++ +" default return====" + super.dispatchTouchEvent(event));
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        DebugTag.syso(DebugTag.MyButton, DebugTag.onTouchEvent);
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                DebugTag.syso(DebugTag.MyButton, DebugTag.ACTION_DOWN);
                break;
            case MotionEvent.ACTION_MOVE:
                DebugTag.syso(DebugTag.MyButton, DebugTag.ACTION_MOVE);
                break;
            case MotionEvent.ACTION_UP:
                DebugTag.syso(DebugTag.MyButton, DebugTag.ACTION_UP);
                break;
            default:
                break;
        }
        DebugTag.syso(DebugTag.MyButton, DebugTag.onTouchEvent
                + "$$$$ " + index++ +" default return====" + super.onTouchEvent(event));
        return false;
//        return  super.onTouchEvent();
    }
}
