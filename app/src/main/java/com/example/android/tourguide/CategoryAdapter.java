package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.content.res.Resources;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionFragment();
        } else if (position == 1) {
            return new SportsFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new EatsFragment();
        }
    }

    @Override
    public int getCount(){
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getResources().getString(R.string.category_attraction);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.category_sports);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.category_parks);
        } else {
            return mContext.getResources().getString(R.string.category_eats);
        }
    }
}

