package com.changjiashuai.boot;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.changjiashuai.boot.Presenter.MainPresenter;
import com.changjiashuai.boot.View.MainView;
import com.changjiashuai.boot.fragment.MainFragment;
import com.changjiashuai.boot.mvp.bindview.butterknife.ButterKnifeActivity;

import butterknife.OnClick;

public class MainActivity extends ButterKnifeActivity<MainView, MainPresenter>
        implements MainView, MainFragment.OnFragmentInteractionListener {

    private static final String TAG = "MainActivity";

    @Override
    public void initPresenter() {
        mPresenter = new MainPresenter();
    }

    @Override
    protected void initContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @OnClick(R.id.btn_test)
    void onButtonClick() {
        Log.i(TAG, "onButtonClick: ");
        showMessage("test from activity");
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

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
