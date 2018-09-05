package com.example.uc17201124.segundaaula;

import java.io.Serializable;

/**
 * Created by UC17201124 on 29/08/2018.
 */

public class Carro implements Serializable {
    private String fabricante;
    private String modelo;

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
}
