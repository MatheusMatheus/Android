package com.example.uc17201124.segundaaula;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener{
    Button button;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnOK);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Carro carro = new Carro();
        carro.setFabricante("FIAT");
        carro.setModelo("UNO");

        intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("nome", "Matheus");
        intent.putExtra("objCarro", carro);

        startActivity(intent);
    }
}
