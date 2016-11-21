package richard.example.com.androidlearningdemo.touchevent.util;

/**
 * Created by Administrator on 2016/11/21.
 */

public class DebugTag {
    public static final String MyLinearLayout = "MyLinearLayout";
    public static final String MyButton = "MyButton";
    public static final String dispatchTouchEvent = "dispatchTouchEvent";
    public static final String onInterceptTouchEvent = "onInterceptTouchEvent";
    public static final String onTouchEvent = "onTouchEvent";
    public static final String ACTION_DOWN = "ACTION_DOWN";
    public static final String ACTION_MOVE = "ACTION_MOVE";
    public static final String ACTION_UP = "ACTION_UP";

    public static void syso(Object object, String msg){
        System.out.println(object + "----------------> " + msg);
    }
}
