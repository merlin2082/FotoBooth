package com.divianaci.fotobooth.activity;

import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ViewAnimator;

import com.divianaci.fotobooth.R;
import com.divianaci.fotobooth.fragment.GeneralOptionsFragment;
import com.divianaci.fotobooth.fragment.UploadOptionsFragment;
import com.divianaci.fotobooth.listener.FotoBoothTabListener;

public class OptionActivity extends BaseFotoBoothActivity {

    ActionBar.Tab mGeneralOptionsTab, mUploadOptionsTab;
    Fragment mGeneralOptionFragment = new GeneralOptionsFragment();
    Fragment mUploadOptionsFragment = new UploadOptionsFragment();
    ViewAnimator mOptionViewAnimator;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        mGeneralOptionsTab = actionBar.newTab().setText("1");
        mUploadOptionsTab = actionBar.newTab().setText("2");


        mGeneralOptionsTab.setTabListener(new FotoBoothTabListener(mGeneralOptionFragment));
        mUploadOptionsTab.setTabListener(new FotoBoothTabListener(mUploadOptionsFragment));

        actionBar.addTab(mGeneralOptionsTab);
        actionBar.addTab(mUploadOptionsTab);

        mOptionViewAnimator = new ViewAnimator(getApplicationContext());

    }

    private void showGeneralOptions() {
        if (R.layout.fragment_general_options != mOptionViewAnimator.getDisplayedChild()) {
            mOptionViewAnimator.showNext();
        }
    }

    private void showUploadOptions() {
        if (R.layout.fragment_upload_options != mOptionViewAnimator.getDisplayedChild()) {
            mOptionViewAnimator.showNext();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_option, menu);
        return true;
    }

}
