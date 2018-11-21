package com.mvp.module.interfaces;

import com.mvp.module.response.WeatherData;

/**
 * @author xiongxiang
 * @time 2018/11/21.
 * @e-mail 276186694@qq.com
 */
public interface IUIWeather extends MvpView {
    void updateWeather(WeatherData weather);
}
