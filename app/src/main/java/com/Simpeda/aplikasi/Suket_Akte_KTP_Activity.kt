package com.Simpeda.aplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

class Suket_Akte_KTP_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar()?.hide(); //hide the title bar
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suket__akte__k_t_p_)
    }
}