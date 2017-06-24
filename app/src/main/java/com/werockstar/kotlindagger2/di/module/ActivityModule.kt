package com.werockstar.kotlindagger2.di.module

import android.app.Activity
import com.werockstar.kotlindagger2.di.ActivityContext
import com.werockstar.kotlindagger2.di.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by werockstar on 5/28/2017 AD.
 */

@Module
class ActivityModule(var activity: Activity) {

    @Provides
    @ActivityScope
    @ActivityContext
    fun provideActivity(): Activity = activity
}