package com.xuyong.myweather.main

import com.xuyong.myweather.api.ApiClient
import com.xuyong.myweather.api.RxSchedulers

/**
 * @name .kt
 * @desc
 * @author: Created by XuYong of1615 on 2017/11/3
 */
class MainPresenter(private val mainView: MainView) {
    fun getWeatherInfo(location: String) {
        ApiClient.getInstance()?.getWeather(location)?.compose(RxSchedulers.applySchedulers())
                ?.subscribe({ weatherData -> mainView.showWeather(weatherData) })
                { throwable -> mainView.showError(throwable.message) }
    }
}
