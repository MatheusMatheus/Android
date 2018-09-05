package com.example.uc17201124.exemplolistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ArrayAdapter arrayAdapter;
    private List<Carro> carros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] array = getResources().getStringArray(R.array.arrayCarros);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array);
        listView = findViewById(R.id.lista);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

       carros = PopulaListaCarros.popular(carros, array);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String[] array = getResources().getStringArray(R.array.arrayCarros);
        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("carro", carros.get(i));
        startActivity(intent);
    }
}
