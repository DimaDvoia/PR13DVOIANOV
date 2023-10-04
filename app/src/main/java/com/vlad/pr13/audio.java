package com.vlad.pr13;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class audio extends AppCompatActivity {
    MediaPlayer mySong;
    MediaPlayer mySong2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio);
        mySong = MediaPlayer.create(this,R.raw.ludovico);
        mySong2 = MediaPlayer.create(this,R.raw.owlcity);
    }
    public void StartNewActivity(View v) {
        Intent intent = new Intent(this, second_main.class);
        startActivity(intent);
    }
    public void StartNewActivity1(View v) {
        Intent intent = new Intent(this, third_activity.class);
        startActivity(intent);
    }
    public void PlayIT(View view){
         mySong.start();
    }
    public void PlayIT2(View view){
        mySong2.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySong.release();
        mySong2.release();
    }
}