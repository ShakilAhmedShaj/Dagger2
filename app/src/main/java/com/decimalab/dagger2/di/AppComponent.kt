package com.decimalab.dagger2.di

import com.decimalab.dagger2.MyApp
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService

/**
 * Created by Shakil Ahmed Shaj on 18,April,2021.
 * shakilahmedshaj@gmail.com
 */
class AppComponent {

    fun inject(application: MyApp){
        application.databaseService = DatabaseService(application, "local_db", 1)
        application.networkService = NetworkService(application, "www.shaj.com", "123456")

    }
}