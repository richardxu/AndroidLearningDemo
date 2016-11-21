package richard.example.com.androidlearningdemo.touchevent.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/11/21.
 * 自定义ViewGroup,实现 LinearLayout
 */



public class ViewGroupLayout extends ViewGroup {

    private int pWidth;
    private int pHeight;

    public ViewGroupLayout(Context context) {
        this(context, null);
    }

    public ViewGroupLayout(Context context, AttributeSet attributeSet){
        this(context, attributeSet, 0);
    }

    public ViewGroupLayout(Context context, AttributeSet attributeSet, int defStyle){
        super(context, attributeSet, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        /**
         * 获得此ViewGroup上级容器为其推荐的宽和搞，以及计算模式
         */
        int sizeWidth = MeasureSpec.getSize(widthMeasureSpec);
        int sizeHeight = MeasureSpec.getSize(heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        measureChildren(widthMeasureSpec, heightMeasureSpec);
        calculate();
        if(widthMode == MeasureSpec.EXACTLY){
            pWidth = sizeWidth;
        }
        if(heightMode == MeasureSpec.EXACTLY){
            pHeight = sizeHeight;
        }

        setMeasuredDimension(pWidth, pHeight);
    }

    private void calculate(){
        for (int i = 0; i < getChildCount(); i++){
            View childView = getChildAt(i);
            int width = childView.getMeasuredWidth();
            int height = childView.getMeasuredHeight();
            if(pWidth < width){
                pWidth = width;
            }
            pHeight += height;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event){
        return super.dispatchTouchEvent(event);
    }


    /**
     * onLayout 传下来的l,t,r,b分别是放置父空间的矩形可用空间(除去margin和pading的空间)的左上角的lefe.top以及右下角right,bottom值
     * @param changed
     * @param l
     * @param t
     * @param r
     * @param b
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int nextHeight = 0;
        for(int i = 0; i < getChildCount(); i++){
            View childView = getChildAt(i);
            int width = childView.getMeasuredWidth();
            int height = childView.getMeasuredHeight();
            childView.layout(0, nextHeight, width, nextHeight + height);
            nextHeight += height;
        }
    }
}
