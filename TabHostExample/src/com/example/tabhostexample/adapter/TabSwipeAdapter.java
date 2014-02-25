package com.example.tabhostexample.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tabhostexample.fragmet.TabOneFragment;
import com.example.tabhostexample.fragmet.TabThreeFragment;
import com.example.tabhostexample.fragmet.TabTwoFragment;

public class TabSwipeAdapter extends FragmentPagerAdapter {

	public TabSwipeAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int index) {
		
		switch(index){
		case 0:
			
			return new TabOneFragment();
			 
		case 1:
			
			return new TabTwoFragment();
		case 2 :
			
			return new TabThreeFragment();
		}
		
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

}
