package com.tryden12.demominiclerkie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tryden12.demominiclerkie.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, MainFragment.newInstance())
                .commitNow()
        }
    }
}