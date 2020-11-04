package com.example.qfoodv1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class HomeActivity extends Fragment {

    public HomeActivity() {
        // Required empty public constructor

    }
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_activity, container, false);
        //Click ImageButton Favorite and go to FavoriteActivity
        ImageButton imageButtonF = (ImageButton) view.findViewById(R.id.iBtnFavorite);
        imageButtonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), FavoriteActivity.class);
                startActivity(intent);
            }
        });

        //Click ImageButton Drink and go to DrinkActivity
        ImageButton imageButtonD = (ImageButton) view.findViewById(R.id.iBtnDrink);
        imageButtonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), DrinkActivity.class);
                startActivity(intent);
            }
        });

        //Click ImageButton Favorite and go to FavoriteActivity
        ImageButton imageButtonFo = (ImageButton) view.findViewById(R.id.iBtnFood);
        imageButtonFo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), FoodActivity.class);
                startActivity(intent);
            }
        });

        //Click ImageButton Favorite and go to FavoriteActivity
        ImageButton imageButtonM = (ImageButton) view.findViewById(R.id.iBtnMore);
        imageButtonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), MoreActivity.class);
                startActivity(intent);
            }
        });
        //recycler view
        initView(view);
        return  view;
    }

    public void initView(View view){
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<DataBanner> arrayList = new ArrayList<>();
        arrayList.add(new DataBanner(R.drawable.food1, "Food1"));
        arrayList.add(new DataBanner(R.drawable.food2, "Food2"));
        arrayList.add(new DataBanner(R.drawable.food3, "Food3"));
        arrayList.add(new DataBanner(R.drawable.food4, "Food4"));
        DataBannerAdapter dataBannerAdapter = new DataBannerAdapter(arrayList, getContext());
        recyclerView.setAdapter(dataBannerAdapter);
    }
}