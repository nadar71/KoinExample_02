package it.oneclick.koin_example.data.api

import it.oneclick.koin_example.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}