package com.arik181.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

import java.util.Date;
import java.util.Random;

import static java.lang.Thread.sleep;

public class HedgeMaze extends View {

    Canvas canvas;

    public HedgeMaze(Context context)
    {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);

        Paint circlePaint = new Paint();
        circlePaint.setColor( Color.BLACK );
        circlePaint.setStyle( Paint.Style.STROKE );
        circlePaint.setAntiAlias(true);
        circlePaint.setStrokeWidth(8);

        Long seed = Long.valueOf(new Date().getTime());
        Random r = new Random(seed);

        Integer radius =  canvas.getWidth() / 10;

        Integer appearance_width  = canvas.getWidth()  - (radius * 2 );
        Integer appearance_height = canvas.getHeight() - (radius * 2 );

        Integer cx     = r.nextInt(appearance_width)  + ( radius );
        Integer cy     = r.nextInt(appearance_height) + ( radius );

        Log.v("cx", cx.toString());
        Log.v("cy", cy.toString());
        Log.v("radius", radius.toString());

        canvas.drawCircle(
                cx,
                cy,
                radius,
                circlePaint );

        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        invalidate();
    }
}
