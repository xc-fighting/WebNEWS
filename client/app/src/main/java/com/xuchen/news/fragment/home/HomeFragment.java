package com.xuchen.news.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.xuchen.news.R;
import com.xuchen.news.fragment.BaseFragment;

/**
 * Created by xuchen on 2017/8/29.
 */
public class HomeFragment extends BaseFragment implements
        View.OnClickListener, AdapterView.OnItemClickListener {

    public HomeFragment(){

    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState){
        mContext=getActivity();
        mContentView=inflater.inflate(R.layout.fragment_home_layout,container,false);
        return mContentView;
    }

    public void onClick(View v){

    }

    public void onItemClick(AdapterView<?>parent ,View view,int position,long id){

    }

}
