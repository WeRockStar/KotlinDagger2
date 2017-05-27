package com.werockstar.kotlindagger2.di.module

import android.app.Application
import com.werockstar.kotlindagger2.di.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by werockstar on 5/28/2017 AD.
 */

@Module
class ApplicationModule(var application: Application) {

    @Provides
    @Singleton
    @ApplicationContext
    fun provideApplication(): Application = application
}