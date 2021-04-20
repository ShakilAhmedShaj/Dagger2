package com.decimalab.dagger2.di.component

import com.decimalab.dagger2.MyApp
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService
import com.decimalab.dagger2.data.repository.Repository
import com.decimalab.dagger2.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Shakil Ahmed Shaj on 18,April,2021.
 * shakilahmedshaj@gmail.com
 */

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(application: MyApp)

    fun getDatabaseService(): DatabaseService

    fun getNetworkService(): NetworkService

    fun getRepository(): Repository
}