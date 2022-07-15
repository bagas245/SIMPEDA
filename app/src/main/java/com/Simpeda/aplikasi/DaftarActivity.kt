package com.Simpeda.aplikasi

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_daftar.*
import kotlinx.android.synthetic.main.activity_main.btn_signup

class DaftarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar()?.hide(); //hide the title bar
        setContentView(R.layout.activity_daftar)

        btn_signup.setOnClickListener() {
            val nama = Edit_Nama.text.toString()
            val email = Edit_Email.text.toString()
            val password = Edit_Password.text.toString()
            val konfirmasipassword = Edit_KonfirmasiPassword.text.toString()
            if (nama.isEmpty() || email.isEmpty() || konfirmasipassword.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Masukan Semua Dulu bang", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (nama == "bantengmerah" || email == "bantengmerah@gmail.com" || konfirmasipassword == "banteng123" || password == "banteng123") {
                val progressDialog = ProgressDialog(this,
                        R.style.Theme_MaterialComponents_Light_Dialog)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("Loading...")
                progressDialog.show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}