package com.changjiashuai.boot.mvp.bindview.butterknife;

import android.os.Bundle;
import android.view.View;

import com.changjiashuai.boot.mvp.core.BaseFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/7/6 16:14.
 */

public abstract class ButterKnifeFragment<V, T> extends BaseFragment {

    private Unbinder mUnbinder;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mUnbinder = ButterKnife.bind(this, view);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }
}
