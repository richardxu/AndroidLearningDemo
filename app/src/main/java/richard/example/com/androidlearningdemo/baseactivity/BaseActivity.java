package richard.example.com.androidlearningdemo.baseactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2016/11/8.
 *
 * richard: can reference from : https://github.com/TianShuguang/MDZhihu/blob/b1677b86c8bf76ef2d7e15658c45eb010832cfc7/app/src/main/java/com/tian/zhihu/base/BaseActivity.java
 * https://github.com/TianShuguang/MDZhihu
 *
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected static String TAG;
    protected Context mContext;

    protected FragmentManager fm;
    protected Toolbar base_toolbar;
    protected FrameLayout base_content;

    /**
     * get the screen's width and height
     */
    protected int mScreenWidth;
    protected int mScreenHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

//        app =
        fm = getSupportFragmentManager();

        DisplayMetrics metrics = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        mScreenHeight = metrics.widthPixels;
        mScreenHeight = metrics.heightPixels;

        initBaseData();
        installViews();
        registerEvents();
    }

    private void initBaseData(){
        mContext = this;
        TAG = this.getClass().getSimpleName();

        /**
         * init the base archture
         */
//        super.setContentView(R.layout.acty_base);
//        base_toolbar = (Toolbar) findViewById(R.id.base_toolbar);
//        base_content = (FrameLayout) findViewById(R.id.base_content);
    }


    @Override
    public void setContentView(int layoutResID){
//        LayoutInflater inflater=LayoutInflater.from(BaseActivity.this);
//        inflater.inflate(layoutResID, base_content);
    }

    @Override
    public void setContentView(View view)
    {
        base_content.addView(view);
    }

    public void setTooBarVisible(int visible){
        if(visible != 0){
            base_toolbar.setVisibility(visible);
        }
    }

    /**
     * 加载布局文件
     */
    protected abstract void installViews();

    /**
     * Activity 中所有View的绑定事件，都放置到该类中。
     */
    protected abstract void registerEvents();

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        app.remove(this);
    }

    /**
     *  Fragment管理 =========== START ============
     */
    public void showFragment(Fragment fragment, Bundle bundle, int contentId){
//        showWithFragment(fragment, fragment.getClass())
    }

    /**
     * 替换成另一个fragment
     * @param fragment
     *      fragment.class
     * @param tag
     *      一个fragment实例对应一个tag,tag不能为空和“”，且必须唯一
     */
    public void showWithFragment(Fragment fragment, String tag, Bundle bundle, int contentID)
    {

    }

    /**
     * 改变内容
     * @param fragment
     * @param bundle
     *      fragment的参数
     * @param contentId
     *      操作的layout的Id
     */
    public void replaceFragment(Fragment fragment, Bundle bundle, int ContentID){

    }
    public void replaceWithFragment(Fragment fragment,String tag,Bundle bundle,int contentId) {
    }

    public void setCurrentFragment(Fragment fragment){

    }

    /*********************************Activity跳转*******START************************************/
    public void goActy(Class acty) {
        goActy(acty, null);
    }

    public void goActy(Class acty, Bundle data) {
        Intent intent = new Intent(this, acty);
        if (data != null) {
            intent.putExtras(data);
        }
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in,
                android.R.anim.fade_out);
    }
}
