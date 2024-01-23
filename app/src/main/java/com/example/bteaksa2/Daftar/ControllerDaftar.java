package com.example.bteaksa2.Daftar;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bteaksa2.R;
import com.example.bteaksa2.main.LoginActivity;
import com.example.bteaksa2.main.daftarActivity;

public class ControllerDaftar {
    private static final String TAG = "Controller";
    ModelDaftar model = new ModelDaftar();

    public void prosesDaftar(daftarActivity daftar){
        Log.d(TAG, "prosesDaftar: MasukMethod");

        TextView nama = daftar.findViewById(R.id.InputUsername);
        TextView noWhatsapp = daftar.findViewById(R.id.InputNoHp);
        TextView password = daftar.findViewById(R.id.InputPassword);
        TextView confirmPassword = daftar.findViewById(R.id.InputConfirmPassword);
        Button kirimButton = daftar.findViewById(R.id.KirimButton);
        Button kembali = daftar.findViewById(R.id.kembaliButton);

        Button cek = daftar.findViewById(R.id.cek);

        kirimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: kirimButton");
                if(nama.getText().toString().isEmpty()){
                    Toast.makeText(v.getContext(), "Nama Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
                } else if (noWhatsapp.getText().toString().isEmpty()) {
                    Toast.makeText(v.getContext(), "Nomor Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
                } else if (password.getText().toString().isEmpty()) {
                    Toast.makeText(v.getContext(), "Password Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
                } else if (confirmPassword.getText().toString().isEmpty()) {
                    Toast.makeText(v.getContext(), "Confirm Password Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
                } else if (!password.getText().toString().equals(confirmPassword.getText().toString())) {
                    Toast.makeText(v.getContext(), "Password Tidak Sama!", Toast.LENGTH_SHORT).show();
                } else {
                    Log.d(TAG, "Mengirim: Data ke Model ");
                    Toast.makeText(v.getContext(), "Data Berhasil Dikirim", Toast.LENGTH_SHORT).show();
                    model.setNamaUser(nama.getText().toString());
                    model.setPassword(password.getText().toString());
                    model.setNomorWhatsapp(noWhatsapp.getText().toString());
                    model.setConfirmPassword(confirmPassword.getText().toString());
                }
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: kembaliButton");
                Intent intent = new Intent(v.getContext(), LoginActivity.class);
                v.getContext().startActivity(intent);
            }
        });


        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: cek");
                Toast.makeText(view.getContext(),model.getPassword(),Toast.LENGTH_SHORT).show();
            }
        });




    }

}
