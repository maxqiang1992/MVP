package com.mvp.module.presenter;

import com.mvp.module.interfaces.MvpView;

/**
 * @author xiongxiang
 * @time 2018/11/21.
 * @e-mail 276186694@qq.com
 */
public class BasePresenter<V extends MvpView> implements Presenter<V> {

    private V mMvpView;


    @Override
    public void attachView(V mMvpView) {
        this.mMvpView = mMvpView;
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    @Override
    public V getMvpView() {
        return mMvpView;
    }
}
