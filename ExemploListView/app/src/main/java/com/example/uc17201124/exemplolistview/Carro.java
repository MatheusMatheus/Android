package com.example.uc17201124.exemplolistview;

import android.media.Image;

import java.io.Serializable;

/**
 * Created by UC17201124 on 29/08/2018.
 */

public class Carro implements Serializable {
    private String fabricante;
    private String modelo;
    private String image;

    public Carro(String fabricante, String modelo, String imagem) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.image = imagem;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
