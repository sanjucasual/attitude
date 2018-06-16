package com.attitude.status;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class Main3Activity extends AppCompatActivity {
    public TextView textdetail;
   /* InterstitialAd interstitial;
    AdView mAdView;*/
    ScrollView scrollview;
    Toolbar toolbar;
    String[] numbers;
    String[] details;
    int p = 0;
    private static int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i = getIntent();
        numbers = i.getStringArrayExtra("mylist");
        position = i.getExtras().getInt("position");
        details = numbers;



        // Locate the TextViews in singleitemview.xml
        // Load the text into the TextViews followed by the position

        textdetail = (TextView) findViewById(R.id.textView);
        textdetail.setText(details[position]);


       /* Typeface tf = Typeface.createFromAsset(getAssets(), "goodfoot.ttf");
        textdetail.setTypeface(tf);*/

        FloatingTextButton previousbutton = (FloatingTextButton) findViewById(R.id.action_button_left);
        FloatingTextButton nextbutton = (FloatingTextButton) findViewById(R.id.action_button_right);
        FloatingTextButton sharebutton = (FloatingTextButton) findViewById(R.id.action_button_share_attitude);

        sharebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textdetail = (TextView) findViewById(R.id.textView);
                String string = textdetail.getText().toString();

                String string1 = "\n"+ "READ AMAZING AND INTERESTING FACTS IN HINDI FREE" + " https://play.google.com/store/apps/details?id=com.course99.interestingfactsinhindi";
                string = string.concat(string1);
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, string);
                startActivity(Intent.createChooser(intent, "Share via"));


            }
        });


        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                position = position + 1;
                if (position < numbers.length) {


                    textdetail.setText(details[position]);


                    if (position % 2 == 0) {

                        /*interstitial = new InterstitialAd(Main3Activity.this);
                        // Insert the Ad Unit ID
                        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
                        AdRequest adRequest = new AdRequest.Builder().build();
                        interstitial.loadAd(adRequest);
                        // Prepare an Interstitial Ad Listener
                        interstitial.setAdListener(new AdListener() {
                            public void onAdLoaded() {
                                // Call displayInterstitial() function

                                displayInterstitial();
                            }
                        });*/
                    }
                } else if (position == numbers.length) {
                    Toast.makeText(getApplicationContext(), "This is Last Page! Please move to Previous Pages", Toast.LENGTH_SHORT).show();

                    position = position - 1;
                }

            }
        });
        previousbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                position = position - 1;
                if (position >= 0) {



                    textdetail.setText(details[position]);


                 /*  *//* if (position % 2 == 0) {
                        interstitial = new InterstitialAd(Main3Activity.this);
// Insert the Ad Unit ID
                        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
                        AdRequest adRequest = new AdRequest.Builder().build();
                        interstitial.loadAd(adRequest);
// Prepare an Interstitial Ad Listener
                        interstitial.setAdListener(new AdListener() {
                            public void onAdLoaded() {
                                // Call displayInterstitial() function

                                displayInterstitial();
                            }
                        });*//*
                    }*/
                } else {

                    Toast.makeText(getApplicationContext(), "This is First Page Page! Please move to Next  Pages", Toast.LENGTH_SHORT).show();
                    position = position + 1;

                }
            }
        });

    }
}
