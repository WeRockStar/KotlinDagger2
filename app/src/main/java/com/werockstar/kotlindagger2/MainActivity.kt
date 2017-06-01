package com.werockstar.kotlindagger2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.werockstar.kotlindagger2.di.component.ActivityComponent
import com.werockstar.kotlindagger2.di.component.DaggerActivityComponent
import com.werockstar.kotlindagger2.di.module.ActivityModule

class MainActivity : AppCompatActivity() {

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()
    }

    fun component(): ActivityComponent = activityComponent
}
