package com.Radson.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

public class Mainda extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LinearLayout ss=(LinearLayout)findViewById(R.id.lay1);
		ss.setVisibility(LinearLayout.GONE);
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent asdf = new Intent(getApplicationContext(),
						Firstactivity.class);
				startActivity(asdf);
			}
		}, 3000);
	} 
}
