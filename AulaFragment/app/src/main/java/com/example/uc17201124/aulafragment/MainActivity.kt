package com.example.uc17201124.aulafragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragment_a.setOnClickListener {
            trocarFragment(Fragment_a())
        }

        btnFragment_b.setOnClickListener {
            trocarFragment(Fragment_b())
        }
    }

    fun trocarFragment(fragment : Fragment) {
        // Get the support fragment manager instance
        val manager = supportFragmentManager

        // Begin the fragment transition using support fragment manager
        val transaction = manager.beginTransaction()

        // Replace the fragment on container
        transaction.replace(R.id.fragment_container, fragment)

        transaction.addToBackStack(null)

        // Finish the transition
        transaction.commit()
    }

}
