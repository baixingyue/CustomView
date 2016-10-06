package com.example.dell.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by DELL on 2016/10/6.
 */
public class DrawView {
    public float currentX=40;
    public float currentY=50;
    //定义并创建画笔
    Paint p=new Paint();
    public DrawView(Context context){
        super(context);
    }
    public DrawView(Context context, AttributeSet set){
        super(context,set);
    }
    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        p.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,15,p);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        currentX=event.getX();
        currentY=event.getY();
        invalidate();
        return true;
    }

}
