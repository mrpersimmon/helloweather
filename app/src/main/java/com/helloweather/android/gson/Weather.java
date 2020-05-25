package com.helloweather.android.gson;

import android.widget.ListView;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 *  和风天气API 返回结构如下：
 *  {
 *      "Heweather":[
 *          {
 *              "status": "ok",
 *              "basic": {},
 *              "aqi":{},
 *              "now":{},
 *              "suggestion":{},
 *              "daily_forecast":[]
 *          }
 *      ]
 *  }
 *
 *  以上五个部分可定义为5个实体类
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
