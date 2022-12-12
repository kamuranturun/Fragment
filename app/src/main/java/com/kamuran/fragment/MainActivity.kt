package com.kamuran.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnFragment1:Button
    lateinit var btnFragment2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragment1= findViewById(R.id.btnFragment1)
        btnFragment2= findViewById(R.id.btnFragment2)
        btnFragment1.setOnClickListener(this)
        btnFragment2.setOnClickListener(this)
        //fragment , bir aktivity içerisinde kendi yaşam döngüleri olan parçalardır

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnFragment1->{
                val ft= supportFragmentManager.beginTransaction()//başlatma
                val f1= BlankFragment1()
                f1.deger="selam gönderilen değer "
                ft.replace(R.id.container,f1)
                ft.commit()
            }
            R.id.btnFragment2->{

                val ft=supportFragmentManager.beginTransaction()
                val f2=BlankFragment2()
                ft.replace(R.id.container,f2)
                ft.commit()
            }
        }
    }
}