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
public class MessageFragment extends BaseFragment implements View.OnClickListener {


    public MessageFragment(){

    }
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState){
        mContext=getActivity();
        mContentView=inflater.inflate(R.layout.fragment_message_layout,container,false);
        return mContentView;
    }
    public void onClick(View view){

    }


}
