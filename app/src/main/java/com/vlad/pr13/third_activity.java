package com.vlad.pr13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class third_activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);
    }

    public void StartNewActivity(View v) {
        Intent intent = new Intent(this, second_main.class);
        startActivity(intent);
    }

    public void StartNewActivity1(View v) {
        Intent intent = new Intent(this, photo.class);
        startActivity(intent);
    }
    public void StartNewActivity2(View v) {
        Intent intent = new Intent(this, audio.class);
        startActivity(intent);
    }
}
