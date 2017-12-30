package com.xuchen.news.activity;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xuchen.news.R;
import com.xuchen.news.activity.base.BaseActivity;
import com.xuchen.news.fragment.home.HomeFragment;
import com.xuchen.news.fragment.home.MessageFragment;
import com.xuchen.news.fragment.home.MineFragment;


public class HomeActivity extends BaseActivity implements View.OnClickListener {

    /*
    * fragment variables
    * */
    private FragmentManager fm;
    private HomeFragment mHomeFragment;
    private MessageFragment mMessageFragment;
    private MineFragment mMineFragment;
   /*
   * layout variables
   * */
    private RelativeLayout mHomeLayout;
    private RelativeLayout mPondLayout;
    private RelativeLayout mMessageLayout;
    private RelativeLayout mMineLayout;

    /*
    * textview variables
    * */
    private TextView mHomeView;
    private TextView mPondView;
    private TextView mMessageView;
    private TextView mMineView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        //add default fragment
        mHomeFragment=new HomeFragment();
        fm=getFragmentManager();
        FragmentTransaction fragmentTransaction=fm.beginTransaction();
        fragmentTransaction.replace(R.id.content_layout,mHomeFragment);
        fragmentTransaction.commit();
    }
    //init all the component
    private void initView(){
        mHomeLayout=(RelativeLayout)this.findViewById(R.id.home_layout_view);
        mHomeLayout.setOnClickListener(this);
        mPondLayout=(RelativeLayout)this.findViewById(R.id.pond_layout_view);
        mPondLayout.setOnClickListener(this);
        mMessageLayout=(RelativeLayout)this.findViewById(R.id.message_layout_view);
        mMessageLayout.setOnClickListener(this);
        mMineLayout=(RelativeLayout)this.findViewById(R.id.mine_layout_view);
        mMineLayout.setOnClickListener(this);

        mHomeView=(TextView)this.findViewById(R.id.home_image_view);
        mPondView=(TextView)this.findViewById(R.id.fish_image_view);
        mMessageView=(TextView)this.findViewById(R.id.message_image_view);
        mMineView=(TextView)this.findViewById(R.id.mine_image_view);
        mHomeView.setBackgroundResource(R.drawable.comui_tab_home_selected);
    }

    //for hide specific fragment
    private void hideFragment(Fragment frag,FragmentTransaction ft){
        if(frag!=null){
            ft.hide(frag);
        }
    }
    public void onClick(View v){
         FragmentTransaction fragmentTransaction=fm.beginTransaction();
        switch(v.getId()){
            case R.id.home_layout_view:{
                mHomeView.setBackgroundResource(R.drawable.comui_tab_home_selected);
                mPondView.setBackgroundResource(R.drawable.comui_tab_pond);
                mMessageView.setBackgroundResource(R.drawable.comui_tab_message);
                mMineView.setBackgroundResource(R.drawable.comui_tab_person);
                //hide the fragment
                hideFragment(mMessageFragment,fragmentTransaction);
                hideFragment(mMineFragment,fragmentTransaction);
                //show home fragment to the users
                if(mHomeFragment==null){
                    mHomeFragment=new HomeFragment();
                    fragmentTransaction.add(R.id.content_layout,mHomeFragment);
                }
                else{
                    fragmentTransaction.show(mHomeFragment);
                }
            }break;
            case R.id.mine_layout_view:{

                mHomeView.setBackgroundResource(R.drawable.comui_tab_home);
                mPondView.setBackgroundResource(R.drawable.comui_tab_pond);
                mMessageView.setBackgroundResource(R.drawable.comui_tab_message);
                mMineView.setBackgroundResource(R.drawable.comui_tab_person_selected);
                //hide fragment
                hideFragment(mHomeFragment,fragmentTransaction);
                hideFragment(mMessageFragment,fragmentTransaction);
                //show the mine fragment to users
                if(mMineFragment==null){
                    mMineFragment=new MineFragment();
                    fragmentTransaction.add(R.id.content_layout,mMineFragment);
                }
                else{
                    fragmentTransaction.show(mMineFragment);
                }
            }break;
            case R.id.message_layout_view:{
                mHomeView.setBackgroundResource(R.drawable.comui_tab_home);
                mPondView.setBackgroundResource(R.drawable.comui_tab_pond);
                mMessageView.setBackgroundResource(R.drawable.comui_tab_message_selected);
                mMineView.setBackgroundResource(R.drawable.comui_tab_person);
                //hide fragment
                hideFragment(mHomeFragment,fragmentTransaction);
                hideFragment(mMineFragment,fragmentTransaction);
                //show the mine fragment to users
                if(mMessageFragment==null){
                    mMessageFragment=new MessageFragment();
                    fragmentTransaction.add(R.id.content_layout,mMessageFragment);
                }
                else{
                    fragmentTransaction.show(mMessageFragment);
                }
            }break;
        }
        fragmentTransaction.commit();
    }


}
