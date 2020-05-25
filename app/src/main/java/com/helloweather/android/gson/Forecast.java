package com.helloweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * "daily_forecast":[
 *      {
 *          "date":"2020-05-25",
 *          "cond":{
 *              "txt_d":"雷阵雨"
 *          },
 *          "tmp":{
 *              "max":"34",
 *              "min":"27"
 *          }
 *      },
 *      {
 *          "date":"2020-05-26",
 *          "cond":{
 *              "txt_d":"雷阵雨"
 *          },
 *          "tmp":{
 *              "max":"34",
 *              "min":"27"
 *          }
 *      },
 *      ...
 * ]
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;

    }

    public class More{

        @SerializedName("txt_d")
        public String info;

    }
}
