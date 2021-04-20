package com.decimalab.dagger2.di.module

import com.decimalab.dagger2.MyApp
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Shakil Ahmed Shaj on 18,April,2021.
 * shakilahmedshaj@gmail.com
 */
@Module
class AppModule(private val application: MyApp) {


    @Provides
    fun provideDatabaseService(): DatabaseService {
        return DatabaseService(application, "dagger_db", 2)
    }

    @Provides
    fun provideNetworkService(): NetworkService =
        NetworkService(application, "www.shaj.com", "123456")


}