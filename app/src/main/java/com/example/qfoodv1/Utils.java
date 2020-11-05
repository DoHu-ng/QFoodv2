package com.example.qfoodv1;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Utils {
    public static  ArrayList<Food> getMockData(Context context){
        ArrayList<Food> tmp = new ArrayList<>();
        tmp.add(new Food(context.getString(R.string.product_one), convertStringToBitmapFromAccess(context,"food1.jpg")));
        tmp.add(new Food(context.getString(R.string.product_one), convertStringToBitmapFromAccess(context,"food1.jpg")));
        tmp.add(new Food(context.getString(R.string.product_one), convertStringToBitmapFromAccess(context,"food1.jpg")));
        tmp.add(new Food(context.getString(R.string.product_one), convertStringToBitmapFromAccess(context,"food1.jpg")));
        tmp.add(new Food(context.getString(R.string.product_one), convertStringToBitmapFromAccess(context,"food1.jpg")));
        tmp.add(new Food(context.getString(R.string.product_one), convertStringToBitmapFromAccess(context,"food1.jpg")));
        return tmp;
    }

    public static Bitmap convertStringToBitmapFromAccess(Context context, String
            filename){
        AssetManager assetManager = context.getAssets();
        try {
            InputStream is = assetManager.open(filename);
            Bitmap bitmap = BitmapFactory.decodeStream(is);
            return bitmap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
