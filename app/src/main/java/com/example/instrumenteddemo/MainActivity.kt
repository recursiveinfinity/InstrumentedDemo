package com.example.instrumenteddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LoginContract.View {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter: LoginContract.Presenter = LoginPresenter(this);
        btnLogin.setOnClickListener {
            presenter.performAuthentication(etUserName.text.toString(),
                etPassword.text.toString())
        }
    }

    override fun showLoginError() {
        tvStatus.text = "Error!"
    }

    override fun showLoginSuccess() {
        tvStatus.text = "Success!"
    }


}
