package com.example.qfoodv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<Food> {

    Context context;
    ArrayList<Food>arrayList;

    public FoodAdapter(@NonNull Context context, @NonNull ArrayList<Food> objects) {
        super(context, 0, objects);
        this.context=context;
        this.arrayList= objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.item_favorite, parent,false);

        Food food = arrayList.get(position);

        TextView textView=convertView.findViewById(R.id.txtNameF);
        ImageView imageView=convertView.findViewById(R.id.imageViewF);

        textView.setText(food.getName());

        imageView.setImageBitmap(food.getImage());

        return convertView;
    }
}
