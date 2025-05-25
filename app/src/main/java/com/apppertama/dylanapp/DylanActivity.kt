package com.apppertama.dylanapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DylanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dylan)

        val inputNama = findViewById<EditText>(R.id.inputNama)
        val buttonTampil = findViewById<Button>(R.id.buttonTampil)

        buttonTampil.setOnClickListener {
            val nama = inputNama.text.toString()
            val pesan = if (nama.isNotEmpty()) "Halo, $nama!" else "Silakan isi nama terlebih dahulu"
            Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show()
        }
    }
}
