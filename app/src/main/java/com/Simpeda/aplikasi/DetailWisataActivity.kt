package com.Simpeda.aplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

class DetailWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar()?.hide(); //hide the title bar
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_wisata)
    }
}