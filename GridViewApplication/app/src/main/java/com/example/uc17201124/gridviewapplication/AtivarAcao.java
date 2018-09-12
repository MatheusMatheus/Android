package com.example.uc17201124.gridviewapplication;

/**
 * Created by UC17201124 on 12/09/2018.
 */

public class AtivarAcao {
    private int posicao;
    private String texto;

    public AtivarAcao(int posicao, String texto) {
        this.posicao = posicao;
        this.texto = texto;
    }

    public int getPosicao() {
        return posicao;
    }

    public String getTexto() {
        return texto;
    }

}
