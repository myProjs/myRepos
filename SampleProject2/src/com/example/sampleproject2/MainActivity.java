package com.example.sampleproject2;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;

public class MainActivity extends FragmentActivity {

	private pageAdapterClass mPageAdapterClass;
	private ViewPager mPageViewPager;
	public static final String URL = "http://54.218.73.244:7004/DescriptionSortedPrice/";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ActionBar mActionBar = getActionBar();
		mActionBar.setDisplayShowTitleEnabled(false);
		
		mPageViewPager = (ViewPager) findViewById(R.id.pager);
		mPageAdapterClass = new pageAdapterClass(getApplicationContext(), getSupportFragmentManager());
		mPageViewPager.setAdapter(mPageAdapterClass);
		
		
		
	}


}
