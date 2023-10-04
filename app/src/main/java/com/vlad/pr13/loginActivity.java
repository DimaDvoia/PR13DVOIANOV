package com.vlad.pr13;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class loginActivity extends AppCompatActivity {

    private EditText textEmail;
    private EditText textPassword;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textEmail = findViewById(R.id.Email);
        textPassword = findViewById(R.id.Password);
    }
    private boolean validateEmail(){
        String emailInput = textEmail.getText().toString().trim();

        if(emailInput.isEmpty()){
            textEmail.setError("Не заполнено поле");
            return false;
        }else{
            textEmail.setError(null);
            return true;
        }
    }
    private boolean validatePassword(){
        String emailInput = textPassword.getText().toString().trim();

        if(emailInput.isEmpty()){
            textPassword.setError("Не заполнен пароль");
            return false;
        }else{
            textPassword.setError(null);
            return true;
        }
    }
    public void confirmInput(View v){
        if (!validateEmail() | !validatePassword()) {
            return;
        }
                 Intent intent = new Intent(this, second_main.class);
                startActivity(intent);


        }

    }



