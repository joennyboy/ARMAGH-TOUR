package com.example.android.amaghtour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                EventFragment tab1 = new EventFragment();
                return tab1;
            case 1:
                FoodFragment tab2 = new FoodFragment();
                return tab2;
            case 2:
                HistoryFragment tab3 = new HistoryFragment();
                return tab3;
            case 3:
                SportFragment tab4 = new SportFragment();
                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}