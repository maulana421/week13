package com.example.week13

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.week13.contoh.ya
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.view.*


class Fragment_second : Fragment() {
    private lateinit var komukasi : ya


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        komukasi = activity as ya
        view.Buttonsave.setOnClickListener {
            komukasi.setdata(view.etnama.text.toString())
            komukasi.setdata2(view.etsquad.text.toString())
            komukasi.setdata3(view.etangkatan.text.toString())
            komukasi.setdata4(view.ethobby.text.toString())
        }

        return view
    }



    companion object {

    }
}