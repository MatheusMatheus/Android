package com.example.uc17201124.primeiraaulakotlin

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Type

class MainActivity : Activity() {
     val url = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/Moedas?format=json"
    //val url = "http://www.google.com"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnOk.setOnClickListener {
            var mensagens: Array<Mensagem>
            
            val que = Volley.newRequestQueue(this@MainActivity)
            val req = StringRequest(
                    Request.Method.GET,
                    url,
                    Response.Listener {
                        //response -> tvMensagem.setText(response.toString())
                        response -> mensagens = convertJsonToObject(response.toString())

                    },
                    Response.ErrorListener {
                        Toast.makeText(this, "Erro", Toast.LENGTH_LONG).show()
                    }
            )
            que.add(req)

        }
    }

    fun convertJsonToObject(jsonString: String) : Array<Mensagem> {
        var gson = Gson()
        var json = jsonString;
        val groupListType = object : TypeToken<ArrayList<GroupModel>>() {

        }.type
        var arrayMensagem = gson.fromJson(jsonString, Array<Mensagem>::class.java)
        return arrayMensagem
    }
}
