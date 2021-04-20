package com.decimalab.dagger2

import android.app.Application
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService
import com.decimalab.dagger2.di.component.DaggerAppComponent
import com.decimalab.dagger2.di.module.AppModule
import javax.inject.Inject

/**
 * Created by Shakil Ahmed Shaj on 18,April,2021.
 * shakilahmedshaj@gmail.com
 */
class MyApp : Application() {

    @Inject //field injection
    lateinit var databaseService: DatabaseService

    @Inject //field injection
    lateinit var networkService: NetworkService

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
            .inject(this)
    }

}