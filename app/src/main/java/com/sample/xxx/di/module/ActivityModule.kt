package com.sample.xxx.di.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.sample.xxx.di.ActivityContext
import com.sample.xxx.di.PerActivity
import com.sample.xxx.login.LoginInteractor
import com.sample.xxx.login.LoginMVP
import com.sample.xxx.login.LoginPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val activity: AppCompatActivity) {

    @Provides
    @ActivityContext
    fun provideContext(): Context = activity

    @Provides
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    @PerActivity
    fun provideLoginPresenter(presenter: LoginPresenter<LoginMVP.View, LoginMVP.Interactor>):
            LoginMVP.Presenter<LoginMVP.View, LoginMVP.Interactor> {
        return presenter
    }

    @Provides
    @PerActivity
    fun provideLoginMvpInteractor(interactor: LoginInteractor):
            LoginMVP.Interactor {
        return interactor
    }

}