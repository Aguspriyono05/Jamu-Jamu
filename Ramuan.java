package com.ramuan;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.content.Intent;

public class Ramuan extends Activity {
	ImageView kanker, diabetes, hepatitis,kista, prostat, stroke;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ramuan);
        kanker	= (ImageView) findViewById(R.id.imageButton1);
		diabetes	= (ImageView) findViewById(R.id.imageButton2);
		hepatitis	= (ImageView) findViewById(R.id.imageButton3);
		kista	= (ImageView) findViewById(R.id.imageButton4);
		prostat	= (ImageView) findViewById(R.id.imageButton5);
		stroke	= (ImageView) findViewById(R.id.imageButton6);
		
		
		Animation anim_show1 = AnimationUtils.loadAnimation(this, R.anim.linier2);
		Animation anim_show2 = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
		Animation anim_show3 = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
		anim_show2.setStartOffset(500);
		anim_show3.setStartOffset(1000);
		kanker.setVisibility(View.VISIBLE);
		kanker.setAnimation(anim_show3);
		
		diabetes.setVisibility(View.VISIBLE);
		diabetes.setAnimation(anim_show3);
		
		hepatitis.setVisibility(View.VISIBLE);
		hepatitis.setAnimation(anim_show2);
		
		kista.setVisibility(View.VISIBLE);
		kista.setAnimation(anim_show2);
		
		prostat.setVisibility(View.VISIBLE);
		prostat.setAnimation(anim_show1);
		
		stroke.setVisibility(View.VISIBLE);
		stroke.setAnimation(anim_show1);
	}
	public void go_ramuan1 (View view) {
		Intent intent = new Intent(Ramuan.this, R_kanker.class);
		startActivity(intent);
	}
	public void go_ramuan2 (View view) {
		Intent intent = new Intent(Ramuan.this, R_diabetes.class);
		startActivity(intent);
	}
	public void go_ramuan3 (View view) {
		Intent intent = new Intent(Ramuan.this, R_hepatitis.class);
		startActivity(intent);
	}
	public void go_ramuan4 (View view) {
		Intent intent = new Intent(Ramuan.this, R_kista.class);
		startActivity(intent);
	}
	public void go_ramuan5 (View view) {
		Intent intent = new Intent(Ramuan.this, R_prostat.class);
		startActivity(intent);
	}
	public void go_ramuan6 (View view) {
		Intent intent = new Intent(Ramuan.this, R_stroke.class);
		startActivity(intent);
	}
}

