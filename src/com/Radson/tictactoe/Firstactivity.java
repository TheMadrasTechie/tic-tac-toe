package com.Radson.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdView;
import com.google.ads.InterstitialAd;

public class Firstactivity extends ActionBarActivity implements AdListener {

	
	private InterstitialAd interstitialAds ;
	private AdView adview;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		//banner ads
				adview=(AdView)this.findViewById(R.id.adView);
				AdRequest re=new AdRequest();
				re.setTesting(true);
				adview.loadAd(re);
		 
		//interstitial ads
				this.interstitialAds = new InterstitialAd(this, "ca-app-pub-2805037520028203/7026873179");
				this.interstitialAds.setAdListener(this);
				AdRequest adr = new AdRequest();
				interstitialAds.loadAd(adr);
	
				final TextView tvt = (TextView)findViewById(R.id.textView1);
				tvt.setText("TIC TAC TOE");
				SharedPreferences sharedPreferences = getSharedPreferences("shp",Context.MODE_PRIVATE);
				final SharedPreferences.Editor editor = sharedPreferences.edit();
				final LinearLayout ll2 = (LinearLayout)findViewById(R.id.layout1);
				ll2.setVisibility(LinearLayout.GONE);
				final Button playX = (Button)findViewById(R.id.button17);
				final Button playO = (Button)findViewById(R.id.button18);
				playX.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						final TextView tvt = (TextView)findViewById(R.id.textView1);
						tvt.setText("TIC TAC TOE");
						playX.setText("Play as - X");
						playO.setText("Play as - O");
						playX.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent xxx = new Intent(getApplicationContext(),MainActivity.class);
								xxx.putExtra("xx", "X");
								xxx.putExtra("yy", "O");
								startActivity(xxx);
								editor.putString("b1", " ");
								editor.putString("b2", " ");
								editor.putString("b3", " ");
								editor.putString("b4", " ");
								editor.putString("b5", " ");
								editor.putString("b6", " ");
								editor.putString("b7", " ");
								editor.putString("b8", " ");
								editor.putString("b9", " ");
								editor.putString("b10", " ");
								editor.putString("b11", " ");
								editor.putString("b12", " ");
								editor.putString("b13", " ");
								editor.putString("b14", " ");
								editor.putString("b15", " ");
								editor.putString("b16", " ");
								editor.commit();
							}
						});
						playO.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Intent xxx = new Intent(getApplicationContext(),MainActivity.class);
								xxx.putExtra("xx", "O");
								xxx.putExtra("yy", "X");
								startActivity(xxx);
								editor.putString("b1", " ");
								editor.putString("b2", " ");
								editor.putString("b3", " ");
								editor.putString("b4", " ");
								editor.putString("b5", " ");
								editor.putString("b6", " ");
								editor.putString("b7", " ");
								editor.putString("b8", " ");
								editor.putString("b9", " ");
								editor.putString("b10", " ");
								editor.putString("b11", " ");
								editor.putString("b12", " ");
								editor.putString("b13", " ");
								editor.putString("b14", " ");
								editor.putString("b15", " ");
								editor.putString("b16", " ");
								editor.commit();
							}
						});
					}
				});
				playO.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent xxx = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=dUtNmcVBSs0"));
						xxx.putExtra("xx", "value");
						startActivity(xxx);
						}
				});
			}



	@Override
	public void onDismissScreen(Ad arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFailedToReceiveAd(Ad arg0, ErrorCode arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLeaveApplication(Ad arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPresentScreen(Ad arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReceiveAd(Ad arg0) {
		// TODO Auto-generated method stub
		interstitialAds.show();

	}
}
