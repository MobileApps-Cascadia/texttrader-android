package com.example.texttrader.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.texttrader.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new LandingFragment())
                    .commit();
        }
    }
}