package com.tourguide.v1;





import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	 
    // Google Map
    private GoogleMap googleMap;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
     
    }
    
    public void viewMap(View v){
    	
    	Intent intent=new Intent(this, Map.class);
    	startActivity(intent);
    	
    }
    
 public void Login(View v){
    	
    	Intent intent=new Intent(this, Login.class);
    	startActivity(intent);
    	
    }
 
}