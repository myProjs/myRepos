package com.example.sampleproject2.fragmet;



import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sampleproject2.R;

public class TabThreeFragment extends Fragment {
	
	public static final String MESSAGE = "MESSAGE";
	public ViewGroup mView;
	
	private TextView mTextView;
	
	public static final TabThreeFragment newInstance(Context context){
		TabThreeFragment threeFrag = new TabThreeFragment();
	
		
		return threeFrag;
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		mView = (ViewGroup) inflater.inflate(R.layout.tabthree_fragment, null);
		
		
		return mView;
	}
	
	

}
