package com.example.realestate.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.realestate.R;

public class IntroActivity extends AppCompatActivity {
    private Button startbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Initview();
    }

    private void Initview() {
        startbtn = findViewById(R.id.startBtn);
        if (startbtn != null) {
            startbtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, MainActivity.class)));
        }
    }

}