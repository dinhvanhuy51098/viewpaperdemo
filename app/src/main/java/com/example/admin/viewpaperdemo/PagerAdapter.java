package com.example.admin.viewpaperdemo;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs)
    {
        super(fm);
        this.mNumOfTabs=NumOfTabs;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                TabFragmen1 tab1=new TabFragmen1();
                return tab1;
            case 1:
                TabFragmen2 tab2=new TabFragmen2();
                return tab2;
            case 2:
                TabFragmen3 tab3=new TabFragmen3();
                return tab3;
            default: return null;
        }
    }
    @Override
    public int getCount()
    {
        return mNumOfTabs;
    }

}
