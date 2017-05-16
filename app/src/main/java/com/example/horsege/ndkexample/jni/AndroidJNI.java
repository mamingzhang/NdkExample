package com.example.horsege.ndkexample.jni;

/**
 * Created by horsege on 2017/5/16.
 */

public class AndroidJNI {
    static {
        System.loadLibrary("");
    }

    public native void test();
}
