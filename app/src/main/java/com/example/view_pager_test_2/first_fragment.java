package com.example.view_pager_test_2;


import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class first_fragment extends Fragment {

    View rootView;
    ViewPager viewPager;
    PagerAdapter adapter;
    TabLayout tabLayout;
    TabItem tab1,tab2,tab3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_first_fragment, container, false);
        viewPager = rootView.findViewById(R.id.view_pager);



        tabLayout =rootView.findViewById(R.id.tablayout);
        tab1 = rootView.findViewById(R.id.tab1);
        tab2 = rootView.findViewById(R.id.tab2);
        tab3 = rootView.findViewById(R.id.tab3);


            adapter = new pager_adapter(getFragmentManager(), tabLayout.getTabCount());
            viewPager.setAdapter(adapter);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        /*
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //viewPager.setCurrentItem(tab.getPosition());
                super.onTabSelected(tab);
                int tabIconColor = ContextCompat.getColor(rootView.getContext(), R.color.tabSelectedIconColor);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                super.onTabUnselected(tab);
                int tabIconColor = ContextCompat.getColor(rootView.getContext(), R.color.tabUnselectedIconColor);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                super.onTabReselected(tab);

            }
        });
        */

        return rootView;
    }

}
