package com.ramuan;

import com.ramuan.R;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.content.DialogInterface;
import android.content.Intent;

public class Main_activity extends Activity {
	ImageView awal, about;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        awal	= (ImageView) findViewById(R.id.imageButton1);
		about	= (ImageView) findViewById(R.id.imageButton2);
		
		
		Animation anim_show1 = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
		Animation anim_show2 = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
		anim_show2.setStartOffset(500);
		awal.setVisibility(View.VISIBLE);
		awal.setAnimation(anim_show1);
		
		about.setVisibility(View.VISIBLE);
		about.setAnimation(anim_show2);
		
		
    }
	public void go_awal (View view) {
		Intent intent = new Intent(Main_activity.this, Awal.class);
		startActivity(intent);
	}
	
	public void go_about (View view) {
		Intent intent = new Intent(Main_activity.this, About.class);
		startActivity(intent);
	}

	public void onBackPressed() {
		  new AlertDialog.Builder(this)
		    .setIcon(R.drawable.logo2)
		    .setTitle("EXIT")
		    .setMessage("Apakah anda yakin ingin keluar dari aplikasi ?")
		    .setPositiveButton("Ya", new DialogInterface.OnClickListener(){
		      @Override
		      public void onClick(DialogInterface dialog, int which) {
		        finish();    
		      }
		    })
		    .setNegativeButton("Tidak", null)
		    .show();
		}
	}


