package com.attitude.status;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class MainActivity extends AppCompatActivity {

    FloatingTextButton attitudeinhindi;
    FloatingTextButton attitudeinenglish;
    FloatingTextButton sharebutton;
    FloatingTextButton rateusbutton;
    FloatingTextButton aboutusbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        attitudeinhindi = (FloatingTextButton) findViewById(R.id.action_button);

        // Capture button clicks
        attitudeinhindi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                String[] numbers = getResources().getStringArray(R.array.englisharray);
                Intent i = new Intent(MainActivity.this, Main3Activity.class);

                // Pass all data rank
                i.putExtra("mylist", numbers);
                // Pass listview item click position

                startActivity(i);
            }
        });

        attitudeinenglish = (FloatingTextButton) findViewById(R.id.action_buttontwo);

        // Capture button clicks
        attitudeinenglish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Main3Activity.class);
                startActivity(myIntent);
            }
        });

        rateusbutton = (FloatingTextButton) findViewById(R.id.action_rateus);

        // Capture button clicks
        rateusbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Main3Activity.class);
                startActivity(myIntent);
            }
        });

        sharebutton = (FloatingTextButton) findViewById(R.id.action_share);

        // Capture button clicks
        sharebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Main3Activity.class);
                startActivity(myIntent);
            }
        });
        aboutusbutton = (FloatingTextButton) findViewById(R.id.action_aboutus);

        // Capture button clicks
        aboutusbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Main3Activity.class);
                startActivity(myIntent);
            }
        });

    }

}
