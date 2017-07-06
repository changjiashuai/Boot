package com.changjiashuai.boot.mvp.bindview.butterknife;

import android.os.Bundle;

import com.changjiashuai.boot.mvp.core.BaseActivity;
import com.changjiashuai.boot.mvp.core.BasePresenter;
import com.changjiashuai.boot.mvp.core.BaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/7/6 16:10.
 */

public abstract class ButterKnifeActivity<V extends BaseView, T extends BasePresenter<V>> extends BaseActivity {

    private Unbinder mUnbinder;
    protected abstract void initContentView();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContentView();
        mUnbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }
}
