package com.example.uc17201124.listviewpersonalizada.model;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by UC17201124 on 05/09/2018.
 */

public class Carro {
    private String fabricante;
    private String modelo;
    private int imagem;

    public Carro(String fabricante, String modelo, int imagem) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.imagem = imagem;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
