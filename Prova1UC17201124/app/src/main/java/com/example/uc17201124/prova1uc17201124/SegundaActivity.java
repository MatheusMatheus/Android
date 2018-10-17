package com.example.uc17201124.prova1uc17201124;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adapter.AdapterCelula;
import adapter.AdapterCelulaListView;
import modelo.Celula;

public class SegundaActivity extends Activity {
    private ListView listView;
    private AdapterCelulaListView adapterCelula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Celula celula = (Celula)getIntent().getSerializableExtra("celula");

        List<Celula> celulas = new ArrayList<>();
        celulas.add(celula);

        this.adapterCelula = new AdapterCelulaListView(this, celulas);
        listView = findViewById(R.id.listView);
        listView.setAdapter(this.adapterCelula);

    }
}
