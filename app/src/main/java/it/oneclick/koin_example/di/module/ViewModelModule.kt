package it.oneclick.koin_example.di.module

import it.oneclick.koin_example.ui.main.viewmodel.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel {
        MainViewModel(get(),get())
    }
}