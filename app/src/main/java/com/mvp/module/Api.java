package com.mvp.module;

import com.mvp.module.response.WeatherData;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author xiongxiang
 * @time 2018/11/21.
 * @e-mail 276186694@qq.com
 */
public interface Api {
    @GET("weatherApi")
    Observable<WeatherData> getWeather(@Query("city") String string);
}
