package com.example.week13

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*


class Fragment_first : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_first, container, false)

        return view
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(arguments != null){
            nama = arguments?.getString("Nama")
            Tv.text = nama
            squad = arguments?.getString("Squad")
            Tv2.text = squad
            angkatan = arguments?.getString("Angkatan")
            Tv3.text = angkatan
            hobby = arguments?.getString("Hobby")
            Tv4.text = hobby
        }
    }


    companion object {
        var nama : String?=" Nama"
        var squad : String? = "Squad"
        var angkatan : String?="Angkatan"
        var hobby : String? = "Hobby"


    }
}