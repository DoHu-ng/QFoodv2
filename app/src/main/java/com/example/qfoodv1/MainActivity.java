package com.example.qfoodv1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this,  R.id.fragment);
//        AppBarConfiguration appBarConfiguration= AppBarConfiguration(setOf(R.id.homeActivity,R.id.cartActivity,R.id.searchActivity,R.id.accountActivity));
//        setupActionBarWithNavController(navController,appBarConfiguration);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

}