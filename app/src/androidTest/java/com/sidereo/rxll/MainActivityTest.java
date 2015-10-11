package com.sidereo.rxll;

import android.app.Activity;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.InstrumentationTestCase;
import android.util.Log;

import com.sidereo.rxll.MainActivity;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mActivity;

    public void testRunButton() throws Exception {
        Log.v("MainActivityTest", "testRunButton");
        getInstrumentation().waitForIdleSync();

        Assert.assertNotNull(mActivity);
        Assert.assertNotNull(mActivity.getRun());
        mActivity.getRun().performClick();
    }

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
        protected void setUp() throws Exception {
        Log.v("MainActivityTest", "setUp");
        super.setUp();
        mActivity = getActivity();
        getInstrumentation().waitForIdleSync();

        Assert.assertNotNull(mActivity);
        Assert.assertNotNull(mActivity.getLocationObservable());
        Assert.assertNotNull(mActivity.getBike());
        Assert.assertNotNull(mActivity.getBike());
        Assert.assertNotNull(mActivity.getRun());
        Assert.assertNotNull(mActivity.getStartStop());
        Assert.assertNotNull(mActivity.getLocation());
//        Assert.assertNotNull(mActivity.getSubscription());
    }
}