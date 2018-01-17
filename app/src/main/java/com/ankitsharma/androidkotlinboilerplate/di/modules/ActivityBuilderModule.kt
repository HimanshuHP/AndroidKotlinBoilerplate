package com.ankitsharma.androidkotlinboilerplate.di.modules

import com.ankitsharma.androidkotlinboilerplate.views.main.MainActivity
import com.ankitsharma.androidkotlinboilerplate.views.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Contains all activities to be bound to application dependency graph
 *
 * Created by ankitsharma on 11/01/18.
 */
@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity
}