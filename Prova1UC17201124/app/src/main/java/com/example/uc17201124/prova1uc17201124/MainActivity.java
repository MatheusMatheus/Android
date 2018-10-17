package com.example.uc17201124.prova1uc17201124;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adapter.AdapterCelula;
import modelo.Celula;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{
    private AdapterCelula adapter;
    private GridView gridView;
    private CheckBox checkBox;
    private  List<Celula> celulas;
    private List<Celula> celulasClicadas;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.celulasClicadas = new ArrayList<>();

        this.celulas = new ArrayList<>();
        celulas.add(new Celula(R.drawable.celta, "Celtinha 2010"));
        celulas.add(new Celula(R.drawable.gol, "Gol quadrado 1998"));
        celulas.add(new Celula(R.drawable.maverick, "Maveco 1977"));
        celulas.add(new Celula(R.drawable.opala, "Opala 6 caneco 1976"));
        celulas.add(new Celula(R.drawable.tesla, "Tesla 2099"));
        celulas.add(new Celula(R.drawable.uno, "Unin com escada"));


        this.adapter = new AdapterCelula(this, this.celulas);
        this.gridView = findViewById(R.id.gridImagens);
        this.botao = findViewById(R.id.ok);
        this.botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(this, SegundaActivity.class);
                intent.putExtra("celulas", this.celulasClicadas);

                startActivity(intent);
            }
        });

        this.gridView.setAdapter(this.adapter);
        this.gridView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Celula celula = this.celulas.get(i);
        this.celulasClicadas.add(celula);
    }
}
