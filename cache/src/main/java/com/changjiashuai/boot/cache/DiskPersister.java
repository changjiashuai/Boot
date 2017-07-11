package com.changjiashuai.boot.cache;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2017/7/9 11:13.
 */

public class DiskPersister<V> implements Persister<String, V> {

    private DiskLruCache mDiskLruCache;
    private File cacheDir;
    private int appVersion;
    private int valueCount;
    private long maxSize;

    public void open() {
        try {
            mDiskLruCache = DiskLruCache.open(cacheDir, appVersion, valueCount, maxSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setCacheDir(File cacheDir) {
        this.cacheDir = cacheDir;
    }

    public File getCacheDir() {
        return cacheDir;
    }

    @Override
    public V read(String key) {
        try {
            DiskLruCache.Snapshot snapshot = mDiskLruCache.get(hashKeyForDisk(key));
            if (snapshot != null){
                InputStream inputStream = snapshot.getInputStream(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean write(String key, V value) {
        try {
            DiskLruCache.Editor editor = mDiskLruCache.edit(hashKeyForDisk(key));
            if (editor != null) {
                OutputStream outputStream = editor.newOutputStream(0);
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
                bufferedWriter.write(value);
                editor.commit();
                mDiskLruCache.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String hashKeyForDisk(String key) {
        String cacheKey;
        try {
            final MessageDigest mDigest = MessageDigest.getInstance("MD5");
            mDigest.update(key.getBytes());
            cacheKey = bytesToHexString(mDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            cacheKey = String.valueOf(key.hashCode());
        }
        return cacheKey;
    }

    private String bytesToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }
}
