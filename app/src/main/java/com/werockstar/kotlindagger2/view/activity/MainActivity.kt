package com.werockstar.kotlindagger2.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.werockstar.kotlindagger2.R
import com.werockstar.kotlindagger2.di.component.ActivityComponent
import com.werockstar.kotlindagger2.di.component.DaggerActivityComponent
import com.werockstar.kotlindagger2.di.module.ActivityModule
import com.werockstar.kotlindagger2.view.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()

        initFragment()
    }

    private fun initFragment() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment())
                .commit()
    }

    fun component(): ActivityComponent = activityComponent
}
