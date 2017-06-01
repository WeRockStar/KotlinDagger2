package com.werockstar.kotlindagger2

import android.app.Application
import com.werockstar.kotlindagger2.di.component.ApplicationComponent
import com.werockstar.kotlindagger2.di.component.DaggerApplicationComponent
import com.werockstar.kotlindagger2.di.module.ApplicationModule

/**
 * Created by werockstar on 6/1/2017 AD.
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    companion object {
        lateinit var appComponent: ApplicationComponent
        val component: ApplicationComponent get() = appComponent
    }
}