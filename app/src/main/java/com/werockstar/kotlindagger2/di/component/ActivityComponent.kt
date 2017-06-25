package com.werockstar.kotlindagger2.di.component

import com.werockstar.kotlindagger2.di.module.ActivityModule
import com.werockstar.kotlindagger2.view.fragment.MainFragment
import dagger.Component
import javax.inject.Singleton

/**
 * Created by werockstar on 6/1/2017 AD.
 */
@Singleton
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(fragment: MainFragment)
}