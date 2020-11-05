package com.example.qfoodv1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Food> arrayList;
    FoodAdapter furnitureAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        listView = (ListView)findViewById(R.id.listView);
        arrayList = Utils.getMockData(getApplicationContext());
        furnitureAdapter = new FoodAdapter(getApplicationContext(),arrayList);
        listView.setAdapter(furnitureAdapter);
    }
}