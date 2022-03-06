package com.example.weatherday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    // api key from Weather web :
    val apiKey = "59e91bf17a6a13fba9d2b609b71cf7cb"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.searchButton )
        button.setOnClickListener{
            getWeather()
        }
    }
    private fun getWeather(){
        val searchInput = findViewById<EditText>(R.id.searchInput)
        //api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=59e91bf17a6a13fba9d2b609b71cf7cb
        //api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=59e91bf17a6a13fba9d2b609b71cf7cb
        try {
        if (searchInput.text.isNotEmpty()) {
            //URL From Website:
            var fullURL =
                "https://home.openweathermap.org/data/2.5/weather?q=London,uk&units=metric&appid=59e91bf17a6a13fba9d2b609b71cf7cb"
            val queue = Volley.newRequestQueue(this)
            val stringRequest = StringRequest(Request.Method.POST, fullURL, { response ->
                println(response.toString())

            }, {}

            )
        }

    }catch (err:Exception){


        }    }
}
