package com.divianaci.fotobooth.listener;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;

import com.divianaci.fotobooth.R;

/**
 * Created by Merlin on 2/1/2015.
 */
public class FotoBoothTabListener implements ActionBar.TabListener {
    Fragment mFragment;

    public FotoBoothTabListener(Fragment fragment) {
        mFragment = fragment;
    }

    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.activity_option_container, mFragment);
    }

    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.remove(mFragment);
    }

    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // nothing done here
    }
}
