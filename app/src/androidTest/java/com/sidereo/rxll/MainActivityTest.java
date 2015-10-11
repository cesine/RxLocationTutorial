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
        Assert.assertNotNull(mActivity.getRunButton());
        mActivity.getRunButton().performClick();
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
        Assert.assertNotNull(mActivity.getBikeButton());
        Assert.assertNotNull(mActivity.getRunButton());
        Assert.assertNotNull(mActivity.getStartStopButton());
        Assert.assertNotNull(mActivity.getLocationTextView());
//        Assert.assertNotNull(mActivity.getSubscription());
    }
}