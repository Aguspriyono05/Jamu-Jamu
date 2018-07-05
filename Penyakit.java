package com.ramuan;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.content.Intent;

public class Penyakit extends Activity {
	ImageView kanker, diabetes, hepatitis,kista, prostat, stroke;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.penyakit);
        kanker	= (ImageView) findViewById(R.id.imageButton1);
		diabetes	= (ImageView) findViewById(R.id.imageButton2);
		hepatitis	= (ImageView) findViewById(R.id.imageButton3);
		kista	= (ImageView) findViewById(R.id.imageButton4);
		prostat	= (ImageView) findViewById(R.id.imageButton5);
		stroke	= (ImageView) findViewById(R.id.imageButton6);
		
		
		Animation anim_show1 = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
		Animation anim_show2 = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
		Animation anim_show3 = AnimationUtils.loadAnimation(this, R.anim.linier);
		anim_show1.setStartOffset(500);
		anim_show2.setStartOffset(1000);
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
	public void go_kanker (View view) {
		Intent intent = new Intent(Penyakit.this, Kanker.class);
		startActivity(intent);
	}
	public void go_diabetes (View view) {
		Intent intent = new Intent(Penyakit.this, Diabetes.class);
		startActivity(intent);
	}
	public void go_hepatitis (View view) {
		Intent intent = new Intent(Penyakit.this, Hepatitis.class);
		startActivity(intent);
	}
	public void go_kista (View view) {
		Intent intent = new Intent(Penyakit.this, Kista.class);
		startActivity(intent);
	}
	public void go_stroke (View view) {
		Intent intent = new Intent(Penyakit.this, Stroke.class);
		startActivity(intent);
	}
	public void go_prostat (View view) {
		Intent intent = new Intent(Penyakit.this, Prostat.class);
		startActivity(intent);
	}
}
