package com.xuyong.myweather.entity


/**
 * @name WeatherDataEntity.kt
 * @desc
 * @author: Created by XuYong of1615 on 2017/11/3
 */

class WeatherDataEntity(val error: Int,
                        val status: String?,
                        val date: String?,
                        val results: List<ResultsBean>?)

class ResultsBean(val currentCity: String?,
                  val pm25: String?,
                  val index: List<IndexBean>?,
                  val weather_data: List<WeatherDataBean>?)

class IndexBean(val title: String,
                val zs: String,
                val tipt: String,
                val des: String)

class WeatherDataBean(val date: String?,
                      val dayPictureUrl: String?,
                      val nightPictureUrl: String?,
                      val weather: String?,
                      val wind: String?,
                      val temperature: String?)