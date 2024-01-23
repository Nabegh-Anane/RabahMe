package com.example.rabahme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_register extends AppCompatActivity {

    private Button registerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerButton = findViewById(R.id.creation);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_register.this, thanks_registred.class);
                startActivity(intent);
            }
        });

        TextView loginTextView = findViewById(R.id.Logintext);
        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Activity_login when TextView is clicked
                Intent intent = new Intent(Activity_register.this, Activity_login.class);
                startActivity(intent);
            }
        });
    }
}