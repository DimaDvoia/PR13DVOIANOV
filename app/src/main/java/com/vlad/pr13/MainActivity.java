package com.vlad.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button1, buttonenter;
    ImageView logoView, hellotext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        logoView = findViewById(R.id.LogoView);
        hellotext = findViewById(R.id.HelloText);
        buttonenter = findViewById(R.id.enter1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnimation();

            }

        });
    }

    private void startAnimation() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        logoView.startAnimation(animation);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.button_anim);
        button1.startAnimation(animation2);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.hellotext);
        hellotext.startAnimation(animation3);
        Animation animation4 = AnimationUtils.loadAnimation(this, R.anim.button_enter);
        buttonenter.startAnimation(animation4);
    }

    public void StartNewActivity(View v) {
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }
}