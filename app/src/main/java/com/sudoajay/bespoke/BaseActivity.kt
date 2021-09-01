package com.sudoajay.bespoke

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.MutableLiveData


open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSystemDefaultOn()
    }

    fun setSystemDefaultOn(){
        AppCompatDelegate.setDefaultNightMode(
            AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
        )
    }

    fun isSystemDefaultOn(): Boolean {
        return resources.configuration.uiMode and
                Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
    }





}