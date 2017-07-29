package com.sample.xxx.login

import com.sample.xxx.base.MvpInteractor
import com.sample.xxx.base.MvpPresenter
import com.sample.xxx.base.MvpView
import com.sample.xxx.di.PerActivity

interface LoginMVP {

    interface Interactor : MvpInteractor {
        //server login call
    }

    @PerActivity
    interface Presenter<V : LoginMVP.View, out I : LoginMVP.Interactor>
        : MvpPresenter<V, I> {

        fun onServerLoginClick(email: String, password: String)

    }

    interface View : MvpView {
        fun openMainActivity()
    }
}