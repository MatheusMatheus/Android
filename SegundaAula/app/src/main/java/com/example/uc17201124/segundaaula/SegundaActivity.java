package com.example.uc17201124.segundaaula;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class SegundaActivity extends Activity {
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto = findViewById(R.id.texto);

        String nome = getIntent().getStringExtra("nome");

        Carro carro = (Carro) getIntent().getSerializableExtra("objCarro");

        texto.setText(carro.getModelo());
    }

}
