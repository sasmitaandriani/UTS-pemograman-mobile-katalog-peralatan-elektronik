package com.sasmita.katalogperalatanelektronik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnHp,btnKipas,btnKulkas,btnTv;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnHp = findViewById(R.id.btn_buka_Hp);
        btnKipas = findViewById(R.id.btn_buka_Kipas);
        btnKulkas = findViewById(R.id.btn_buka_Kulkas);
        btnTv = findViewById(R.id.btn_buka_Tv);
        btnHp.setOnClickListener(view -> bukaGaleri("Hp"));
        btnKipas.setOnClickListener(view -> bukaGaleri("Kipas"));
        btnKulkas.setOnClickListener(view -> bukaGaleri("Kulkas"));
        btnTv.setOnClickListener(view -> bukaGaleri("Tv"));
    }

    private void bukaGaleri(String jenisPeralatan) {
        Log.d("MAIN","Buka activity Hp");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisPeralatan);
        startActivity(intent);
    }

}