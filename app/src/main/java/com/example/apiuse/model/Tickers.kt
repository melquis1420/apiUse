package com.example.apiuse.model

import com.google.gson.annotations.SerializedName

class Tickers {

    @SerializedName("symbol")
    var symbol : String = ""

    @SerializedName("price_24h")
    var price_24h : Float = 0f

    @SerializedName("volume_24h")
    var volume_24h : Float = 0f

    @SerializedName("last_trade_price")
    var last_trade_price : Float = 0f
}