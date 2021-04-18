package com.decimalab.dagger2.data.repository

import android.content.Context
import com.decimalab.dagger2.MyApp
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService

class Repository(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {


    fun getDatabase() = databaseService.getDatabase()

    fun getNetworkService() = networkService.getNetworkService()
}