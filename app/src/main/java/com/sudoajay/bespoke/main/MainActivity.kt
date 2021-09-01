package com.sudoajay.bespoke.main

import android.os.Build
import android.os.Bundle
import androidx.core.view.WindowInsetsControllerCompat
import androidx.databinding.DataBindingUtil
import com.sudoajay.bespoke.BaseActivity
import com.sudoajay.bespoke.R
import com.sudoajay.bespoke.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity :  BaseActivity() {
    private var isDarkTheme: Boolean = false
    @Inject
    lateinit var viewModel: MainViewModel
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        isDarkTheme = isSystemDefaultOn()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!isDarkTheme) {
                WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars =
                    true
            }

        }
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(R.layout.activity_main)
    }
}