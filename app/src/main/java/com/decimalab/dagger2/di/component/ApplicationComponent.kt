package com.decimalab.dagger2.di.component

import com.decimalab.dagger2.MyApp
import com.decimalab.dagger2.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Shakil Ahmed Shaj on 20,April,2021.
 * shakilahmedshaj@gmail.com
 */

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApp)
}