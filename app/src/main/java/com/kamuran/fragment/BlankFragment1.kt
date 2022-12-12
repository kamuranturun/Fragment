package com.kamuran.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class BlankFragment1 : Fragment() {

    var deger:String?= null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val v=  inflater.inflate(R.layout.fragment_blank1, container, false)
       var tv = v?.findViewById<TextView>(R.id.textView1)
        tv?.text=deger
        return v
    }



}