package com.divianaci.fotobooth.activity;

import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

import com.divianaci.fotobooth.R;

/**
 * Created by Merlin on 2/1/2015.
 */
public abstract class BaseFotoBoothActivity extends ActionBarActivity {
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
