package com.example.view_pager_test_2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class pager_adapter extends FragmentStatePagerAdapter {

    int Number_of_fragments;

    public pager_adapter(FragmentManager fm,int no_of_tabs) {
        super(fm);
        this.Number_of_fragments = no_of_tabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                return new tab1_fragment();
            case 1:
                return new tab2_fragment();
            case 2:
                return new tab3_fragment();
            default:
            return null;
        }
    }

    @Override
    public int getCount() {
        return Number_of_fragments;
    }
}
