package com.example.tempatwisataaceh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<TempatWisata> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        list.addAll(TempatWisataData.getListData());
        showRecyclerCardView();

        AppCenter.start(getApplication(), "05356320-0582-4b09-8219-3be6ddf866f4", Analytics.class, Crashes.class);
    }

    private void showRecyclerCardView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewTempatWisataAdapter cardViewTempatWisataAdapter = new CardViewTempatWisataAdapter(this);
        cardViewTempatWisataAdapter.setListTempatWisata(list);
        recyclerView.setAdapter(cardViewTempatWisataAdapter);
    }
}
