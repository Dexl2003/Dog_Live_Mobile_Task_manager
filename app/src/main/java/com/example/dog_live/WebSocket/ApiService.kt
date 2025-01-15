package com.example.dog_live.WebSocket

import com.example.dog_live.CardData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("/getCards")
    fun fetchCards(): Call<List<CardData>>

    @POST("/addCard")
    fun addCard(@Body cardData: CardData): Call<Void>
}