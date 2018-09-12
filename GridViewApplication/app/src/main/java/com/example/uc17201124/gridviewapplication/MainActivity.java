package com.example.uc17201124.gridviewapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adapter.TextAdapter;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{
    TextAdapter arrayAdapter;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] acoes = {"1", "2", "3", "4", "5", "6", "7", "8"};
        List<AtivarAcao> ativadorAcoes = new ArrayList<>();
        ativadorAcoes.add(new AtivarAcao(0, "google.streetview:cbll=46.414382,10.013988"));
        ativadorAcoes.add(new AtivarAcao(1, "123456887"));
        ativadorAcoes.add(new AtivarAcao(2, "Olá, tudo bem?"));
        ativadorAcoes.add(new AtivarAcao(3, "http://www.ucb.br"));

        gridView = findViewById(R.id.numeros);
        arrayAdapter = new TextAdapter(this, ativadorAcoes);
        gridView.setAdapter(arrayAdapter);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = null;
        int itemSelecionado = 0;

        Toast.makeText(this, String.valueOf(i), Toast.LENGTH_SHORT).show();
        switch (i) {
            case 0:
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                break;

            case 1:
                String numero = "1234567899";
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + numero));
                break;

            case 2:
                String texto = "Olá, tudo bem?";
                intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, texto);
                intent.setType("text/plain");
                break;

            case 3:
                String url = "http://www.ucb.br";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                break;
        }

        if(intent != null && intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
    }
}
