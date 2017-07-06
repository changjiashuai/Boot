package com.changjiashuai.mvp.core;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/7/6 11:21.
 */


public abstract class BaseActivity<V extends BaseView, T extends BasePresenter<V>> extends Activity implements BaseView {

    protected T mPresenter;

    public abstract void setPresenter(T presenter);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
