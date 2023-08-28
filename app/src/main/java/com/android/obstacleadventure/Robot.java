package com.android.obstacleadventure;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.ArrayList;

public class Robot extends BaseObject{
        private ArrayList<Bitmap> arrBms = new ArrayList<>();
        public Robot(){
    }

    public void draw(Canvas canvas){

    }

    public ArrayList<Bitmap> getArrBms() {
        return arrBms;
    }

    public void setArrBms(ArrayList<Bitmap> arrBms) {
        this.arrBms = arrBms;
        for (int i = 0; i < arrBms.size(); i++) {
            this.arrBms.set(i, Bitmap.createScaledBitmap(this.arrBms.get(i), this.width, this.height, true));
        }
    }
}
