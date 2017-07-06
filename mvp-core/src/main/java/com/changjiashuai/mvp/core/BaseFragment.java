package com.changjiashuai.mvp.core;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/7/6 11:36.
 */

public abstract class BaseFragment<V extends BaseView, T extends BasePresenter<V>> extends Fragment implements BaseView {

    protected T mPresenter;

    public abstract void initPresenter();

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initPresenter();
        mPresenter.attachView((V) this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getActivity(), error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}
