package com.example.Day5TaskApplication.data

import com.example.Day5TaskApplication.AllBooks
import retrofit2.http.GET

interface BookApi {
    @GET("books")
    suspend fun getAllbooks():List<AllBooks>
}