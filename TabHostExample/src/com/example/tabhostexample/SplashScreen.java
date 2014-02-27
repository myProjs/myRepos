package com.example.tabhostexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashScreen extends Activity {
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
			
		setContentView(R.layout.splashscreen_activity);
		
		Handler mHandler = new Handler();
		mHandler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				
				Intent intent = new Intent (getApplicationContext(), Home.class);
				startActivity(intent);
				
				finish();
				
			}
		}, 3000);
	}
	
	

}
