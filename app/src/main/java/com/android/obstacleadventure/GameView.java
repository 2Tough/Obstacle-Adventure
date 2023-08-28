package com.android.obstacleadventure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.provider.SyncStateContract;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class GameView extends View {
    private Robot robot;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        robot = new Robot();
        robot.setWidth(100*Constants.SCREEN_WIDTH/1080);
        robot.setHeight(100*Constants.SCREEN_HEIGHT/1920);
        robot.setX(100*Constants.SCREEN_WIDTH);
        robot.setY(Constants.SCREEN_HEIGHT/2-robot.getHeight()/2);
        ArrayList<Bitmap> arrBms = new ArrayList<>();
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run000));
        arrBms.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.run001));
        robot.setArrBms(arrBms);
    }

    public void draw(Canvas canvas){
        super.draw(canvas);
    }

}
