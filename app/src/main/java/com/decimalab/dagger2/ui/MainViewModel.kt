package com.decimalab.dagger2.ui

import android.content.Context
import com.decimalab.dagger2.data.repository.Repository

class MainViewModel(private val repository: Repository) {

    fun getDatabase() = repository.getDatabase()

    fun getNetworkService() = repository.getNetworkService()

}