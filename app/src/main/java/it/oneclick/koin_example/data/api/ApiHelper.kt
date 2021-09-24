package it.oneclick.koin_example.data.api

import it.oneclick.koin_example.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}