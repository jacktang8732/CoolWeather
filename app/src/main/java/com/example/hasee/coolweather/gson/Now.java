package com.example.hasee.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hasee on 2018/3/1.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
