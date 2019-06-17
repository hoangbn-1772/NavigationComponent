package com.sun.navigationcomponentsample.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sun.navigationcomponentsample.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initComponents()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_login -> doLogin()
        }
    }

    private fun initComponents(){
        button_login?.setOnClickListener(this)
    }

    private fun doLogin(){

    }
}
