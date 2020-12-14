package com.example.qfoodv1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        listView = (ListView)findViewById(R.id.lv_List_foodAc);
        arrayList = Utils.getMockData(getApplicationContext());
        furnitureAdapter = new FoodAdapter(getApplicationContext(),R.layout.item_favorite,arrayList);
        listView.setAdapter(furnitureAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity2.class);
                intent.putExtra("food", arrayList.get(position));
                startActivity(intent);
            }
        });

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