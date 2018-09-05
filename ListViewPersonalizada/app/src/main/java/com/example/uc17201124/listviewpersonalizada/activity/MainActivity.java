package com.example.uc17201124.listviewpersonalizada.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.uc17201124.listviewpersonalizada.R;
import com.example.uc17201124.listviewpersonalizada.adapter.AdapterCarro;
import com.example.uc17201124.listviewpersonalizada.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView listViewCarro;
    private AdapterCarro arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Tesla", "Algum modelo da Tesla", R.drawable.tesla));
        carros.add(new Carro("Wolksvagen", "Gol", R.drawable.gol));
        carros.add(new Carro("Ford", "Maverick", R.drawable.maverick));
        carros.add(new Carro("Chevrolet", "Opala", R.drawable.opala));
        carros.add(new Carro("Fiat", "Uno", R.drawable.uno));

        this.arrayAdapter = new AdapterCarro(this, carros);

        listViewCarro = findViewById(R.id.listViewCarro);
        listViewCarro.setAdapter(arrayAdapter);

    }
}
