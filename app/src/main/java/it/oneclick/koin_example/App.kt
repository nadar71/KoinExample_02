package it.oneclick.koin_example

import android.app.Application
import it.oneclick.koin_example.di.module.appModule
import it.oneclick.koin_example.di.module.repoModule
import it.oneclick.koin_example.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}