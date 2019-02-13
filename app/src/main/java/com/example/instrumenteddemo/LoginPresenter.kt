package com.example.instrumenteddemo

class LoginPresenter(private val view: LoginContract.View) : LoginContract.Presenter {


    override fun performAuthentication(username: String, password: String) {
        if (password.length > 5) {
            view.showLoginSuccess()
        } else {
            view.showLoginError()
        }
    }

}