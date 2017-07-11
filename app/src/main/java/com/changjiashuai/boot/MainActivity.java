package com.changjiashuai.boot;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.changjiashuai.boot.Presenter.MainPresenter;
import com.changjiashuai.boot.View.MainView;
import com.changjiashuai.boot.fragment.MainFragment;
import com.changjiashuai.boot.mvp.bindview.butterknife.ButterKnifeActivity;

import butterknife.OnClick;

public class MainActivity extends ButterKnifeActivity<MainView, MainPresenter>
        implements MainView, MainFragment.OnFragmentInteractionListener, ViewPager.OnPageChangeListener {

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
        Intent intent = new Intent(this, SampleCirclesDefault.class);
        startActivity(intent);
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

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
