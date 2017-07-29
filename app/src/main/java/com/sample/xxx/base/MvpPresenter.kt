package com.sample.xxx.base

interface MvpPresenter<V: MvpView, out I: MvpInteractor> {

    fun onAttach(mvpView: V)

    fun onDetach()

    fun getMvpView(): V?

    fun getInteractor(): I
}