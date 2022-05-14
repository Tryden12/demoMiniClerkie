package com.tryden12.demominiclerkie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tryden12.demominiclerkie.api.MyRetrofitBuilder.textWithImage
import com.tryden12.demominiclerkie.databinding.MainActivityBinding
import com.tryden12.demominiclerkie.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var toggle :ActionBarDrawerToggle
    lateinit var binding: MainActivityBinding
    lateinit var viewModel : MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /***************** Toggle Menu ****************************************************/
        toggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_menu1 -> Toast.makeText(applicationContext,
                    "Clicked item 1", Toast.LENGTH_SHORT).show()
                R.id.action_menu2 -> Toast.makeText(applicationContext,
                    "Clicked item 2", Toast.LENGTH_SHORT).show()
                R.id.action_menu3 -> Toast.makeText(applicationContext,
                    "Clicked item 3", Toast.LENGTH_SHORT).show()
            }
            true
        }

        /*********** View Model ****************************************************/
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.textWithImage.observe(this, Observer { textWithImage
            println("DEBUG: $textWithImage")
        })
        viewModel.setTextWithImageId("1")
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.cancelJobs()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}