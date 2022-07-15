package com.Simpeda.aplikasi

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.btn_login

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar()?.hide(); //hide the title bar
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener() {
            val email = Edit_Email.text.toString()
            val password = Edit_Password.text.toString()
            if (email.isEmpty()|| password.isEmpty()) {
                Toast.makeText(this, "Masukan Email dan Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(email == "bantengmerah@gmail.com" || password == "banteng123"){
                val progressDialog = ProgressDialog(this,
                        R.style.Theme_MaterialComponents_Light_Dialog)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("Loading...")
                progressDialog.show()
                val intent = Intent (this,HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}