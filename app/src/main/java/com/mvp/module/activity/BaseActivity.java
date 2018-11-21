package com.mvp.module.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.mvp.module.interfaces.MvpView;
import com.mvp.module.presenter.BasePresenter;

import java.lang.reflect.ParameterizedType;

/**
 * @author xiongxiang
 * @time 2018/11/21.
 * @e-mail 276186694@qq.com
 */
public class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements MvpView {
    public P mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPresenter();
    }

    @Override
    public void showToast(String title, int des) {
        Toast.makeText(this, title, des).show();
    }

    private void initPresenter() {
        Class<P> tClass = (Class<P>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        try {
            this.mPresenter = tClass.newInstance();
            if (null != mPresenter) {
                mPresenter.attachView(this);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public P getPersenter() {
        return mPresenter;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (null != mPresenter) {
            mPresenter.detachView();
        }
    }
}
