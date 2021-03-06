package com.farukydnn.weatherplus.ui.dashboard;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.farukydnn.weatherplus.core.ui.BaseActivity;
import com.farukydnn.weatherplus.R;


public class MainActivity extends BaseActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        Log.d(TAG, "init");

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
    }
}
