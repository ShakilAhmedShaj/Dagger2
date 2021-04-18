package com.decimalab.dagger2.data.repository

import android.content.Context
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService

class Repository(private val context: Context) {

    private var databaseService: DatabaseService
    private var networkService: NetworkService

    init {
        databaseService = DatabaseService(context, "local_db", 1)
        networkService = NetworkService(context,"www.shaj.com","123456")
    }

    fun getDatabase() = databaseService.getDatabase()

    fun getNetworkService() = networkService.getNetworkService()
}