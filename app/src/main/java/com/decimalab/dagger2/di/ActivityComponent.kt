package com.decimalab.dagger2.di

import com.decimalab.dagger2.MyApp
import com.decimalab.dagger2.data.repository.Repository
import com.decimalab.dagger2.ui.MainActivity
import com.decimalab.dagger2.ui.MainViewModel

/**
 * Created by Shakil Ahmed Shaj on 18,April,2021.
 * shakilahmedshaj@gmail.com
 */
class ActivityComponent {

    fun inject(activity: MainActivity) {
        val app = activity.application as MyApp
        activity.mainViewModel = MainViewModel(Repository(app.databaseService, app.networkService))
    }
}