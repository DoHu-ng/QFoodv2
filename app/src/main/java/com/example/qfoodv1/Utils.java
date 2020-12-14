package com.example.qfoodv1;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Utils {
    public Utils(Context context) {
    }

    public static  ArrayList<Food> getMockData(Context context){
        ArrayList<Food> tmp = new ArrayList<>();
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "food1.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "food2.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "food3.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "food4.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "food5.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "food6.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "food7.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "food8.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "food9.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "food10.jpg"));
        return tmp;
    }

    public static  ArrayList<Food> getMockData2(Context context){
        ArrayList<Food> tmp = new ArrayList<>();
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "drink1.jpg"));
        tmp.add(new Food(context.getString(R.string.product_two),context.getString(R.string.product_des_one), "drink2.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "drink3.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "drink4.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "drink5.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "drink6.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "drink7.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "drink8.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "drink9.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "drink10.jpg"));
        return tmp;
    }

    public static  ArrayList<Food> getMockData3(Context context){
        ArrayList<Food> tmp = new ArrayList<>();
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "more1.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "more2.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "more3.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "more4.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "more5.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "more6.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "more7.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "more8.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "more9.jpg"));
        tmp.add(new Food(context.getString(R.string.product_one),context.getString(R.string.product_des_one), "more10.jpg"));
        return tmp;
    }

    //Add favorite to history
    static ArrayList<Food> foodsHistory = new ArrayList<>();

    public void addFoodsHistorry(Food food) {
        if(foodsHistory.indexOf(food) > 0) {
            this.foodsHistory.add(0, food);
        }
    }
    public ArrayList<Food> getFoodsHistory(){ return this.foodsHistory; }

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
