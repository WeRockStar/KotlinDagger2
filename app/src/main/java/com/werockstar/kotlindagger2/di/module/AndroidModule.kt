package com.werockstar.kotlindagger2.di.module

import android.app.Activity
import android.app.Application
import com.werockstar.kotlindagger2.di.ActivityContext
import com.werockstar.kotlindagger2.di.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by werockstar on 5/28/2017 AD.
 */
@Module
class AndroidModule(var activity: Activity) {

    @Provides
    @Singleton
    @ActivityContext
    fun provideApplication(): Activity = activity
}