package com.jakewharton.android.viewpagerindicator.sample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.jakewharton.android.view.CirclePageIndicator;

public class SampleCirclesStyledMethods extends BaseSampleActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simple_circles);
		
		mAdapter = new TestFragmentAdapter(getSupportFragmentManager());
		
		mPager = (ViewPager)findViewById(R.id.pager);
		mPager.setAdapter(mAdapter);
		
		CirclePageIndicator indicator = (CirclePageIndicator)findViewById(R.id.indicator);
		indicator.setViewPager(mPager);
		
		final float density = getResources().getDisplayMetrics().density;
		indicator.setBackgroundColor(0xFFCCCCCC);
		indicator.setRadius(10 * density);
		indicator.setFillColor(0xFF888888);
		indicator.setStrokeColor(0xFF000000);
		indicator.setStrokeWidth(2 * density);
	}
}