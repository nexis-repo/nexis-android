package com.example.nexisandroid.auth.login

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.nexisandroid.R
import com.example.nexisandroid.databinding.ActivityAddUserInfoBinding

class AddUserInfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddUserInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_user_info)

        initView()
    }

    private fun initView() {
        binding.toolbar.toolbarTitle.text = "Add user Details"
    }
}