package com.example.qfoodv1;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navView;
    boolean status=false;
    MenuItem menuItem;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navView = findViewById(R.id.nav_view);
        loadFragment(new HomeActivity());
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setSelectedItemId(R.id.homeActivity);

        //dbHelper.createTable();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener
            mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.cartActivity:
                    getSupportActionBar().setTitle("Shopping Cart");
                    fragment = new CartActivity();
                    loadFragment(fragment);
                    return true;
                case R.id.homeActivity:
                    getSupportActionBar().setTitle("Home");
                    fragment = new HomeActivity();
                    loadFragment(fragment);
                    return true;
                case R.id.searchActivity:
                    getSupportActionBar().setTitle("Search");
                    fragment = new SearchActivity();
                    loadFragment(fragment);
                    return true;
                case R.id.accountActivity:
                    getSupportActionBar().setTitle("Account");
                    fragment = new AccountActivity();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}