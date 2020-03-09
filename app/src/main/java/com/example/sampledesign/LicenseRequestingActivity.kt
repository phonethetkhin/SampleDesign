package com.example.sampledesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.sampledesign.Fragments.NoLicenseFragment

class LicenseRequestingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction:FragmentTransaction=supportFragmentManager.beginTransaction()
        val fragment: NoLicenseFragment =
            NoLicenseFragment()

        if(savedInstanceState==null)
        {
            transaction.replace(R.id.fmlContainer,fragment).addToBackStack(null).commit()
        }

    }
}
