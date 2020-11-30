package com.sasmita.katalogperalatanelektronik;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.sasmita.katalogperalatanelektronik.model.Peralatan;

public class GaleriActivity extends AppCompatActivity {

    List<Peralatan> peralatans;
    int indeksTampil = 0;
    String jenisPeralatan;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txMerek,txNama,txHarga,txDeskripsi,txJudul;
    ImageView ivFotoPeralatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_barang);
        Intent intent = getIntent();
        jenisPeralatan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        peralatans = DataProvider.getPeralatanByTipe(this,jenisPeralatan);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> peralatanPertama());
        btnTerakhir.setOnClickListener(view -> peralatanTerakhir());
        btnSebelumnya.setOnClickListener(view -> peralatanSebelumnya());
        btnBerikutnya.setOnClickListener(view -> peralatanBerikutnya());

        txMerek = findViewById(R.id.txMerek);
        txNama = findViewById(R.id.txNama);
        txHarga = findViewById(R.id.txHarga);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoPeralatan = findViewById(R.id.gambarPeralatan);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("peralatan elektronik "+jenisPeralatan);
    }


    private void tampilkanProfil() {
        Peralatan k = peralatans.get(indeksTampil);
        Log.d("ANJING","Menampilkan kipas "+k.getMerek());
        txMerek.setText(k.getMerek());
        txNama.setText(k.getNama());
        txHarga.setText(k.getHarga());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoPeralatan.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void peralatanPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void peralatanTerakhir() {
        int posAkhir = peralatans.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void peralatanBerikutnya() {
        if (indeksTampil == peralatans.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void peralatanSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}