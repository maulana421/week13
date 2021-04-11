package com.example.week13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.week13.contoh.ya
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(),ya {
    lateinit var Fragment_second : Fragment_second
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragment(Fragment_first())

        val bottom = findViewById<BottomNavigationView>(R.id.btm)
        val frame = findViewById<FrameLayout>(R.id.framelayout)
        bottom.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.create->{
                    Fragment_second = Fragment_second()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelayout,Fragment_second)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.back->{
                    finish()
                }
            }
            true
        }
    }
    private fun setFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout,fragment)
            .commit()
    }

    override fun setdata(Input: String) {
        val Bundel = Bundle()
        Bundel.putString("Nama",Input)

        val transaksi = this.supportFragmentManager.beginTransaction()
        val firstfragment = Fragment_first()
        firstfragment.arguments = Bundel
        transaksi.replace(R.id.framelayout,firstfragment)
        transaksi.commit()
    }

    override fun setdata2(Input2: String) {
        val Bundel = Bundle()
        Bundel.putString("Squad",Input2)
        val transaksi = this.supportFragmentManager.beginTransaction()
        val firstfragment = Fragment_first()
        firstfragment.arguments = Bundel
        transaksi.add(R.id.framelayout,firstfragment)
        transaksi.commit()

    }

    override fun setdata3(Input3: String) {
        val Bundel = Bundle()
        Bundel.putString("Angkatan",Input3)
        val transaksi = this.supportFragmentManager.beginTransaction()
        val firstfragment = Fragment_first()
        firstfragment.arguments = Bundel
        transaksi.add(R.id.framelayout,firstfragment)
        transaksi.commit()

    }

    override fun setdata4(Input4: String) {
        val Bundel = Bundle()
        Bundel.putString("Hobby",Input4)
        val transaksi = this.supportFragmentManager.beginTransaction()
        val firstfragment = Fragment_first()
        firstfragment.arguments = Bundel
        transaksi.add(R.id.framelayout,firstfragment)
        transaksi.commit()
    }

}