package com.decimalab.dagger2.di.component

import com.decimalab.dagger2.di.module.ActivityModule
import com.decimalab.dagger2.di.scope.ActivityScope
import com.decimalab.dagger2.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Shakil Ahmed Shaj on 18,April,2021.
 * shakilahmedshaj@gmail.com
 */

@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [AppComponent::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}