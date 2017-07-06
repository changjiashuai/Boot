package com.changjiashuai.mvp.core;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/7/6 11:29.
 */

public abstract class SimplePresenter<V extends BaseView> implements BasePresenter<V> {

    protected V mView;

    @Override
    public void attachView(V view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
