package com.mvp.module.presenter;

import com.mvp.module.interfaces.MvpView;

/**
 * @author xiongxiang
 * @time 2018/11/21.
 * @e-mail 276186694@qq.com
 */
public interface Presenter<V extends MvpView> {

    void attachView(V mMvpView);

    void detachView();

    V getMvpView();
}
