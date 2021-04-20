package com.decimalab.dagger2.di.module

import android.app.Activity
import com.decimalab.dagger2.data.database.DatabaseService
import com.decimalab.dagger2.data.netwotk.NetworkService
import com.decimalab.dagger2.data.repository.Repository
import com.decimalab.dagger2.ui.MainViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Shakil Ahmed Shaj on 18,April,2021.
 * shakilahmedshaj@gmail.com
 */

@Module
class ActivityModule(
    private val activity: Activity

) {

//    @Provides
//    fun provideMainViewModel(
//        repository: Repository
//    ): MainViewModel =
//        MainViewModel(
//            repository
//        )


}