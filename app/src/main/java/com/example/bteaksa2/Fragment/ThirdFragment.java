package com.example.bteaksa2.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.bteaksa2.R;
import com.example.bteaksa2.Daftar.ControlerDaftarKost;


public class ThirdFragment extends Fragment {

    ControlerDaftarKost controlerDaftarKost = new ControlerDaftarKost();


    public ThirdFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);


    }


}