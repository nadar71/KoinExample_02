package it.oneclick.koin_example.data.repository

import it.oneclick.koin_example.data.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper){
    suspend fun getUsers() =  apiHelper.getUsers()
}