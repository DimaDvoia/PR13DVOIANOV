package com.vlad.pr13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class photo extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);

    }

    public void StartNewActivity(View v) {
        Intent intent = new Intent(this, third_activity.class);
        startActivity(intent);
    }
}
