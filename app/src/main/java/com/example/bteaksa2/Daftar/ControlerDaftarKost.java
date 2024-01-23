package com.example.bteaksa2.Daftar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.bteaksa2.R;
import com.example.bteaksa2.main.HomeActivity;

public class ControlerDaftarKost {
    private static final String TAG = "ControlerDaftarKost";
    ModelDaftarKost model = new ModelDaftarKost();

    public void prosesDaftarKamar(HomeActivity home) {
        Log.d(TAG, "prosesDaftarKamar: Memasuki Method");
        TextView namaLengkap = home.findViewById(R.id.namaLengkap);
        TextView noHp = home.findViewById(R.id.noHp);
        TextView tglMasuk = home.findViewById(R.id.tanggalMasuk);
        TextView alamat = home.findViewById(R.id.alamat);
        Button button = home.findViewById(R.id.daftarThird);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Memasuki Pengecekan");
                if (isEmpty(namaLengkap) || isEmpty(noHp) || isEmpty(tglMasuk) || isEmpty(alamat)) {
                    Toast.makeText(view.getContext(), "Data Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                } else {
                    Log.d(TAG, "onClick: Mengirim Data Pendaftaran Kost");
                    Toast.makeText(view.getContext(), "Data Terkirim!", Toast.LENGTH_SHORT).show();
                    model.setNamaLengkap(namaLengkap.getText().toString());
                    model.setNoWhatsapp(noHp.getText().toString());
                    model.setAlamat(alamat.getText().toString());
                    model.setTglMasuk(tglMasuk.getText().toString());
                }
            }
        });
    }

    private boolean isEmpty(TextView textView) {
        return textView.getText().toString().isEmpty();
    }
}
