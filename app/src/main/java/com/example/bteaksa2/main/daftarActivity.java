package com.example.bteaksa2.main;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bteaksa2.Daftar.ControllerDaftar;
import com.example.bteaksa2.R;

public class daftarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);

        ControllerDaftar controllerDaftar = new ControllerDaftar();
        controllerDaftar.prosesDaftar(this);

    }
}
