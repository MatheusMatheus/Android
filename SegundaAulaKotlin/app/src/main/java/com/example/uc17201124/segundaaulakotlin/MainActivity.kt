package com.example.uc17201124.segundaaulakotlin

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var map = HashMap<String, Boolean>()
        var sharedPreference = getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
        var editor = sharedPreference.edit()
        map.put("logado", false)


        btnEntrar.setOnClickListener{
            if(map.get("logado")!! == false) {
                var intent = Intent(this, BemVindoActivity::class.java)
                map.put("logado", true)
                editor.putBoolean("logado", true)
                editor.commit()
                startActivity(intent)
            } else {
                var intent = Intent(this, MenuPrincipalActivity::class.java)
                startActivity(intent)
            }
        }


/*

        btnSet.setOnClickListener {
            var editor = sharedPreference.edit()
            editor.putString("nome", "Matheus")
            editor.commit()
        }

        btnGet.setOnClickListener {
            var nome = sharedPreference.getString("nome", "defaultName")
            txt.setText(nome)
        }

        btnClear.setOnClickListener {
            sharedPreference.edit().clear().commit()

        }*/
    }
}
