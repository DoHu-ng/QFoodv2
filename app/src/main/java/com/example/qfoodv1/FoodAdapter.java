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
    int layoutresoure;

    public FoodAdapter(Context context, int layoutresoure, ArrayList<Food> arrayList) {
        super(context, layoutresoure, arrayList);
        this.context=context;
        this.layoutresoure=layoutresoure;
        this.arrayList=arrayList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.item_favorite, parent,false);

        Food food = arrayList.get(position);

        TextView textView=convertView.findViewById(R.id.txtNameF);
        TextView textView2=convertView.findViewById(R.id.txtDesF);
        ImageView imageView=convertView.findViewById(R.id.imageViewF);

        textView.setText(food.getName());
        textView2.setText(food.getDescription());
        imageView.setImageBitmap(Utils.convertStringToBitmapFromAccess(getContext(), food.getImage()));

        return convertView;
    }
}
