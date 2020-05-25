package com.helloweather.android.gson;

import com.google.gson.annotations.SerializedName;



/**
 * basic
 *
 * "basic":{
 *     "city":"苏州",
 *     "id":"CN101190401",
 *     "update":{
 *         "loc":"2016-08-08 21:58"
 *     }
 * }
 *  id：城市对应的天气id
 *  loc:天气的更新时间
 *
 *  使用 @SerializedName 注解方式让JSON字段和Java字段之间建立映射关系。
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }
}
