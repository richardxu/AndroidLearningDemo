package richard.example.com.androidlearningdemo.window;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import richard.example.com.androidlearningdemo.R;

/**
 * Created by richardxu on 2017/2/28.
 */

public class WindowActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置Activity的Window为全屏，当然也可以在xml中设置
        Window window = getWindow();
        WindowManager.LayoutParams windowAttributes = window.getAttributes();
        windowAttributes.flags = WindowManager.LayoutParams.FLAG_FULLSCREEN | windowAttributes.flags;
        window.setAttributes(windowAttributes);
        //设置Activity的Window为保持屏幕亮
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_drawable);
    }
}
