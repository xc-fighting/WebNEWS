package com.xuchen.news.activity.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by xuchen on 2017/8/29.
 */
public abstract class BaseActivity extends AppCompatActivity{

    public String Tag;
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Tag=getComponentName().getShortClassName();
    }
    protected  void onResume(){
        super.onResume();
    }
    protected void onStart(){
        super.onResume();
    }
    protected void onPause(){
        super.onPause();
    }
    protected void onStop(){
        super.onStop();
    }
    protected void onDestroy(){
        super.onDestroy();
    }


}
