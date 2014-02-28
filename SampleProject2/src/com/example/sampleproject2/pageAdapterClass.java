package com.example.sampleproject2;

import com.example.sampleproject2.fragmet.TabOneFragment;
import com.example.sampleproject2.fragmet.TabThreeFragment;
import com.example.sampleproject2.fragmet.TabTwoFragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class pageAdapterClass extends FragmentPagerAdapter{
	
	private static final int NUM_PAGES = 3;

	private Context mContext;
	
	public pageAdapterClass(Context context, FragmentManager fm) {
		super(fm);
		this.mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		Fragment mFragment = new Fragment();
		switch(position){
		case 0:
			mFragment = TabOneFragment.newInstance(mContext);
			break;
		case 1:
			mFragment = TabTwoFragment.newInstance(mContext);
			break;
		case 2:
			mFragment = TabThreeFragment.newInstance(mContext);
			break;
		}
		return mFragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return NUM_PAGES;
	}

}
