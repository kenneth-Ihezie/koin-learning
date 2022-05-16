package com.example.koinlearning

import get
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    /*
    single instance of HelloRepository
    where ever a class has a dependency in HelloRepository
    the HelloRepositoryImpl wii be implemented.
     */
    single<HelloRepository> { HelloRepositoryImpl() }
    single<KoinRepository> { KoinRepositoryImpl() }
    //simple presenter Factory
    factory { KoinPresenter(get(), get()) }
    /*
    MyViewModel ViewModel
    the get() method represents the dependency of MyViewModel in HelloRepository
    we declare our MyViewModel class as a viewModel in a module. Koin will give a MyViewModel to the lifecycle ViewModelFactory and help bind it to the current component.
     */
    viewModel { MyViewModel(get()) }
}