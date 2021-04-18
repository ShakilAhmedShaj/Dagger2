package com.decimalab.dagger2

import android.app.Application
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService

/**
 * Created by Shakil Ahmed Shaj on 18,April,2021.
 * shakilahmedshaj@gmail.com
 */
class MyApp : Application() {

    lateinit var databaseService: DatabaseService
    lateinit var networkService: NetworkService

    override fun onCreate() {
        super.onCreate()
        databaseService = DatabaseService(this, "local_db", 1)
        networkService = NetworkService(this, "www.shaj.com", "123456")
    }
}