package com.example.sampleproject2;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class LstViewAdapter extends BaseAdapter {
	private Context mContext;
	LayoutInflater mInflater;
	ArrayList<HashMap<String, String>> data;
	HashMap<String, String> result = new HashMap<String, String>();
	

	@Override
	public int getCount() {

		return data.size();
	}

	@Override
	public Object getItem(int position) {

		return data.get(position);
	}

	@Override
	public long getItemId(int position) {

		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		TextView itemText;
		 mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		 
		 View mListItem = (ViewGroup)mInflater.inflate(android.R.layout.simple_list_item_1, parent,false);
		 result = data.get(position);
		 
		 itemText = (TextView) mInflater.inflate(android.R.id.title, parent, false);
		 itemText.setText("");
		
		
		return mListItem;
	}

}
