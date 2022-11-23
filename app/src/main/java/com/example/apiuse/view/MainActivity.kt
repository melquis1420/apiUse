package com.example.apiuse.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.apiuse.R
import com.example.apiuse.viewmodel.DataTest

class MainActivity : AppCompatActivity() {
    //https://api.blockchain.com/v3/exchange/
    //ticker

    val data:DataTest = DataTest()
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list()
    }

    fun list(){
        btnCatch()
    }

    private fun btnCatch(){
        var catch : Button = findViewById(R.id.btnCatch)
        catch.setOnClickListener(View.OnClickListener {
            data.getData()

        })
    }

    private fun setSymbol(){
        var symbol : TextView = findViewById(R.id.txtSymbol)
        symbol.setText("")
    }
}