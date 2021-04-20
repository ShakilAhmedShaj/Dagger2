package com.decimalab.dagger2.ui

import com.decimalab.dagger2.data.repository.Repository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: Repository) {

    fun getDatabase() = repository.getDatabase()

    fun getNetworkService() = repository.getNetworkService()

}