package com.android.octsun;

import android.app.Activity;
import android.os.Bundle;

public class OctSun extends Activity {

    private OctSunView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new OctSunView(this);
        setContentView(mView);
    }
}
