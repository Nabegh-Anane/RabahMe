package com.example.rabahme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_login extends AppCompatActivity {
    private Button logButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button logButton = findViewById(R.id.creation);

        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_login.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        TextView loginTextView = findViewById(R.id.RegisterText);
        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Activity_login when TextView is clicked
                Intent intent = new Intent(Activity_login.this, Activity_register.class);
                startActivity(intent);
            }
        });

        TextView forgetTextView = findViewById(R.id.ForgetPass);
        forgetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Activity_login when TextView is clicked
                Intent intent = new Intent(Activity_login.this, forgetpass.class);
                startActivity(intent);
            }
        });
    }
}