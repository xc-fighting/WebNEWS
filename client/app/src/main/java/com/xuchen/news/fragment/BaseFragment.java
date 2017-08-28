package com.xuchen.news.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;

/**
 * Created by xuchen on 2017/8/29
 * for the common behavior and event of all other fragment.
 */
public class BaseFragment extends Fragment {
     protected Activity mContext;
     protected View mContentView;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public void onResume(){
        super.onResume();
    }

    public void onPause(){
        super.onPause();
    }

}
