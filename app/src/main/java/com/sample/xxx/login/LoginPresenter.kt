package com.sample.xxx.login

import com.sample.xxx.base.BasePresenter
import javax.inject.Inject

class LoginPresenter<V: LoginMVP.View, out I: LoginMVP.Interactor>
@Inject constructor(mvpInteractor: I) : BasePresenter<V, I>(mvpInteractor),
        LoginMVP.Presenter<V, I> {

    override fun onServerLoginClick(email: String, password: String) {
        //validate email and password

        //Perform login action

        //On success, open Main
        getMvpView()?.openMainActivity()
    }
}