package com.example.bteaksa2.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bteaksa2.Login.ControllerLogin;
import com.example.bteaksa2.R;

public class LoginActivity extends AppCompatActivity {

    //Nanti kode ini akan dipindahkan ke class main loginActivity
    //Main class ini untuk home dan sementara dipakai untuk login dulu
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        ControllerLogin controllerLogin = new ControllerLogin();
        controllerLogin.prosesLogin(this);
    }
}