package com.ramuan;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ViewFlipper;
import android.content.Intent;

public class R_hepatitis extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.r_hepatitis);
		ViewFlipper slideshow = (ViewFlipper)findViewById(R.id.imageView1);
		slideshow.startFlipping();
	}
}

