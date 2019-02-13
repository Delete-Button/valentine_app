package com.example.test1;


import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;

import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;


//https://stackoverflow.com/questions/36902667/how-to-schedule-notification-in-android

@TargetApi(Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity {
    ImageView image;

    //private boolean note = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Intent i = getPackageManager().getLaunchIntentForPackage("com.android.phone");


        FloatingActionButton fab1 = findViewById(R.id.fab1);
        image = findViewById(R.id.imageView1);
        image.setVisibility(View.INVISIBLE);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button();
            }
        });



        fab1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                button1(v);
            } }
            );


    }
    private void button(){
        if (image.getVisibility() == View.INVISIBLE){
            image.setVisibility(View.VISIBLE);
            image.setImageResource(R.drawable.test);
        }
        else{
             image.setVisibility(View.INVISIBLE);
        }
    }
    public void createNotification(){
        NotificationManager notman = (NotificationManager)getSystemService(getApplicationContext().NOTIFICATION_SERVICE);
        NotificationChannel notchan = new NotificationChannel("test", "test1", NotificationManager.IMPORTANCE_DEFAULT);
        notman.createNotificationChannel(notchan);
        int notifyId =1;
        Notification note = new Notification.Builder(MainActivity.this)
                .setContentTitle("Valentine's Reminder").setContentText(fuckery.getText())
                .setSmallIcon(R.drawable.ic_launcher_foreground).setChannelId("test").build();
        notman.notify(notifyId, note);


    }

    private void button1(View view){
        Snackbar.make(view, "Check Your Notifications!", Snackbar.LENGTH_LONG).show();
    }
    /*
    private void button1(View view) {
        if (note == true) {
            note = false;
            Snackbar.make(view, "Notifications have been disabled", Snackbar.LENGTH_LONG).show();
        } else if (!note) {
            note = true;
            Snackbar.make(view, "Notifications have been enabled", Snackbar.LENGTH_LONG).show();
            createNotification();
        } else { Snackbar.make(view, "Notifications have been enabled", Snackbar.LENGTH_LONG).show();
        note = true;
        createNotification();}
    }
    */


}
