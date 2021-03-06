package com.example.fargment_27_10_20;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class myAdapter extends FragmentPagerAdapter {
    public final List<Fragment> myFragmentList = new ArrayList<>();
    public final List<String> myFragmentTitle = new ArrayList<>();
    public Context context;

    public myAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return myFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return myFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        myFragmentList.add(fragment);
        myFragmentTitle.add(title);
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return myFragmentTitle.get(position);
    }
}

