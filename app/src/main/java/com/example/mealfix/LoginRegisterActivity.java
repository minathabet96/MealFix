package com.example.mealfix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginRegisterActivity extends AppCompatActivity {

    TextView signupTxt;
    Button googleButton;
    Button emailButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        signupTxt = findViewById(R.id.signup_txt);
        googleButton = findViewById(R.id.signin_google_btn);
        emailButton = findViewById(R.id.signin_email_btn);
        signupTxt.setPaintFlags(signupTxt.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        signupTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginRegisterActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginRegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}