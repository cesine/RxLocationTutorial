package com.sidereo.rxll;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.InstrumentationTestCase;
import android.util.Log;

import com.sidereo.rxll.MainActivity;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    Activity mActivity;

    public void testRunButton() throws Exception {
        Log.v("MainActivityTest", "testRunButton");
        Assert.assertNotNull(mActivity);
    }

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
        protected void setUp() throws Exception {
        Log.v("MainActivityTest", "setUp");
        super.setUp();
        mActivity = getActivity();
    }
}