package com.xuyong.myweather.api

import android.database.Observable
import com.xuyong.myweather.entity.WeatherDataEntity
import retrofit2.http.GET
import retrofit2.http.Query

interface IWeatherApi {

    //http://api.map.baidu.com/telematics/v3/weather?location=北京&output=json&ak=B95329fb7fdda1e32ba3e3a245193146
    @GET("/telematics/v3/weather?output=json&ak=B95329fb7fdda1e32ba3e3a245193146")
    fun getWeather(@Query(value = "location", encoded = true) location: String): Observable<WeatherDataEntity>
}
