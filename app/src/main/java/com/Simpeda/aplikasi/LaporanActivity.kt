package com.Simpeda.aplikasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import kotlinx.android.synthetic.main.activity_laporan.*
import kotlinx.android.synthetic.main.activity_main.*

class LaporanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar()?.hide(); //hide the title bar
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laporan)

        BtnPosting.setOnClickListener() {
            val intent = Intent(this, PostinganWarga::class.java)
            startActivity(intent)
        }

        BtnWadah.setOnClickListener() {
            val intent = Intent(this, WadahAspirasiActivity::class.java)
            startActivity(intent)
        }
    }
}