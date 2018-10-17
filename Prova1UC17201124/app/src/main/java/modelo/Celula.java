package modelo;

import java.io.Serializable;

/**
 * Created by UC17201124 on 03/10/2018.
 */

public class Celula implements Serializable{
    private int imagem;
    private String descricao;

    public Celula(int imagem, String descricao) {
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public String getDescricao() {
        return descricao;
    }
}
