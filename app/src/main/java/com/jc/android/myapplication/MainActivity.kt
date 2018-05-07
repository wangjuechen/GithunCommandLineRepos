package com.jc.android.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Dialog")
        builder.setMessage("Hello World")
        builder.setPositiveButton("ok") { _, _ ->

            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }

        builder.setNegativeButton("Cancel", { _, _ ->

        })
        val dialog = builder.create()
        dialog.show()
    }
}
