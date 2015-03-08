package com.divianaci.fotobooth.activity;

import android.os.Bundle;
import android.view.Menu;

import com.divianaci.fotobooth.R;


public class FotoBoothActivity extends BaseFotoBoothActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_booth);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_foto_booth, menu);
        return true;
    }
}
