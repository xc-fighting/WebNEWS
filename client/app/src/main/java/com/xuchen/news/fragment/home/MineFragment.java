package com.xuchen.news.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xuchen.news.R;
import com.xuchen.news.fragment.BaseFragment;

/**
 * Created by xuchen on 2017/8/29.
 */
public class MineFragment extends BaseFragment implements View.OnClickListener{
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState){
        mContext=getActivity();
        mContentView=inflater.inflate(R.layout.fragment_mine_layout,container,false);
        return mContentView;
    }


    public void onClick(View v){

    }
}
