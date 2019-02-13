package com.example.instrumenteddemo

interface LoginContract {
    interface View {
        fun showLoginSuccess()
        fun showLoginError()
    }

    interface Presenter {
        fun performAuthentication(username: String,
                                  password: String)
    }
}