package com.decimalab.dagger2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.decimalab.dagger2.MyApp
import com.decimalab.dagger2.R
import com.decimalab.dagger2.data.repository.Repository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    lateinit var app: MyApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        app = applicationContext as MyApp
        mainViewModel = MainViewModel(Repository(app.databaseService, app.networkService))

        btnGetDatabaseService.setOnClickListener {
            val data = mainViewModel.getDatabase()
            lbDatabaseService.text = data
        }

        btnGetNetworkService.setOnClickListener {
            val data = mainViewModel.getNetworkService()
            lbNetworkService.text = data
        }
    }
}