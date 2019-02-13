package com.example.test1;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;




public class MainActivity extends AppCompatActivity {
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Intent i = getPackageManager().getLaunchIntentForPackage("com.android.phone");

        image = findViewById(R.id.imageView1);
        FloatingActionButton fab = findViewById(R.id.fab);
        int j =0;
        do {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    image.setImageResource(R.drawable.test);

                }
            }

            ); j = 1;

        }while ( j == 0);


        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                image.setVisibility(View.INVISIBLE);

            }
        }

        );

    }


}
