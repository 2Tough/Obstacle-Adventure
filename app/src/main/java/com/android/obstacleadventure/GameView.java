package com.android.obstacleadventure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.provider.SyncStateContract;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.logging.LogRecord;

public class GameView extends View {
    private Robot robot;
    private Handler handler;
    private Runnable runnable;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        robot = new Robot();
        robot.setWidth(200*Constants.SCREEN_WIDTH/1080);
        robot.setHeight(200*Constants.SCREEN_HEIGHT/1920);
        robot.setX(100*Constants.SCREEN_WIDTH/1080);
        robot.setY(Constants.SCREEN_HEIGHT/2-robot.getHeight()/2);
        ArrayList<Bitmap> arrBms = new ArrayList<>();
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run000));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run001));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run002));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run003));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run004));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run005));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run006));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run007));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run008));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run009));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run010));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run011));

        robot.setArrBms(arrBms);
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                invalidate();
            }
        };
    }

    public void draw(Canvas canvas){
        super.draw(canvas);
        robot.draw(canvas);
        handler.postDelayed(runnable, 5);
    }

}
