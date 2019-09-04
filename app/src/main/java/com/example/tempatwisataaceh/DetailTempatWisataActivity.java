package com.example.tempatwisataaceh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class DetailTempatWisataActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_tempat_wisata);

        getIncomingIntent();

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);
    }

    private void getIncomingIntent() {

        if (getIntent().hasExtra("foto_tempat") && getIntent().hasExtra("nama_tempat") && getIntent().hasExtra("deskripsi") && getIntent().hasExtra("lokasi") && getIntent().hasExtra("kategori") && getIntent().hasExtra("jamOperasional")) {

            String namaTempat = getIntent().getStringExtra("nama_tempat");
            String fotoTempat = getIntent().getStringExtra("foto_tempat");
            String deskripsi = getIntent().getStringExtra("deskripsi");
            String lokasi = getIntent().getStringExtra("lokasi");
            String kategori = getIntent().getStringExtra("kategori");
            String jamOperasional = getIntent().getStringExtra("jamOperasional");

            setImage(namaTempat, fotoTempat, deskripsi, lokasi, kategori, jamOperasional);


        }
    }


    private void setImage(String namaTempat, String fotoTempat, String deskripsi, String lokasi, String kategori, String jamOperasional) {

        TextView name = findViewById(R.id.tv_nama_tempat_detail);
        name.setText(namaTempat);

        TextView location = findViewById(R.id.lokasi_detail);
        location.setText(lokasi);

        TextView description = findViewById(R.id.tv_deskripsi);
        description.setText(deskripsi);

        TextView category = findViewById(R.id.isi_kategori);
        category.setText(kategori);

        TextView hour = findViewById(R.id.isi_jamOperasional);
        hour.setText(jamOperasional);

        ImageView image = findViewById(R.id.foto_tempat_detail);
        Glide.with(this)
                .asBitmap()
                .load(fotoTempat)
                .into(image);
    }
}
