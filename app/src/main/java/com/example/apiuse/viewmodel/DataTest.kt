package com.example.apiuse.viewmodel

import android.util.Log
import com.example.apiuse.model.NetworkUtils
import com.example.apiuse.model.Tickers
import com.example.apiuse.model.TickersEndPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataTest {

    fun getData(){
        var url: String = "https://api.blockchain.com/v3/exchange/"

        var retrofitClient = NetworkUtils.getRetrofitInstance(url)

        var endpoint = retrofitClient.create(TickersEndPoint::class.java)
        var callback = endpoint.getTickersPosts()

        callback.enqueue(object :Callback<List<Tickers>>{
            override fun onResponse(call: Call<List<Tickers>>, response: Response<List<Tickers>>) {
                Log.i("MYTEST", "CONECTADO")
            }

            override fun onFailure(call: Call<List<Tickers>>, t: Throwable) {
                Log.i("MYTEST", "ERROR")
            }
        })

    }
}