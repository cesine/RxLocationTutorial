package com.sidereo.rxll;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.util.Log;

/**
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mActivity;

    public void testStartStopButton() throws Exception {
        Log.v("MainActivityTest", "testRunButton");
        getInstrumentation().waitForIdleSync();

        TouchUtils.clickView(this, mActivity.getStartStopButton());

        getInstrumentation().waitForIdleSync();
        assertNotNull(mActivity);
        assertNotNull(mActivity.getLocationObservable());
    }

    public void testBikeButton() throws Exception {
        Log.v("MainActivityTest", "testRunButton");
        getInstrumentation().waitForIdleSync();

        assertNotNull(mActivity);
        assertNotNull(mActivity.getBikeButton());
    }

    public void testRunButton() throws Exception {
        Log.v("MainActivityTest", "testRunButton");
        getInstrumentation().waitForIdleSync();

        assertNotNull(mActivity);
        assertNotNull(mActivity.getRunButton());
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

        assertNotNull(mActivity);
        assertNotNull(mActivity.getLocationObservable());
        assertNotNull(mActivity.getBikeButton());
        assertNotNull(mActivity.getRunButton());
        assertNotNull(mActivity.getStartStopButton());
        assertNotNull(mActivity.getLocationTextView());
    }
}