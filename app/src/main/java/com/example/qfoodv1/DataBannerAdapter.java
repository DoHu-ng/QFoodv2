package com.example.qfoodv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataBannerAdapter extends RecyclerView.Adapter<DataBannerAdapter.ViewHolder> {
    ArrayList<DataBanner> dataBanners;
    Context context;

    public DataBannerAdapter(ArrayList<DataBanner> dataBanners, Context context) {
        this.dataBanners = dataBanners;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_row_rccv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textViewName.setText(dataBanners.get(position).getName());
        holder.imageView.setImageResource(dataBanners.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataBanners.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewName;
        ImageView imageView;

        public ViewHolder(View view)
        {
            super(view);
            textViewName = (TextView)view.findViewById(R.id.txtFoodName);
            imageView = (ImageView)view.findViewById(R.id.imageHinh);
        }
    }
}
