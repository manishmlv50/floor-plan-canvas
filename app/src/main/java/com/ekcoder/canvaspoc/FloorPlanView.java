package com.ekcoder.canvaspoc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.os.Debug;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class FloorPlanView extends View {
    Paint paint = new Paint();
    Path path = new Path();
    Canvas canvas = new Canvas();
    float[] verts = new float[]{100f, 100f, 100f, 400f, 200f, 400f, 200f, 200f, 300f, 200f, 300f, 100f};
    public FloorPlanView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);
    }

    public FloorPlanView(Context context, AttributeSet attrs, int defstyle) {
        super(context, attrs, defstyle );
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);
    }


    public FloorPlanView(Context context) {
        super(context);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);

    }

    public void setPath(Path p){
        path = p;
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.canvas = canvas;
        canvas.drawPath(path, paint);
    }

}
