package com.example.uc17201124.exemplolistview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class SegundaActivity extends Activity {

    private TextView fabricante;
    private TextView modelo;
    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        fabricante = findViewById(R.id.fabricante);
        modelo = findViewById(R.id.modelo);
        imagem = findViewById(R.id.imagem);

        Carro carro = (Carro)getIntent().getSerializableExtra("carro");
        fabricante.setText(carro.getFabricante());
        modelo.setText(carro.getModelo());
        buscaImagem(carro.getImage());

    }

    private void buscaImagem(String endereco) {
        URL url = null;
        try {
            url = new URL(endereco);
            Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            imagem.setImageBitmap(bmp);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
