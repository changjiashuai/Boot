package com.changjiashuai.boot;

import android.os.Bundle;
import android.view.View;

import com.changjiashuai.boot.Presenter.MainPresenter;
import com.changjiashuai.boot.View.MainView;
import com.changjiashuai.boot.mvp.core.BaseActivity;

public class MainActivity extends BaseActivity<MainView, MainPresenter>
        implements MainView {

    @Override
    public void initPresenter() {
        mPresenter = new MainPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        showMessage("haha");
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showRetry() {

    }

    @Override
    public void hideRetry() {

    }
}
