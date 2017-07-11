package com.changjiashuai.boot.cache;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/7/9 11:11.
 */

public interface Persister<K, V> {
    V read(K key);

    Boolean write(K key, V value);
}
