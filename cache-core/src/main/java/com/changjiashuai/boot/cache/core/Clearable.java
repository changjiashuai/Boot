package com.changjiashuai.boot.cache.core;

import android.support.annotation.NonNull;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/7/8 15:15.
 */

public interface Clearable<T> {
    void clear(@NonNull T key);
}
