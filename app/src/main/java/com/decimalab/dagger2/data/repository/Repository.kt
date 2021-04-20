package com.decimalab.dagger2.data.repository

import android.content.Context
import com.decimalab.dagger2.MyApp
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {


    fun getDatabase() = databaseService.getDatabase()

    fun getNetworkService() = networkService.getNetworkService()
}