package com.example.qfoodv1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class DetailActivity extends AppCompatActivity {
    TextView textView;
    ImageView imh;
    TextView textView2;
    Utils utils;
    ElegantNumberButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        utils = new Utils(getApplication());
        Intent intent = getIntent();
        Food food = (Food) intent.getSerializableExtra("food");
        textView=findViewById(R.id.txt_nameFood_detailAc);
        textView2=findViewById(R.id.txt_desFood_detailAc);
        imh=findViewById(R.id.img_Detail_detailAc);
        textView.setText(food.getName());
        textView2.setText(food.getDescription());
        imh.setImageBitmap(Utils.convertStringToBitmapFromAccess(this,food.getImage()));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn = findViewById(R.id.btn_elegantNumber_detailAc);

        btn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = btn.getNumber();
                Toast.makeText(getApplicationContext(),num,Toast.LENGTH_SHORT).show();
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
}