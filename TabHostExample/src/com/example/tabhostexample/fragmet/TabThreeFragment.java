package com.example.tabhostexample.fragmet;

import com.example.tabhostexample.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabThreeFragment extends Fragment {
	
	public View mView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		mView = inflater.inflate(R.layout.tabthree_fragment, container, false);
		
		return mView;
	}
	
	

}
