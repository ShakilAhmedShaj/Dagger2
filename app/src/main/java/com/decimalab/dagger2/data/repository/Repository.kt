package com.decimalab.dagger2.data.repository

import android.content.Context
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService

class Repository (private val context: Context) {

    private  var databaseService: DatabaseService
    private  var networkService: NetworkService

    init {
        databaseService = DatabaseService(context)
        networkService = NetworkService(context)
    }

    fun getDatabase() = databaseService.getDatabase()

    fun getNetworkService() = networkService.getNetworkService()
}