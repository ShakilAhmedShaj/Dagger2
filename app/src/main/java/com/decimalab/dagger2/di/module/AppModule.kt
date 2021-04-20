package com.decimalab.dagger2.di.module

import android.content.Context
import com.decimalab.dagger2.MyApp
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService
import com.decimalab.dagger2.data.repository.Repository
import com.decimalab.dagger2.di.qualifier.ApiKEey
import com.decimalab.dagger2.di.qualifier.DatabaseName
import com.decimalab.dagger2.di.qualifier.Url
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Shakil Ahmed Shaj on 18,April,2021.
 * shakilahmedshaj@gmail.com
 */
@Module
class AppModule(private val application: MyApp) {


//    @Singleton
//    @Provides
//    fun provideDatabaseService(): DatabaseService {
//        return DatabaseService(application, "dagger_db", 2)
//    }

//    @Provides
//    @Singleton
//    fun provideNetworkService(): NetworkService =
//        NetworkService(application, "www.shaj.com", "123456")

    @Provides
    fun provideContext(): Context = application

    @Provides
    @DatabaseName
    fun provideDatabaseName(): String = "new_demo_db"

    @Provides
    fun provideDatabaseVersion(): Int = 1

    @Provides
    @Url
    fun provideUrl(): String = "www.newshaj.com"

    @Provides
    @ApiKEey
    fun provideApiKey(): String = "new_1234"


//    @Provides
//    @Singleton
//    fun provideRepository(
//        databaseService: DatabaseService,
//        networkService: NetworkService
//    ): Repository = Repository(databaseService, networkService)

}