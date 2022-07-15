package com.Simpeda.aplikasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar()?.hide(); //hide the title bar
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_InformasiDesa.setOnClickListener() {
            val intent = Intent(this, InformasiActivity::class.java)
            startActivity(intent)
        }

        btn_ObjekWisata.setOnClickListener() {
            val intent = Intent(this, WisataActivity::class.java)
            startActivity(intent)
        }

        btn_LayananPublik.setOnClickListener() {
            val intent = Intent(this, LayananPublikActivity::class.java)
            startActivity(intent)
        }

        btn_LaporanMasyarakat.setOnClickListener() {
            val intent = Intent(this, LaporanActivity::class.java)
            startActivity(intent)
        }

        btn_InformasiKesehatan.setOnClickListener() {
            val intent = Intent(this, InformasiKesehatanActivity::class.java)
            startActivity(intent)
        }
    }
}