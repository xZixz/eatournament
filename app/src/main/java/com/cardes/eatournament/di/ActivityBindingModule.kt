package com.cardes.eatournament.di

import com.cardes.eatournament.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(subcomponents = [TeamComponent::class])
interface ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun mainActivity(): MainActivity

}
