package com.Simpeda.aplikasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import kotlinx.android.synthetic.main.activity_layanan_publik.*

class LayananPublikActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar()?.hide(); //hide the title bar
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layanan_publik)

        Btn_Akte.setOnClickListener() {
            val intent = Intent(this, Suket_Akte_KTP_Activity::class.java)
            startActivity(intent)
        }

        Btn_KTP.setOnClickListener() {
            val intent = Intent(this, Suket_Akte_KTP_Activity::class.java)
            startActivity(intent)
        }
    }
}