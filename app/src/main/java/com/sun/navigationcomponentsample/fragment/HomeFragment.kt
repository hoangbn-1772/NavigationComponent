package com.sun.navigationcomponentsample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.sun.navigationcomponentsample.R
import kotlinx.android.synthetic.main.fragment_home.button_go_detail
import kotlinx.android.synthetic.main.fragment_home.button_go_search

class HomeFragment : Fragment(), OnClickListener {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponents(view)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_go_search -> {
                navController.navigate(R.id.searchFragment)
            }

            R.id.button_go_detail -> {
                navController.navigate(R.id.detailFragment)
            }
        }
    }

    private fun initComponents(view: View) {
        button_go_search?.setOnClickListener(this)
        button_go_detail?.setOnClickListener(this)
        navController = Navigation.findNavController(view)
        /*Moi Activity co graph rieng*/
        navController.navigate(R.id.action_homeFragment_to_loginActivity)
    }

    // Truyen data
}
