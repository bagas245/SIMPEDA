package com.Simpeda.aplikasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import kotlinx.android.synthetic.main.activity_informasi_kesehatan.*


class InformasiKesehatanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar()?.hide(); //hide the title bar
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_kesehatan)

        btn_Kesehatan1.setOnClickListener() {
            val intent = Intent(this, DetailKesehatanActivity::class.java)
            startActivity(intent)
        }
    }
}