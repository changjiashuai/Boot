package com.changjiashuai.boot.mvp.core.compat;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/7/6 11:19.
 */

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);

    void detachView();
}
