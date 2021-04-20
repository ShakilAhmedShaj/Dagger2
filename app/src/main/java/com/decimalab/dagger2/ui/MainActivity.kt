package com.decimalab.dagger2.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.decimalab.dagger2.R
import com.decimalab.dagger2.di.component.DaggerActivityComponent
import com.decimalab.dagger2.di.module.ActivityModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerActivityComponent
            .builder()
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)

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