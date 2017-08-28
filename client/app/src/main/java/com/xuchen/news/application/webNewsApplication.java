package com.xuchen.news.application;

import android.app.Application;

/**
 * Created by xuchen on 2017/8/29.
 * 1.the enter point of the whole program
 * 2.initialize work
 * 3.for load of third part sdk
 * 4.for the context of other component
 */
public class webNewsApplication extends Application {

    private static webNewsApplication mApplication=null;
    public void onCreate(){
        super.onCreate();
        mApplication=this;
    }
    public static webNewsApplication getInstance(){
        return mApplication;
    }
}
