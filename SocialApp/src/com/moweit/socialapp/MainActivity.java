package com.moweit.socialapp;

import com.scringo.Scringo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	Scringo scringo = new Scringo(this);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		scringo.init();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onStart() {
	        super.onStart();
	        scringo.onStart();
	}

	@Override
	protected void onStop() {
	        super.onStop();
	        scringo.onStop();
	}
	
	@Override
	public void onBackPressed() {
	        if (!scringo.onBackPressed()) {
	                super.onBackPressed();
	        }
	}
}
