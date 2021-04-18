package com.decimalab.dagger2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.decimalab.dagger2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = MainViewModel(this)

        btnGetDatabaseService.setOnClickListener {
          val data =   mainViewModel.getDatabase()
            lbDatabaseService.text = data
        }

        btnGetNetworkService.setOnClickListener {
            val data = mainViewModel.getNetworkService()
            lbNetworkService.text = data
        }
    }
}