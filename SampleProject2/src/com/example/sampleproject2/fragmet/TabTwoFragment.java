package com.example.sampleproject2.fragmet;
	

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sampleproject2.R;

public class TabTwoFragment extends Fragment {
	
	public static final String MESSAGE = "MESSAGE";
	
	private ViewGroup mView;
	private TextView mTextView;
	
	public static final TabTwoFragment newInstance(Context context){
		TabTwoFragment twoFrag = new TabTwoFragment();
	
		
		return twoFrag;
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	
		mView = (ViewGroup) inflater.inflate(R.layout.tabtwo_fragment, null);
		
		
		return mView; 
	}
	
	

}
