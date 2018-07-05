package com.ramuan;

import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.content.Intent;


public class Splash extends Activity {
	ImageView splas;;
	private static int splashInterval = 2000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
	
		new Handler().postDelayed(new Runnable(){
			
	@Override
	public void run(){
	Intent i = new Intent(Splash.this, Main_activity.class);
	startActivity(i);
	
	finish();
	}
	},splashInterval);
	};
}
