package com.example.sampledesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        imgSetting.setOnClickListener {
            val i:Intent=Intent(this,LicenseRequestingActivity::class.java)
            startActivity(i)


        }

        btnRequest.setOnClickListener {
           // val i:Intent=Intent(this,)

        }

    }
}
