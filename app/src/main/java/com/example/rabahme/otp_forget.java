package com.example.rabahme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class otp_forget extends AppCompatActivity {
    private Button logButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_forget);
        Button logButton = findViewById(R.id.creation);

        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(otp_forget.this, Activity_login.class);
                startActivity(intent);
            }
        });
        TextView loginTextView = findViewById(R.id.ResetCode);
        loginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Activity_login when TextView is clicked
                Intent intent = new Intent(otp_forget.this, forgetpass.class);
                startActivity(intent);
            }
        });
    }
}