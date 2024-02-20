package com.example.bteaksa2.Login;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bteaksa2.Daftar.ModelDaftar;
import com.example.bteaksa2.R;
import com.example.bteaksa2.main.HomeActivity;
import com.example.bteaksa2.main.LoginActivity;
import com.example.bteaksa2.main.daftarActivity;


public class ControllerLogin {
    //untuk membuat log
    private static final String TAG = "Controller";
    
    //Membuat object model agar bisa mengambil data dari class ModelLogin
    ModelLogin model = new ModelLogin();
    ModelDaftar modelDaftar = new ModelDaftar();

    public void prosesLogin(LoginActivity main){
        //Mengambil Inputan Data dari login.xml
        TextView username = main.findViewById(R.id.usernameLogin);
        TextView password = main.findViewById(R.id.passwordLogin);
        Button loginButton = main.findViewById(R.id.loginButton);
        Button daftarButton = main.findViewById(R.id.daftarButton);
        Button kembaliButton = main.findViewById(R.id.kembaliLoginButton);

        //mengambil variabel dari modelDaftar
        model.setUsername(modelDaftar.getNamaUser());
        model.setPassword(modelDaftar.getPassword());

        //Proses jika klik loginButton
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: loginButton");
                if(username.getText().toString().equals(model.getUsername()) && password.getText().toString().equals(model.getPassword())){
                    Toast.makeText(view.getContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(view.getContext(), "Login Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Proses jika klik daftar Button
        daftarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: daftarButton");
                //Untuk Pindah ke main daftarActivity
                Intent intent = new Intent(view.getContext(), daftarActivity.class);
                view.getContext().startActivity (intent);
            }
        });

        //Proses jika klik kembali button
        kembaliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: kembaliLoginButton");
                Intent intent = new Intent(view.getContext(), HomeActivity.class);
                view.getContext().startActivity(intent);
            }
        });

    }
}
