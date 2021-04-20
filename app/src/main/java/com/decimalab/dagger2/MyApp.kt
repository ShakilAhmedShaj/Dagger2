package com.decimalab.dagger2

import android.app.Application
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService
import com.decimalab.dagger2.di.component.AppComponent
import com.decimalab.dagger2.di.component.DaggerAppComponent
import com.decimalab.dagger2.di.module.AppModule
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

    lateinit var applicationComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()

        applicationComponent.inject(this)
    }
}