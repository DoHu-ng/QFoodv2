package com.example.qfoodv1;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Food> arrayList;
    FoodAdapter furnitureAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);


        listView = (ListView)findViewById(R.id.listView);
        arrayList = Utils.getMockData(FavoriteActivity.this);
        Log.i("abc",arrayList.get(0).toString());
        furnitureAdapter = new FoodAdapter(FavoriteActivity.this,arrayList);
        listView.setAdapter(furnitureAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
