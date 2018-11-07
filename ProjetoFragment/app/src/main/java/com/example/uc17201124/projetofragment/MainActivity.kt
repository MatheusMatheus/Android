package com.example.uc17201124.projetofragment

import android.app.Activity
import android.net.Uri
import android.os.Bundle
import com.example.uc17201124.projetofragment.BlankFragment.OnFragmentInteractionListener

class MainActivity : Activity(), OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
