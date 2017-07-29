package com.sample.xxx.di.component


import com.sample.xxx.di.PerActivity
import com.sample.xxx.di.module.ActivityModule
import com.sample.xxx.login.LoginActivity
import dagger.Component

@PerActivity
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(activity: LoginActivity)
}