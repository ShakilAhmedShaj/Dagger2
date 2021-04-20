package com.decimalab.dagger2

import android.app.Application
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService
import com.decimalab.dagger2.di.component.DaggerApplicationComponent
import com.decimalab.dagger2.di.module.ApplicationModule
import javax.inject.Inject

/**
 * Created by Shakil Ahmed Shaj on 18,April,2021.
 * shakilahmedshaj@gmail.com
 */
class MyApp : Application() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
            .inject(this)

    }
}