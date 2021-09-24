package it.oneclick.koin_example.di.module

import it.oneclick.koin_example.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}