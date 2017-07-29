package com.sample.xxx.di.component

import android.app.Application
import android.content.Context
import com.sample.xxx.App
import com.sample.xxx.di.ApplicationContext
import com.sample.xxx.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(app: App)

    @ApplicationContext fun context(): Context

    fun application(): Application

    //Pref helper
    //Api helper
}