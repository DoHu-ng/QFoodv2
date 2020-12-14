package com.example.qfoodv1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DBHelper {
    Context context;
    String dbName = "FoodDB.db";
    static ArrayList<Food> foodsList = new ArrayList<Food>();

    public DBHelper(Context context) {
        this.context = context;
    }
    private SQLiteDatabase openDB() {
        return context.openOrCreateDatabase(dbName, Context.MODE_PRIVATE, null);
    }
    private void closeDB(SQLiteDatabase db) {
        db.close();
    }
    public void createTable() {
        SQLiteDatabase db = openDB();
        String sqlFood = "CREATE TABLE IF NOT EXISTS tblFood (" +
                " ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " Name TEXT," +
                " Image TEXT," +
                " Description TEXT);" ;
        db.execSQL(sqlFood);
        closeDB(db);
    }
    public ArrayList<Food> getALLFoodInListFav() {
        SQLiteDatabase db = openDB();
        String sql = "select * from tblFood";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String name = csr.getString(1);
                    String image = csr.getString(2);
                    String description = csr.getString(3);

                    foodsList.add(new
                            Food(id,name,image,description));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return foodsList;
    }

    public void addFoodToFavList(Food food){
        SQLiteDatabase db = openDB();
            this.foodsList.add(0, food);
            ContentValues cv = new ContentValues();
            cv.put("Name", food.getName());
            cv.put("Image", food.getImage());
            cv.put("Description", food.getDescription());
            db.insert("tblFood", null, cv);

        closeDB(db);
    }
}
