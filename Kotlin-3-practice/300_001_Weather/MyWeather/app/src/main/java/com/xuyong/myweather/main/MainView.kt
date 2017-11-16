package com.xuyong.myweather.main

import com.xuyong.myweather.entity.WeatherDataEntity

/**
 * @name .kt
 * @desc
 * @author: Created by XuYong of1615 on 2017/11/3
 */
interface MainView {
    fun showWeather(weather: WeatherDataEntity)

    fun showError(message: String?)

}
