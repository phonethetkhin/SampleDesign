package com.example.sampledesign.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sampledesign.R
import kotlinx.android.synthetic.main.fragment_license_requesting.view.*

/**
 * A simple [Fragment] subclass.
 */
class LicenseRequestingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_license_requesting, container, false)
        v.btnRequest.setOnClickListener {
    val fragment: RequestPendingFragment =
        RequestPendingFragment()
            activity?.supportFragmentManager!!.beginTransaction().replace(R.id.fmlContainer,fragment).commit()
        }
        return v

    }

}
