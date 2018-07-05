package com.ramuan;

import com.ramuan.R;
import android.widget.ViewFlipper;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;

public class R_kanker extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.r_kanker);
		ViewFlipper slideshow = (ViewFlipper)findViewById(R.id.imageView1);
		slideshow.startFlipping();

	}
}
