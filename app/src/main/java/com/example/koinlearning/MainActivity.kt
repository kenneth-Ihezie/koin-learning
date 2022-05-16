package com.example.koinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

/*
The MyViewModel component will be created with HelloRepository instance.
To get it into our Activity, let's inject it with the by viewModel() delegate
injector:
 */
class MainActivity : AppCompatActivity() {
    //lazy Inject ViewModel
    //The by viewModel() function allows us to retrieve a ViewModel
    // instance from Koin, linked to the Android ViewModelFactory.
    private val myViewModel: MyViewModel by viewModel()
    //lazy injected MySimplePresenter
    //The by inject() function allows us to retrieve Koin instances,
    //in Android components runtime (Activity, fragment, Service...)
    private val koinPresenter: KoinPresenter by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("DEBUG",  myViewModel.sayHello())
        Log.d("DEBUG1", koinPresenter.sayHello())
        Log.d("DEBUG3", koinPresenter.fromHelloRepo())
    }
}