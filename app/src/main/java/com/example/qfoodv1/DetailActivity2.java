package com.example.qfoodv1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.util.ArrayList;

public class DetailActivity2 extends AppCompatActivity {
    TextView textView;
    ImageView imh;
    TextView textView2;
    Utils utils;
    ElegantNumberButton btn;
    Button btnFavorite;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        utils = new Utils(getApplication());
        final Intent intent = getIntent();
        final Food food = (Food) intent.getSerializableExtra("food");
        textView=findViewById(R.id.txt_nameFood_detail2Ac);
        textView2=findViewById(R.id.txt_desFood_detail2Ac);
        imh=findViewById(R.id.img_Detail_detail2Ac);
        textView.setText(food.getName());
        textView2.setText(food.getDescription());
        imh.setImageBitmap(Utils.convertStringToBitmapFromAccess(this,food.getImage()));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn = findViewById(R.id.btn_elegantNumber_detail2Ac);
        btnFavorite = findViewById(R.id.btn_Favorite_detail2Ac);

        btn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = btn.getNumber();
                Toast.makeText(getApplicationContext(),num,Toast.LENGTH_SHORT).show();
            }
        });

        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contains(DBHelper.foodsList,food.getName()) == true)
                {
                    Utils.foodsHistory.add(food);
//                    dbHelper.addFoodToFavList(food);
                    Toast.makeText(getApplicationContext(), "Đã thêm vào Favorite List", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Món ăn đã có trong Favorite List", Toast.LENGTH_SHORT).show();
                }
            }
        });
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

    public  boolean contains(ArrayList<Food> list, String name) {
        for (Food item : list) {
            if (item.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }
}