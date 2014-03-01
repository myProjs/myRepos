package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	  private static String url = "http://samsungacademy.azurewebsites.net/api/v1/utilities/sellers/list?format=json";
	 
	// JSON Node names
	    private static final String ID = "id";;
	    private static final String NAME = "name";
	    private static final String CARRIERCODE = "CarrierCode";
	    private static final String VIDEOWISTIACODE = "VideoWistiaId";
	    private static final String MOBILEUWISTIACODE = "MobileUWistiaId";
	    static InputStream iStream = null;
	    static JSONArray jarray = null;
	    static String json = "";
	   static TextView tv;
	    
	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.text);
		
		new ProgressTask().execute(url);
	}
	
	private static class ProgressTask extends AsyncTask<String, String , String > {
		   
	 
	    
	@Override
	protected String doInBackground(String... urls) {
	
	StringBuilder builder = new StringBuilder();
	for(String url:urls){

	            try {
	              HttpClient client = new DefaultHttpClient();
	              HttpGet httpGet = new HttpGet(url);
	              HttpResponse response = client.execute(httpGet);
	              HttpEntity entity = response.getEntity();
	              iStream = entity.getContent();
	              }
	            catch(Exception e){
	              Log.e("JSON Parser", "Error in http connection "+e.toString());
	              }
	          
	          //convert response to string
	            try{
	        BufferedReader reader = new BufferedReader(new InputStreamReader(iStream,"iso-8859-1"),8);
	        String line = null;
	        while ((line = reader.readLine()) != null) {
	        builder.append(line + "\n");
	        }
	        iStream.close();
	        json=builder.toString();
	        }catch(Exception e){
	        Log.e("JSON Parser", "Error converting result "+e.toString());
	        }
	}
	return json;
	    }  
	     
	            @Override
	            protected void onPostExecute(String result) {
	            	ArrayList<String> carriers = new ArrayList<String>();
	            try{
	                JSONArray json = new JSONArray(result);
	                String response = json.toString();
	
	                for(int i=0;i < json.length(); i++){	
	            
	            JSONObject c = json.getJSONObject(i);
	            carriers.add(c.optString("CarrierCode"));
 
               }
	                String mResultCarriers = carriers.toString();
	                //tv.setText(mResultCarriers);
	               
	                
	                
	            }catch (JSONException e) {
	                Log.e("log_tag", "Error parsing data "+e.toString());
	                }  
	            
	    }  
	            
	}
}




