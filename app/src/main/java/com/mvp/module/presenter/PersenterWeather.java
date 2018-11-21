package com.mvp.module.presenter;

import android.widget.Toast;

import com.google.gson.Gson;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.mvp.module.Api;
import com.mvp.module.interfaces.IUIWeather;
import com.mvp.module.response.WeatherData;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author xiongxiang
 * @time 2018/11/21.
 * @e-mail 276186694@qq.com
 */
public class PersenterWeather extends BasePresenter<IUIWeather> {

    public void getWeather() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://www.apiopen.top/").addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        final Api api = retrofit.create(Api.class);
        Observable<WeatherData> observable = api.getWeather("杭州");
        observable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<WeatherData>() {
                    @Override
                    public void accept(WeatherData weatherData) throws Exception {
                        getMvpView().updateWeather(weatherData);
                        getMvpView().showToast(new Gson().toJson(weatherData), Toast.LENGTH_LONG);
                    }
                });
    }
}






