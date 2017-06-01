package com.werockstar.kotlindagger2.di.component

import com.werockstar.kotlindagger2.di.module.ActivityModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by werockstar on 6/1/2017 AD.
 */
@Singleton
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent