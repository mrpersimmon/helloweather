package com.helloweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * suggestion:{
 *     "comf":{
 *         "txt":"....."
 *     },
 *     "cw":{
 *         "txt":"...."
 *     },
 *     "sport":{
 *         "txt":"...."
 *     }
 * }
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carwash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;

    }

    public class CarWash{

        @SerializedName("txt")
        public String info;

    }

    public class Sport{

        @SerializedName("txt")
        public String info;

    }

}
