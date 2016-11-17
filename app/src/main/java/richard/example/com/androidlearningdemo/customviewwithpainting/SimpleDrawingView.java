package richard.example.com.androidlearningdemo.customviewwithpainting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */

public class SimpleDrawingView extends View {

    //setup initial color
    private final int paintColor = Color.BLACK;
    //defines paint and canvas
    private Paint drawPaint;

    // Store circles to draw each time the user toucher down
    private List<Point> circlePoints;

    public SimpleDrawingView(Context context, AttributeSet attributeSet)
    {

        super(context, attributeSet);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setupPaint();

        circlePoints = new ArrayList<Point>();
    }

    //Setup paint with color and stroke styles
    private void setupPaint(){
        drawPaint = new Paint();
        drawPaint.setColor(paintColor);
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(5);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);

        drawPaint.setStyle(Paint.Style.FILL);
    }

    // ... variables and setting up paint...
    // let's draw three circles
    @Override
    protected void onDraw(Canvas canvas){
//        canvas.drawCircle(50, 50, 20, drawPaint);
//        drawPaint.setColor(Color.GREEN);
//        canvas.drawCircle(50, 150, 20, drawPaint);
//        drawPaint.setColor(Color.BLUE);
//        canvas.drawCircle(50, 250, 20, drawPaint);

        for(Point p : circlePoints){
            canvas.drawCircle(p.x, p.y, 5, drawPaint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        float touchX = event.getX();
        float touchY = event.getY();
        circlePoints.add(new Point(Math.round(touchX), Math.round(touchY)));

        //indiacatte view should be redrawn
        postInvalidate();
        return true;
    }


}
