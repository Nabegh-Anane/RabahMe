package com.example.rabahme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        ImageView logoImageView = findViewById(R.id.logo);
        ImageView sendingImageView = findViewById(R.id.sending);
        ImageView homeImageView = findViewById(R.id.home);
        ImageView suiviImageView = findViewById(R.id.suivi);
        ImageView settingImageView = findViewById(R.id.setting);

        logoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Setting.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        sendingImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Setting.this, sending.class);
                startActivity(intent);
            }
        });

        homeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to HomeActivity
                Intent intent = new Intent(Activity_Setting.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        suiviImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Activity_suivi
                Intent intent = new Intent(Activity_Setting.this, Activity_suivi.class);
                startActivity(intent);
            }
        });

        settingImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Activity_Setting
                Intent intent = new Intent(Activity_Setting.this, Activity_Setting.class);
                startActivity(intent);
            }
        });

        TextView loginTextView = findViewById(R.id.EiaTaa);
        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Activity_login when TextView is clicked
                Intent intent = new Intent(Activity_Setting.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}