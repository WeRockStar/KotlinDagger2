package com.werockstar.kotlindagger2.di.component

import com.werockstar.kotlindagger2.view.activity.MainActivity
import com.werockstar.kotlindagger2.di.module.ApplicationModule
import com.werockstar.kotlindagger2.di.module.HttpModule
import com.werockstar.kotlindagger2.view.fragment.MainFragment
import dagger.Component
import javax.inject.Singleton

/**
 * Created by werockstar on 5/28/2017 AD.
 */

@Singleton
@Component(modules = arrayOf(HttpModule::class, ApplicationModule::class))
interface ApplicationComponent {

    fun inject(activity: MainActivity)
    fun inject(fragment: MainFragment)
}