package com.example.kuis1mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private keluragaadapter adapter;
    private ArrayList<keluarga>keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = findViewById(R.id.recycleview);
        adapter = new keluragaadapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData()
    {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga(getDrawable(R.drawable.draw1),"Rudi Susanto","Ayah"));
        keluargaArrayList.add(new keluarga(getDrawable(R.drawable.draw1),"Sjolichah","Ibu"));
        keluargaArrayList.add(new keluarga(getDrawable(R.drawable.draw2),"Dimas Alif Fajar Fadhillah","Anak Ke-1"));
        keluargaArrayList.add(new keluarga(getDrawable(R.drawable.draw3),"Dannisa Asasabillah Adilzah Kinanti","Anak Ke-2"));
        keluargaArrayList.add(new keluarga(getDrawable(R.drawable.draw4),"Danish Zahrah Zayyan Kamila Kinanti","Anak Ke-3"));
    }

}