package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scanbc3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scanbc3);
    }

    public void scanbc3bc(View v) {
        Intent intent = new Intent (scanbc3.this, scanbc4.class);
        startActivity(intent);
    }

    public void scanbc3ktp(View v) {
        Intent intent = new Intent (scanbc3.this, scanktp.class);
        startActivity(intent);
    }
}