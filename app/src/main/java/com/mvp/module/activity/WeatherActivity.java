package com.mvp.module.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.mvp.R;
import com.mvp.module.interfaces.IUIWeather;
import com.mvp.module.presenter.PersenterWeather;
import com.mvp.module.response.WeatherData;

/**
 * @author xiongxiang
 * @time 2018/11/21.
 * @e-mail 276186694@qq.com
 */
public class WeatherActivity extends BaseActivity<PersenterWeather> implements IUIWeather, View.OnClickListener {

    private TextView mTv1;
    private TextView mTv2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        mTv1 = findViewById(R.id.TV1);
        mTv2 = findViewById(R.id.TV2);
        findViewById(R.id.BT1).setOnClickListener(this);
    }

    @Override
    public void updateWeather(WeatherData weather) {
        mTv1.setText("城市:" + weather.getData().getCity());
        mTv2.setText("温度:" + weather.getData().getWendu());
    }

    @Override
    public void onClick(View v) {
        mPresenter.getWeather();
    }
}
