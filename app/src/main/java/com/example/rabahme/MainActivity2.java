package com.example.rabahme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView logoImageView = findViewById(R.id.logo);
        ImageView sendingImageView = findViewById(R.id.sending);
        ImageView homeImageView = findViewById(R.id.home);
        ImageView suiviImageView = findViewById(R.id.suivi);
        ImageView settingImageView = findViewById(R.id.setting);

        logoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        sendingImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, sending.class);
                startActivity(intent);
            }
        });

        homeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to HomeActivity
                Intent intent = new Intent(MainActivity2.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        suiviImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Activity_suivi
                Intent intent = new Intent(MainActivity2.this, Activity_suivi.class);
                startActivity(intent);
            }
        });

        settingImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Activity_Setting
                Intent intent = new Intent(MainActivity2.this, Activity_Setting.class);
                startActivity(intent);
            }
        });
    }
}