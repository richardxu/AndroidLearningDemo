package richard.example.com.androidlearningdemo.touchevent.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import richard.example.com.androidlearningdemo.touchevent.util.DebugTag;

/**
 * Created by Administrator on 2016/11/21.
 */

public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context) {
        this(context, null);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.dispatchTouchEvent);
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.ACTION_DOWN);
                break;
            case MotionEvent.ACTION_MOVE:
                DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.ACTION_MOVE);
                break;
            case MotionEvent.ACTION_UP:
                DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.ACTION_UP);
                break;
            default:
                break;
        }
        DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.dispatchTouchEvent
                + "$$$$ default return====" + super.dispatchTouchEvent(ev));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        DebugTag.syso(DebugTag.MyLinearLayout,
                DebugTag.onInterceptTouchEvent);
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.ACTION_DOWN);
                break;
            case MotionEvent.ACTION_MOVE:
                DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.ACTION_MOVE);
                break;
            case MotionEvent.ACTION_UP:
                DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.ACTION_UP);
                break;
            default:
                break;
        }
        DebugTag.syso(DebugTag.MyLinearLayout,
                DebugTag.onInterceptTouchEvent + "$$$$ default return===="
                        + super.onInterceptTouchEvent(ev));
        // return true;
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.onTouchEvent);
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.ACTION_DOWN);
//			return true;
                break;
            case MotionEvent.ACTION_MOVE:
                DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.ACTION_MOVE);
                break;
            case MotionEvent.ACTION_UP:
                DebugTag.syso(DebugTag.MyLinearLayout, DebugTag.ACTION_UP);
                break;
            default:
                break;
        }
        return true;
//		return super.onTouchEvent(ev);
    }
}
