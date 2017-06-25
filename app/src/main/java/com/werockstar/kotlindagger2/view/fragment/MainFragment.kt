package com.werockstar.kotlindagger2.view.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.werockstar.kotlindagger2.R
import com.werockstar.kotlindagger2.view.activity.MainActivity


class MainFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_main, container, false)

        return view
    }

    fun getMainActivity(): MainActivity = activity as MainActivity

}
