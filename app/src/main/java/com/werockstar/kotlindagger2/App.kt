package com.werockstar.kotlindagger2

import android.app.Application
import com.werockstar.kotlindagger2.di.component.ApplicationComponent
import com.werockstar.kotlindagger2.di.component.DaggerApplicationComponent
import com.werockstar.kotlindagger2.di.module.ApplicationModule

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