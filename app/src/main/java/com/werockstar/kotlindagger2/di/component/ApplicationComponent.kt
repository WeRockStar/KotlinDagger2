package com.werockstar.kotlindagger2.di.component

import com.werockstar.kotlindagger2.di.module.HttpModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by werockstar on 5/28/2017 AD.
 */
@Singleton
@Component(modules = arrayOf(HttpModule::class))
interface ApplicationComponent {

}