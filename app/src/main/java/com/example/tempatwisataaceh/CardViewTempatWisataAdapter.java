package com.example.tempatwisataaceh;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewTempatWisataAdapter extends RecyclerView.Adapter<CardViewTempatWisataAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<TempatWisata> listTempatWisata;

    private ArrayList<TempatWisata> getListTempatWisata() {
        return listTempatWisata;
    }

    public void setListTempatWisata(ArrayList<TempatWisata> listTempatWisata) {
        this.listTempatWisata = listTempatWisata;
    }


    public CardViewTempatWisataAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_tempat_wisata, viewGroup, false);

        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {
        final TempatWisata tW = getListTempatWisata().get(i);

        Glide.with(context)
                .load(tW.getFoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgFoto);

        cardViewViewHolder.tvNama.setText(tW.getNama());
        cardViewViewHolder.tvLokasi.setText(tW.getLokasi());

        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite " + getListTempatWisata().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.btnBagikan.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Bagikan " + getListTempatWisata().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.imgFoto.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Anda Mengklik " + getListTempatWisata().get(position).getNama(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, DetailTempatWisataActivity.class);
                intent.putExtra("nama_tempat", tW.getNama());
                intent.putExtra("foto_tempat", tW.getFoto());
                intent.putExtra("deskripsi", tW.getDeskripsi());
                intent.putExtra("lokasi", tW.getLokasi());
                intent.putExtra("kategori", tW.getKategori());
                intent.putExtra("jamOperasional", tW.getJamOperasional());
                context.startActivity(intent);
            }
        }));
    }


    @Override
    public int getItemCount() {
        return getListTempatWisata().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNama, tvLokasi, tvDeskripsi, tvKategori, tvJamOperasional;
        Button btnFavorite, btnBagikan;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.foto_tempat);
            tvNama = itemView.findViewById(R.id.tv_nama_tempat);
            tvLokasi = itemView.findViewById(R.id.tv_lokasi);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnBagikan = itemView.findViewById(R.id.btn_bagikan);
            tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi);
            tvKategori = itemView.findViewById(R.id.isi_kategori);
            tvJamOperasional = itemView.findViewById(R.id.isi_jamOperasional);
        }
    }
}

