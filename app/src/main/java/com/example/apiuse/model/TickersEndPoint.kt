package com.example.apiuse.model


import retrofit2.Call
import retrofit2.http.GET

interface TickersEndPoint {

    @GET("tickers")
    fun getTickersPosts():Call<List<Tickers>>
}