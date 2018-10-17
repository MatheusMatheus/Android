package com.example.uc17201124.primeiraaulakotlin

import java.io.Serializable

/**
 * Created by UC17201124 on 10/10/2018.
 */
class Mensagem : Serializable {
    var simbolo: String = ""
    var nomeFormatado: String = ""
    var tipoMoeda: String = ""

    constructor(simbolo : String, nomeFormatado : String, tipoMoeda : String) {
        this.simbolo = simbolo
        this.nomeFormatado = nomeFormatado
        this.tipoMoeda = tipoMoeda
    }
}