package com.vlad.pr13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class second_main extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondmain);
    }

    public void StartNewActivity(View v) {
        Intent intent = new Intent(this, third_activity.class);
        startActivity(intent);
    }
    public void StartNewActivity1(View v) {
        Intent intent = new Intent(this, audio.class);
        startActivity(intent);
    }
}