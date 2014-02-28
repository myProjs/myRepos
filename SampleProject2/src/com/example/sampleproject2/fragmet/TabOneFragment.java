package com.example.sampleproject2.fragmet;


import com.example.sampleproject2.R;

import android.content.Context;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ListView;
import android.widget.TextView;

public class TabOneFragment extends Fragment  {
	
	public static final String MESSAGE = "MESSAGE";
	
	private View mView;
	private ListView mListView;
	
	
	public static final TabOneFragment newInstance(Context context){
		TabOneFragment oneFrag = new TabOneFragment();
	
		return oneFrag;
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		mView = (ViewGroup)inflater.inflate(R.layout.tabone_fragment, null);
		mListView = (ListView) mView.findViewById(R.id.tab_one_list);

		return mView;
	}
	
	

	
	

}
