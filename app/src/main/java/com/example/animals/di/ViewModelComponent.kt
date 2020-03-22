package com.example.animals.di

import com.example.animals.viewModel.ListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class, PrefsModule::class, AppModule::class])
interface ViewModelComponent {

    fun inject (viewModel: ListViewModel)
}