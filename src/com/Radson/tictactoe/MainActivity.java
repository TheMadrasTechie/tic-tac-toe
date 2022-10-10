package com.Radson.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdView;
import com.google.ads.InterstitialAd;

public class MainActivity extends ActionBarActivity implements AdListener {

	
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
	
				final SharedPreferences sharedPreferences = getSharedPreferences("shp",Context.MODE_PRIVATE);
				final SharedPreferences.Editor editor = sharedPreferences.edit();
				final LinearLayout ll2 = (LinearLayout) findViewById(R.id.layout2);
				ll2.setVisibility(LinearLayout.GONE);
				final Intent xxx = getIntent();
				final Button b1 = (Button) findViewById(R.id.button1);
				final Button b2 = (Button) findViewById(R.id.button2);
				final Button b3 = (Button) findViewById(R.id.button3);
				final Button b4 = (Button) findViewById(R.id.button4);
				final Button b5 = (Button) findViewById(R.id.button5);
				final Button b6 = (Button) findViewById(R.id.button6);
				final Button b7 = (Button) findViewById(R.id.button7);
				final Button b8 = (Button) findViewById(R.id.button8);
				final Button b9 = (Button) findViewById(R.id.button9);
				final Button b10 = (Button) findViewById(R.id.button10);
				final Button b11 = (Button) findViewById(R.id.button11);
				final Button b12 = (Button) findViewById(R.id.button12);
				final Button b13 = (Button) findViewById(R.id.button13);
				final Button b14 = (Button) findViewById(R.id.button14);
				final Button b15 = (Button) findViewById(R.id.button15);
				final Button b16 = (Button) findViewById(R.id.button16);
					b1.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub 	
							if(sharedPreferences.getString("b1", "").equals(" "))
							{
								b1.setText(xxx.getStringExtra("xx"));
								editor.putString("b1", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(" "))
								{
									b4.setText(xxx.getStringExtra("yy"));
									editor.putString("b4", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(" "))
									{
										b2.setText(xxx.getStringExtra("yy"));
										editor.putString("b2", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(" "))
										{
											b3.setText(xxx.getStringExtra("yy"));
											editor.putString("b3", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
											if(sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(" "))
											{
												b11.setText(xxx.getStringExtra("yy"));
												editor.putString("b11", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(" "))
												{
													b6.setText(xxx.getStringExtra("yy"));
													editor.putString("b6", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(" "))
													{
														b16.setText(xxx.getStringExtra("yy"));
														editor.putString("b16", xxx.getStringExtra("yy"));
														editor.commit();
													}	
													else
													{
								if(sharedPreferences.getString("b6", "").equals(" "))
								{
									b6.setText(xxx.getStringExtra("yy"));
									editor.putString("b6", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
								
									if(sharedPreferences.getString("b11", "").equals(" "))
									{
										b11.setText(xxx.getStringExtra("yy"));
										editor.putString("b11", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b16", "").equals(" "))
										{
											b16.setText(xxx.getStringExtra("yy"));
											editor.putString("b16", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b2", "").equals(" "))
											{
												b2.setText(xxx.getStringExtra("yy"));
												editor.putString("b2", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b10", "").equals(" "))
														{
															b10.setText(xxx.getStringExtra("yy"));
															editor.putString("b10", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b4", "").equals(" "))
															{
																b4.setText(xxx.getStringExtra("yy"));
																editor.putString("b4", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
															if(sharedPreferences.getString("b7", "").equals(" "))
															{
																b7.setText(xxx.getStringExtra("yy"));
																editor.putString("b7", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b5", "").equals(" "))
																{
																	b5.setText(xxx.getStringExtra("yy"));
																	editor.putString("b5", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
											
								}
								}
												}
											}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b2.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b2", "").equals(" "))
							{
								b2.setText(xxx.getStringExtra("xx"));
								editor.putString("b2", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(" "))
								{
									b6.setText(xxx.getStringExtra("yy"));
									editor.putString("b6", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(" "))
									{
										b10.setText(xxx.getStringExtra("yy"));
										editor.putString("b10", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(" "))
										{
											b14.setText(xxx.getStringExtra("yy"));
											editor.putString("b14", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
											if(sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(" "))
											{
												b4.setText(xxx.getStringExtra("yy"));
												editor.putString("b4", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(" "))
												{
													b1.setText(xxx.getStringExtra("yy"));
													editor.putString("b1", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}	
													else
													{
								if(sharedPreferences.getString("b3", "").equals(" "))
								{
									b3.setText(xxx.getStringExtra("yy"));
									editor.putString("b3", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b6", "").equals(" "))
									{
										b6.setText(xxx.getStringExtra("yy"));
										editor.putString("b6", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b1", "").equals(" "))
										{
											b1.setText(xxx.getStringExtra("yy"));
											editor.putString("b1", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b11", "").equals(" "))
											{
												b11.setText(xxx.getStringExtra("yy"));
												editor.putString("b11", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b5", "").equals(" "))
													{
														b5.setText(xxx.getStringExtra("yy"));
														editor.putString("b5", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b10", "").equals(" "))
														{
															b10.setText(xxx.getStringExtra("yy"));
															editor.putString("b10", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b7", "").equals(" "))
															{
																b7.setText(xxx.getStringExtra("yy"));
																editor.putString("b7", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b4", "").equals(" "))
																	{
																		b4.setText(xxx.getStringExtra("yy"));
																		editor.putString("b4", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
												}
					}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
				}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b3.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b3", "").equals(" "))
							{
								b3.setText(xxx.getStringExtra("xx"));
								editor.putString("b3", xxx.getStringExtra("xx"));
								editor.commit();
								
								if(sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(" "))
								{
									b15.setText(xxx.getStringExtra("yy"));
									editor.putString("b15", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(" "))
									{
										b11.setText(xxx.getStringExtra("yy"));
										editor.putString("b11", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(" "))
										{
											b7.setText(xxx.getStringExtra("yy"));
											editor.putString("b7", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
											if(sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(" "))
											{
												b4.setText(xxx.getStringExtra("yy"));
												editor.putString("b4", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(" "))
												{
													b1.setText(xxx.getStringExtra("yy"));
													editor.putString("b1", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(" "))
													{
														b2.setText(xxx.getStringExtra("yy"));
														editor.putString("b2", xxx.getStringExtra("yy"));
														editor.commit();
													}	
													else
													{
								if(sharedPreferences.getString("b2", "").equals(" "))
								{
									b2.setText(xxx.getStringExtra("yy"));
									editor.putString("b2", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b7", "").equals(" "))
									{
										b7.setText(xxx.getStringExtra("yy"));
										editor.putString("b7", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b4", "").equals(" "))
										{
											b4.setText(xxx.getStringExtra("yy"));
											editor.putString("b4", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b11", "").equals(" "))
											{
												b11.setText(xxx.getStringExtra("yy"));
												editor.putString("b11", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b1", "").equals(" "))
													{
														b1.setText(xxx.getStringExtra("yy"));
														editor.putString("b1", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b10", "").equals(" "))
														{
															b10.setText(xxx.getStringExtra("yy"));
															editor.putString("b10", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b5", "").equals(" "))
															{
																b5.setText(xxx.getStringExtra("yy"));
																editor.putString("b5", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b6", "").equals(" "))
																				{
																					b6.setText(xxx.getStringExtra("yy"));
																					editor.putString("b6", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
									}
								}
							}
												}
											}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b4.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b4", "").equals(" "))
							{
								b4.setText(xxx.getStringExtra("xx"));
								editor.putString("b4", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(" "))
								{
									b3.setText(xxx.getStringExtra("yy"));
									editor.putString("b3", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(" "))
									{
										b1.setText(xxx.getStringExtra("yy"));
										editor.putString("b1", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(" "))
										{
											b2.setText(xxx.getStringExtra("yy"));
											editor.putString("b2", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
								if(sharedPreferences.getString("b7", "").equals(" "))
								{
									b7.setText(xxx.getStringExtra("yy"));
									editor.putString("b7", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b10", "").equals(" "))
									{
										b10.setText(xxx.getStringExtra("yy"));
										editor.putString("b10", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b13", "").equals(" "))
										{
											b13.setText(xxx.getStringExtra("yy"));
											editor.putString("b13", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b11", "").equals(" "))
											{
												b11.setText(xxx.getStringExtra("yy"));
												editor.putString("b11", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b6", "").equals(" "))
													{
														b6.setText(xxx.getStringExtra("yy"));
														editor.putString("b6", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b8", "").equals(" "))
														{
															b8.setText(xxx.getStringExtra("yy"));
															editor.putString("b8", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b5", "").equals(" "))
															{
																b5.setText(xxx.getStringExtra("yy"));
																editor.putString("b5", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b2", "").equals(" "))
																	{
																		b2.setText(xxx.getStringExtra("yy"));
																		editor.putString("b2", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b3", "").equals(" "))
																			{
																				b3.setText(xxx.getStringExtra("yy"));
																				editor.putString("b3", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b1", "").equals(" "))
																					{
																						b1.setText(xxx.getStringExtra("yy"));
																						editor.putString("b1", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																					else
																					{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
									}
								}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b5.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b5", "").equals(" "))
							{
								b5.setText(xxx.getStringExtra("xx"));
								editor.putString("b5", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b8", " ").equals(" "))
								{
									b8.setText(xxx.getStringExtra("yy"));
									editor.putString("b8", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b8", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(" "))
									{
										b6.setText(xxx.getStringExtra("yy"));
										editor.putString("b6", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b8", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(" "))
										{
											b7.setText(xxx.getStringExtra("yy"));
											editor.putString("b7", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
								if(sharedPreferences.getString("b9", "").equals(" "))
								{
									b9.setText(xxx.getStringExtra("yy"));
									editor.putString("b9", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b6", "").equals(" "))
									{
										b6.setText(xxx.getStringExtra("yy"));
										editor.putString("b6", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b1", "").equals(" "))
										{
											b1.setText(xxx.getStringExtra("yy"));
											editor.putString("b1", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b11", "").equals(" "))
											{
												b11.setText(xxx.getStringExtra("yy"));
												editor.putString("b11", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b2", "").equals(" "))
												{
													b2.setText(xxx.getStringExtra("yy"));
													editor.putString("b2", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b10", "").equals(" "))
														{
															b10.setText(xxx.getStringExtra("yy"));
															editor.putString("b10", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b7", "").equals(" "))
															{
																b7.setText(xxx.getStringExtra("yy"));
																editor.putString("b7", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b4", "").equals(" "))
																					{
																						b4.setText(xxx.getStringExtra("yy"));
																						editor.putString("b4", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																					else
																					{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b6.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b6", "").equals(" "))
							{
								b6.setText(xxx.getStringExtra("xx"));
								editor.putString("b6", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(" "))
								{
									b14.setText(xxx.getStringExtra("yy"));
									editor.putString("b14", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(" "))
									{
										b10.setText(xxx.getStringExtra("yy"));
										editor.putString("b10", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(" "))
										{
											b2.setText(xxx.getStringExtra("yy"));
											editor.putString("b2", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
											if(sharedPreferences.getString("b5", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b8", " ").equals(" "))
											{
												b8.setText(xxx.getStringExtra("yy"));
												editor.putString("b8", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b8", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b5", " ").equals(" "))
												{
													b5.setText(xxx.getStringExtra("yy"));
													editor.putString("b5", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b8", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b5", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(" "))
													{
														b7.setText(xxx.getStringExtra("yy"));
														editor.putString("b7", xxx.getStringExtra("yy"));
														editor.commit();
													}	
													else
													{
														if(sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(" "))
														{
															b11.setText(xxx.getStringExtra("yy"));
															editor.putString("b11", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(" "))
															{
																b1.setText(xxx.getStringExtra("yy"));
																editor.putString("b1", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}	
																else
																{
																	if(sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(" "))
																	{
																		b10.setText(xxx.getStringExtra("yy"));
																		editor.putString("b10", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(" "))
																		{
																			b7.setText(xxx.getStringExtra("yy"));
																			editor.putString("b7", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}	
																			else
																			{
								if(sharedPreferences.getString("b7", "").equals(" "))
								{
									b7.setText(xxx.getStringExtra("yy"));
									editor.putString("b7", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b11", "").equals(" "))
									{
										b11.setText(xxx.getStringExtra("yy"));
										editor.putString("b11", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b10", "").equals(" "))
										{
											b10.setText(xxx.getStringExtra("yy"));
											editor.putString("b10", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b5", "").equals(" "))
											{
												b5.setText(xxx.getStringExtra("yy"));
												editor.putString("b5", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b1", "").equals(" "))
																					{
																						b1.setText(xxx.getStringExtra("yy"));
																						editor.putString("b1", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																					else
																					{
																						if(sharedPreferences.getString("b4", "").equals(" "))
																						{
																							b4.setText(xxx.getStringExtra("yy"));
																							editor.putString("b4", xxx.getStringExtra("yy"));
																							editor.commit();
																						}
																						else
																						{
																					}
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
																		}
																	}
							}
															}
														}
													}
												}
											}
										}}
					}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
				}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b7.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b7", "").equals(" "))
							{
								b7.setText(xxx.getStringExtra("xx"));
								editor.putString("b7", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(" "))
								{
									b15.setText(xxx.getStringExtra("yy"));
									editor.putString("b15", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(" "))
									{
										b11.setText(xxx.getStringExtra("yy"));
										editor.putString("b11", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(" "))
										{
											b3.setText(xxx.getStringExtra("yy"));
											editor.putString("b3", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
											if(sharedPreferences.getString("b5", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b8", " ").equals(" "))
											{
												b8.setText(xxx.getStringExtra("yy"));
												editor.putString("b8", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b8", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b5", " ").equals(" "))
												{
													b5.setText(xxx.getStringExtra("yy"));
													editor.putString("b5", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b8", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b5", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(" "))
													{
														b6.setText(xxx.getStringExtra("yy"));
														editor.putString("b6", xxx.getStringExtra("yy"));
														editor.commit();
													}	
													else
													{		
														if(sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(" "))
														{
															b10.setText(xxx.getStringExtra("yy"));
															editor.putString("b10", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(" "))
															{
																b4.setText(xxx.getStringExtra("yy"));
																editor.putString("b4", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(" "))
																{
																	b13.setText(xxx.getStringExtra("yy"));
																	editor.putString("b13", xxx.getStringExtra("yy"));
																	editor.commit();
																}	
																else
																{
								if(sharedPreferences.getString("b6", "").equals(" "))
								{
									b6.setText(xxx.getStringExtra("yy"));
									editor.putString("b6", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b2", "").equals(" "))
									{
										b2.setText(xxx.getStringExtra("yy"));
										editor.putString("b2", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b5", "").equals(" "))
										{
											b5.setText(xxx.getStringExtra("yy"));
											editor.putString("b5", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b11", "").equals(" "))
											{
												b11.setText(xxx.getStringExtra("yy"));
												editor.putString("b11", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b10", "").equals(" "))
														{
															b10.setText(xxx.getStringExtra("yy"));
															editor.putString("b10", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b1", "").equals(" "))
															{
																b1.setText(xxx.getStringExtra("yy"));
																editor.putString("b1", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b4", "").equals(" "))
																					{
																						b4.setText(xxx.getStringExtra("yy"));
																						editor.putString("b4", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																					else
																					{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
							}
														}
													}
												}
											}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
											
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b8.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b8", "").equals(" "))
							{
								b8.setText(xxx.getStringExtra("xx"));
								editor.putString("b8", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b5", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(" "))
								{
									b6.setText(xxx.getStringExtra("yy"));
									editor.putString("b6", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b5", " ").equals(" "))
									{
										b5.setText(xxx.getStringExtra("yy"));
										editor.putString("b5", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b5", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(" "))
										{
											b6.setText(xxx.getStringExtra("yy"));
											editor.putString("b6", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
								if(sharedPreferences.getString("b12", "").equals(" "))
								{
									b12.setText(xxx.getStringExtra("yy"));
									editor.putString("b12", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b7", "").equals(" "))
									{
										b7.setText(xxx.getStringExtra("yy"));
										editor.putString("b7", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b4", "").equals(" "))
										{
											b4.setText(xxx.getStringExtra("yy"));
											editor.putString("b4", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b11", "").equals(" "))
											{
												b11.setText(xxx.getStringExtra("yy"));
												editor.putString("b11", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b10", "").equals(" "))
														{
															b10.setText(xxx.getStringExtra("yy"));
															editor.putString("b10", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b2", "").equals(" "))
															{
																b2.setText(xxx.getStringExtra("yy"));
																editor.putString("b2", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b5", "").equals(" "))
																	{
																		b5.setText(xxx.getStringExtra("yy"));
																		editor.putString("b5", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b6", "").equals(" "))
																		{
																			b6.setText(xxx.getStringExtra("yy"));
																			editor.putString("bss", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b1", "").equals(" "))
																			{
																				b1.setText(xxx.getStringExtra("yy"));
																				editor.putString("b1", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
								}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b9.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b9", "").equals(" "))
							{
								b9.setText(xxx.getStringExtra("xx"));
								editor.putString("b9", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b12", " ").equals(" "))
								{
									b12.setText(xxx.getStringExtra("yy"));
									editor.putString("b12", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b12", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(" "))
									{
										b10.setText(xxx.getStringExtra("yy"));
										editor.putString("b10", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b12", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(" "))
										{
											b11.setText(xxx.getStringExtra("yy"));
											editor.putString("b11", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
								if(sharedPreferences.getString("b5", "").equals(" "))
								{
									b5.setText(xxx.getStringExtra("yy"));
									editor.putString("b5", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b13", "").equals(" "))
									{
										b13.setText(xxx.getStringExtra("yy"));
										editor.putString("b13", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b10", "").equals(" "))
										{
											b10.setText(xxx.getStringExtra("yy"));
											editor.putString("b10", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b11", "").equals(" "))
											{
												b11.setText(xxx.getStringExtra("yy"));
												editor.putString("b11", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b1", "").equals(" "))
												{
													b1.setText(xxx.getStringExtra("yy"));
													editor.putString("b1", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b6", "").equals(" "))
														{
															b6.setText(xxx.getStringExtra("yy"));
															editor.putString("b6", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b7", "").equals(" "))
															{
																b7.setText(xxx.getStringExtra("yy"));
																editor.putString("b7", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b4", "").equals(" "))
																	{
																		b4.setText(xxx.getStringExtra("yy"));
																		editor.putString("b4", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b2", "").equals(" "))
																			{
																				b2.setText(xxx.getStringExtra("yy"));
																				editor.putString("b2", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
									} 
								}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b10.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b10", "").equals(" "))
							{
								b10.setText(xxx.getStringExtra("xx"));
								editor.putString("b10", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(" "))
								{
									b6.setText(xxx.getStringExtra("yy"));
									editor.putString("b6", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(" "))
									{
										b14.setText(xxx.getStringExtra("yy"));
										editor.putString("b14", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(" "))
										{
											b2.setText(xxx.getStringExtra("yy"));
											editor.putString("b2", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
											if(sharedPreferences.getString("b9", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b12", " ").equals(" "))
											{
												b12.setText(xxx.getStringExtra("yy"));
												editor.putString("b12", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b12", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b9", " ").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b12", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b9", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(" "))
													{
														b11.setText(xxx.getStringExtra("yy"));
														editor.putString("b11", xxx.getStringExtra("yy"));
														editor.commit();
													}	
													else
													{
														if(sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(" "))
														{
															b7.setText(xxx.getStringExtra("yy"));
															editor.putString("b7", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(" "))
															{
																b4.setText(xxx.getStringExtra("yy"));
																editor.putString("b4", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(" "))
																{
																	b13.setText(xxx.getStringExtra("yy"));
																	editor.putString("b13", xxx.getStringExtra("yy"));
																	editor.commit();
																}	
																else
																{
								if(sharedPreferences.getString("b11", "").equals(" "))
								{
									b11.setText(xxx.getStringExtra("yy"));
									editor.putString("b11", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b2", "").equals(" "))
									{
										b2.setText(xxx.getStringExtra("yy"));
										editor.putString("b2", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b5", "").equals(" "))
										{
											b5.setText(xxx.getStringExtra("yy"));
											editor.putString("b5", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b9", "").equals(" "))
											{
												b9.setText(xxx.getStringExtra("yy"));
												editor.putString("b9", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b6", "").equals(" "))
												{
													b6.setText(xxx.getStringExtra("yy"));
													editor.putString("b6", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b1", "").equals(" "))
														{
															b1.setText(xxx.getStringExtra("yy"));
															editor.putString("b1", xxx.getStringExtra("yy"));
							 								editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b7", "").equals(" "))
															{
																b7.setText(xxx.getStringExtra("yy"));
																editor.putString("b7", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b4", "").equals(" "))
																					{
																						b4.setText(xxx.getStringExtra("yy"));
																						editor.putString("b4", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																					else
																					{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
									}
															}
														}
													}
												}
											}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}	
						}
					});
					b11.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b11", "").equals(" "))
							{
								b11.setText(xxx.getStringExtra("xx"));
								editor.putString("b11", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(" "))
								{
									b15.setText(xxx.getStringExtra("yy"));
									editor.putString("b15", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(" "))
									{
										b7.setText(xxx.getStringExtra("yy"));
										editor.putString("b7", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(" "))
										{
											b3.setText(xxx.getStringExtra("yy"));
											editor.putString("b3", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b9", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b12", " ").equals(" "))
											{
												b12.setText(xxx.getStringExtra("yy"));
												editor.putString("b12", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b12", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(" "))
												{
													b10.setText(xxx.getStringExtra("yy"));
													editor.putString("b10", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b12", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b9", " ").equals(" "))
													{
														b9.setText(xxx.getStringExtra("yy"));
														editor.putString("b9", xxx.getStringExtra("yy"));
														editor.commit();
													}	
													else
													{
														if(sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(" "))
														{
															b6.setText(xxx.getStringExtra("yy"));
															editor.putString("b6", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(" "))
															{
																b1.setText(xxx.getStringExtra("yy"));
																editor.putString("b1", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}	
																else
																{
								if(sharedPreferences.getString("b10", "").equals(" "))
								{
									b10.setText(xxx.getStringExtra("yy"));
									editor.putString("b10", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b7", "").equals(" "))
									{
										b7.setText(xxx.getStringExtra("yy"));
										editor.putString("b7", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b15", "").equals(" "))
										{
											b15.setText(xxx.getStringExtra("yy"));
											editor.putString("b15", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b3", "").equals(" "))
											{
												b3.setText(xxx.getStringExtra("yy"));
												editor.putString("b3", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b6", "").equals(" "))
													{
														b6.setText(xxx.getStringExtra("yy"));
														editor.putString("b6", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b1", "").equals(" "))
														{
															b1.setText(xxx.getStringExtra("yy"));
															editor.putString("b1", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b4", "").equals(" "))
															{
																b4.setText(xxx.getStringExtra("yy"));
																editor.putString("b4", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
															if(sharedPreferences.getString("b2", "").equals(" "))
															{
																b2.setText(xxx.getStringExtra("yy"));
																editor.putString("b2", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b5", "").equals(" "))
																					{
																						b5.setText(xxx.getStringExtra("yy"));
																						editor.putString("b5", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																					
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
									}
								}
							}
							}
							}
													}
												}
											}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b12.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b12", "").equals(" "))
							{
								b12.setText(xxx.getStringExtra("xx"));
								editor.putString("b12", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b9", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(" "))
								{
									b11.setText(xxx.getStringExtra("yy"));
									editor.putString("b11", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b9", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(" "))
									{
										b10.setText(xxx.getStringExtra("yy"));
										editor.putString("b10", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b9", " ").equals(" "))
										{
											b9.setText(xxx.getStringExtra("yy"));
											editor.putString("b9", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
								if(sharedPreferences.getString("b8", "").equals(" "))
								{
									b8.setText(xxx.getStringExtra("yy"));
									editor.putString("b8", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b11", "").equals(" "))
									{
										b11.setText(xxx.getStringExtra("yy"));
										editor.putString("b11", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b16", "").equals(" "))
										{
											b16.setText(xxx.getStringExtra("yy"));
											editor.putString("b16", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b5", "").equals(" "))
											{
												b5.setText(xxx.getStringExtra("yy"));
												editor.putString("b5", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b10", "").equals(" "))
														{
															b10.setText(xxx.getStringExtra("yy"));
															editor.putString("b10", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b7", "").equals(" "))
															{
																b7.setText(xxx.getStringExtra("yy"));
																editor.putString("b7", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b2", "").equals(" "))
																{
																	b2.setText(xxx.getStringExtra("yy"));
																	editor.putString("b2", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b6", "").equals(" "))
																	{
																		b6.setText(xxx.getStringExtra("yy"));
																		editor.putString("b6", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b1", "").equals(" "))
																		{
																			b1.setText(xxx.getStringExtra("yy"));
																			editor.putString("b1", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b4", "").equals(" "))
																					{
																						b4.setText(xxx.getStringExtra("yy"));
																						editor.putString("b4", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																					else
																					{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
											}
										}
									}
								}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b13.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b13", "").equals(" "))
							{
								b13.setText(xxx.getStringExtra("xx"));
								editor.putString("b13", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(" "))
								{
									b16.setText(xxx.getStringExtra("yy"));
									editor.putString("b16", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(" "))
									{
										b14.setText(xxx.getStringExtra("yy"));
										editor.putString("b14", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(" "))
										{
											b15.setText(xxx.getStringExtra("yy"));
											editor.putString("b15", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
											if(sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(" "))
											{
												b7.setText(xxx.getStringExtra("yy"));
												editor.putString("b7", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(" "))
												{
													b4.setText(xxx.getStringExtra("yy"));
													editor.putString("b4", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b4", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(" "))
													{
														b10.setText(xxx.getStringExtra("yy"));
														editor.putString("b10", xxx.getStringExtra("yy"));
														editor.commit();
													}	
													else
													{
								if(sharedPreferences.getString("b10", "").equals(" "))
								{
									b10.setText(xxx.getStringExtra("yy"));
									editor.putString("b10", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b7", "").equals(" "))
									{
										b7.setText(xxx.getStringExtra("yy"));
										editor.putString("b7", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b4", "").equals(" "))
										{
											b4.setText(xxx.getStringExtra("yy"));
											editor.putString("b4", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b5", "").equals(" "))
											{
												b5.setText(xxx.getStringExtra("yy"));
												editor.putString("b5", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b2", "").equals(" "))
												{
													b2.setText(xxx.getStringExtra("yy"));
													editor.putString("b2", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b6", "").equals(" "))
														{
															b6.setText(xxx.getStringExtra("yy"));
															editor.putString("b6", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b9", "").equals(" "))
															{
																b9.setText(xxx.getStringExtra("yy"));
																editor.putString("b9", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b11", "").equals(" "))
																			{
																				b11.setText(xxx.getStringExtra("yy"));
																				editor.putString("b11", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b1", "").equals(" "))
																				{
																					b1.setText(xxx.getStringExtra("yy"));
																					editor.putString("b1", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b14", "").equals(" "))
																					{
																						b14.setText(xxx.getStringExtra("yy"));
																						editor.putString("b14", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																					else
																					{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
															}
														}
													}
												}
											}
										}
									}
								}
													}
												}
											}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b14.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b14", "").equals(" "))
							{
								b14.setText(xxx.getStringExtra("xx"));
								editor.putString("b14", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(" "))
								{
									b16.setText(xxx.getStringExtra("yy"));
									editor.putString("b16", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(" "))
									{
										b13.setText(xxx.getStringExtra("yy"));
										editor.putString("b13", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(" "))
										{
											b15.setText(xxx.getStringExtra("yy"));
											editor.putString("b15", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
								if(sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(" "))
								{
									b6.setText(xxx.getStringExtra("yy"));
									editor.putString("b6", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b10", " ").equals(" "))
									{
										b10.setText(xxx.getStringExtra("yy"));
										editor.putString("b10", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b10", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b2", " ").equals(" "))
										{
											b2.setText(xxx.getStringExtra("yy"));
											editor.putString("b2", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
								if(sharedPreferences.getString("b15", "").equals(" "))
								{
									b15.setText(xxx.getStringExtra("yy"));
									editor.putString("b15", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b13", "").equals(" "))
									{
										b13.setText(xxx.getStringExtra("yy"));
										editor.putString("b13", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b10", "").equals(" "))
										{
											b10.setText(xxx.getStringExtra("yy"));
											editor.putString("b10", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b11", "").equals(" "))
											{
												b11.setText(xxx.getStringExtra("yy"));
												editor.putString("b11", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b6", "").equals(" "))
														{
															b6.setText(xxx.getStringExtra("yy"));
															editor.putString("b6", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b7", "").equals(" "))
															{
																b7.setText(xxx.getStringExtra("yy"));
																editor.putString("b7", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b2", "").equals(" "))
																			{
																				b2.setText(xxx.getStringExtra("yy"));
																				editor.putString("b2", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b1", "").equals(" "))
																				{
																					b1.setText(xxx.getStringExtra("yy"));
																					editor.putString("b1", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b4", "").equals(" "))
																					{
																						b4.setText(xxx.getStringExtra("yy"));
																						editor.putString("b4", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																					else
																					{
																					if(sharedPreferences.getString("b5", "").equals(" "))
																					{
																						b5.setText(xxx.getStringExtra("yy"));
																						editor.putString("b5", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																			}
																			}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
										}
									}
								}
							}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b15.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b15", "").equals(" "))
							{
								b15.setText(xxx.getStringExtra("xx"));
								editor.putString("b15", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(" "))
								{
									b7.setText(xxx.getStringExtra("yy"));
									editor.putString("b7", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(" "))
									{
										b11.setText(xxx.getStringExtra("yy"));
										editor.putString("b11", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b7", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b3", " ").equals(" "))
										{
											b3.setText(xxx.getStringExtra("yy"));
											editor.putString("b3", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
											if(sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(" "))
											{
												b16.setText(xxx.getStringExtra("yy"));
												editor.putString("b16", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(" "))
												{
													b13.setText(xxx.getStringExtra("yy"));
													editor.putString("b13", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b16", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(" "))
													{
														b14.setText(xxx.getStringExtra("yy"));
														editor.putString("b14", xxx.getStringExtra("yy"));
														editor.commit();
													}	
													else
													{
								if(sharedPreferences.getString("b14", "").equals(" "))
								{
									b14.setText(xxx.getStringExtra("yy"));
									editor.putString("b14", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b11", "").equals(" "))
									{
										b11.setText(xxx.getStringExtra("yy"));
										editor.putString("b11", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b16", "").equals(" "))
										{
											b16.setText(xxx.getStringExtra("yy"));
											editor.putString("b16", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b6", "").equals(" "))
											{
												b6.setText(xxx.getStringExtra("yy"));
												editor.putString("b6", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b10", "").equals(" "))
														{
															b10.setText(xxx.getStringExtra("yy"));
															editor.putString("b10", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b7", "").equals(" "))
															{
																b7.setText(xxx.getStringExtra("yy"));
																editor.putString("b7", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b5", "").equals(" "))
																{
																	b5.setText(xxx.getStringExtra("yy"));
																	editor.putString("b5", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b12", "").equals(" "))
																		{
																			b12.setText(xxx.getStringExtra("yy"));
																			editor.putString("b12", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b13", "").equals(" "))
																			{
																				b13.setText(xxx.getStringExtra("yy"));
																				editor.putString("b13", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b2", "").equals(" "))
																				{
																					b2.setText(xxx.getStringExtra("yy"));
																					editor.putString("b2", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b4", "").equals(" "))
																					{
																						b4.setText(xxx.getStringExtra("yy"));
																						editor.putString("b4", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																					else
																					{
																					if(sharedPreferences.getString("b1", "").equals(" "))
																					{
																						b1.setText(xxx.getStringExtra("yy"));
																						editor.putString("b1", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
									}
								}	
								}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					b16.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if(sharedPreferences.getString("b16", "").equals(" "))
							{
								b16.setText(xxx.getStringExtra("xx"));
								editor.putString("b16", xxx.getStringExtra("xx"));
								editor.commit();
								if(sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(" "))
								{
									b14.setText(xxx.getStringExtra("yy"));
									editor.putString("b14", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b15", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(" "))
									{
										b13.setText(xxx.getStringExtra("yy"));
										editor.putString("b13", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b14", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b13", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b15", " ").equals(" "))
										{
											b15.setText(xxx.getStringExtra("yy"));
											editor.putString("b15", xxx.getStringExtra("yy"));
											editor.commit();
										}	
										else
										{
											if(sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(" "))
											{
												b6.setText(xxx.getStringExtra("yy"));
												editor.putString("b6", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b11", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(" "))
												{
													b1.setText(xxx.getStringExtra("yy"));
													editor.putString("b1", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b6", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b1", " ").equals(xxx.getStringExtra("xx"))&&sharedPreferences.getString("b11", " ").equals(" "))
													{
														b11.setText(xxx.getStringExtra("yy"));
														editor.putString("b11", xxx.getStringExtra("yy"));
														editor.commit();
													}	
													else
													{
								if(sharedPreferences.getString("b11", "").equals(" "))
								{
									b11.setText(xxx.getStringExtra("yy"));
									editor.putString("b11", xxx.getStringExtra("yy"));
									editor.commit();
								}
								else
								{
									if(sharedPreferences.getString("b6", "").equals(" "))
									{
										b6.setText(xxx.getStringExtra("yy"));
										editor.putString("b6", xxx.getStringExtra("yy"));
										editor.commit();
									}
									else
									{
										if(sharedPreferences.getString("b1", "").equals(" "))
										{
											b1.setText(xxx.getStringExtra("yy"));
											editor.putString("b1", xxx.getStringExtra("yy"));
											editor.commit();
										}
										else
										{
											if(sharedPreferences.getString("b4", "").equals(" "))
											{
												b4.setText(xxx.getStringExtra("yy"));
												editor.putString("b4", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
											if(sharedPreferences.getString("b13", "").equals(" "))
											{
												b13.setText(xxx.getStringExtra("yy"));
												editor.putString("b13", xxx.getStringExtra("yy"));
												editor.commit();
											}
											else
											{
												if(sharedPreferences.getString("b9", "").equals(" "))
												{
													b9.setText(xxx.getStringExtra("yy"));
													editor.putString("b9", xxx.getStringExtra("yy"));
													editor.commit();
												}
												else
												{
													if(sharedPreferences.getString("b3", "").equals(" "))
													{
														b3.setText(xxx.getStringExtra("yy"));
														editor.putString("b3", xxx.getStringExtra("yy"));
														editor.commit();
													}
													else
													{
														if(sharedPreferences.getString("b10", "").equals(" "))
														{
															b10.setText(xxx.getStringExtra("yy"));
															editor.putString("b10", xxx.getStringExtra("yy"));
															editor.commit();
														}
														else
														{
															if(sharedPreferences.getString("b7", "").equals(" "))
															{
																b7.setText(xxx.getStringExtra("yy"));
																editor.putString("b7", xxx.getStringExtra("yy"));
																editor.commit();
															}
															else
															{
																if(sharedPreferences.getString("b16", "").equals(" "))
																{
																	b16.setText(xxx.getStringExtra("yy"));
																	editor.putString("b16", xxx.getStringExtra("yy"));
																	editor.commit();
																}
																else 
																{
																	if(sharedPreferences.getString("b8", "").equals(" "))
																	{
																		b8.setText(xxx.getStringExtra("yy"));
																		editor.putString("b8", xxx.getStringExtra("yy"));
																		editor.commit();
																	}
																	else
																	{
																		if(sharedPreferences.getString("b5", "").equals(" "))
																		{
																			b5.setText(xxx.getStringExtra("yy"));
																			editor.putString("b5", xxx.getStringExtra("yy"));
																			editor.commit();
																		}
																		else
																		{
																			if(sharedPreferences.getString("b2", "").equals(" "))
																			{
																				b2.setText(xxx.getStringExtra("yy"));
																				editor.putString("b2", xxx.getStringExtra("yy"));
																				editor.commit();
																			}
																			else
																			{
																				if(sharedPreferences.getString("b14", "").equals(" "))
																				{
																					b14.setText(xxx.getStringExtra("yy"));
																					editor.putString("b14", xxx.getStringExtra("yy"));
																					editor.commit();
																				}
																				else
																				{
																					if(sharedPreferences.getString("b15", "").equals(" "))
																					{
																						b15.setText(xxx.getStringExtra("yy"));
																						editor.putString("b15", xxx.getStringExtra("yy"));
																						editor.commit();
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
									}
								}
													}
												}
											}
										}
									}
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("xx"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("xx")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("xx")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("CONGRATULATIONS!!");
							b18.setText("Winner");
							editor.putString("rad", "rad");
							editor.commit();
								}
								if(((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b5", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b9", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b2", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b14", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b3", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b15", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b8", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b12", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b1", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b6", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b11", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b16", "").equals(xxx.getStringExtra("yy"))))||((sharedPreferences.getString("b4", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b7", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b10", "").equals(xxx.getStringExtra("yy")))&&(sharedPreferences.getString("b13", "").equals(xxx.getStringExtra("yy")))))
								{
							ll2.setVisibility(LinearLayout.VISIBLE);
							TextView b17 = (Button)findViewById(R.id.button17);
							TextView b18 = (Button)findViewById(R.id.button18);
							b17.setVisibility(Button.GONE);
							TextView tvt = (TextView)findViewById(R.id.textView1);
							tvt.setText("Better Luck Next Time");
							b18.setText("Loser");
							editor.putString("rad", "rad");
							editor.commit();
								}
							
							}
							else{
								Toast.makeText(getApplicationContext(), " Invalid Move " , Toast.LENGTH_SHORT).show();
							}
						}
					});
					final Button sssddd=(Button)findViewById(R.id.button155);
					sssddd.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
						b1.setText(" ");editor.putString("b1", " ");
						b2.setText(" ");editor.putString("b2", " ");
						b3.setText(" ");editor.putString("b3", " ");
						b4.setText(" ");editor.putString("b4", " ");
						b5.setText(" ");editor.putString("b5", " ");
						b6.setText(" ");editor.putString("b6", " ");
						b7.setText(" ");editor.putString("b7", " ");
						b8.setText(" ");editor.putString("b8", " ");
						b9.setText(" ");editor.putString("b9", " ");
						b10.setText(" ");editor.putString("b10", " ");
						b11.setText(" ");editor.putString("b11", " ");
						b12.setText(" ");editor.putString("b12", " ");
						b13.setText(" ");editor.putString("b13", " ");
						b14.setText(" ");editor.putString("b14", " ");
						b15.setText(" ");editor.putString("b15", " ");
						b16.setText(" ");editor.putString("b16", " ");
						editor.commit();	
						ll2.setVisibility(LinearLayout.GONE);
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
