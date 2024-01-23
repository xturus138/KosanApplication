package com.example.bteaksa2.main;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.bteaksa2.Daftar.ControlerDaftarKost;
import com.example.bteaksa2.Fragment.FirstFragment;
import com.example.bteaksa2.Fragment.FourthFragment;
import com.example.bteaksa2.R;
import com.example.bteaksa2.Fragment.SecondFragment;
import com.example.bteaksa2.Fragment.ThirdFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ControlerDaftarKost controllerDaftarKost = new ControlerDaftarKost();
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();
    FourthFragment fourthFragment = new FourthFragment();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);
        bottomNavigationView = findViewById(R.id.MenuBottom);
        getSupportFragmentManager().beginTransaction().replace(R.id.Fragment, firstFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.Fragment, firstFragment).commit();
                    return true;
                } else if (id == R.id.peraturan) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.Fragment, secondFragment).commit();
                    return true;
                } else if (id == R.id.pendaftaran) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.Fragment, thirdFragment).commit();
                    return true;
                } else if (id == R.id.pengumuman) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.Fragment, fourthFragment).commit();
                    return true;
                }
                return false;
            }
        });

    }
}
