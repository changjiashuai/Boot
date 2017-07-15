package com.changjiashuai.boot.mvp.core.compat;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/7/6 11:16.
 */

public interface BaseView {
    /**
     * Show a view with a progress bar indicating a loading process.
     */
    void showLoading();

    /**
     * Hide a loading view.
     */
    void hideLoading();

    /**
     * Show a retry view in case of an error when retrieving data.
     */
    void showRetry();

    /**
     * Hide a retry view shown if there was an error when retrieving data.
     */
    void hideRetry();

    /**
     * Show an error message
     *
     * @param error A string representing an error.
     */
    void showError(String error);

    /**
     * Show an message
     * @param message A String representing an message
     */
    void showMessage(String message);
}
