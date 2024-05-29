package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scanbc4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scanbc4);
    }

    public void scanbc4bc(View v) {
        Intent intent = new Intent (scanbc4.this, scanbarcode.class);
        startActivity(intent);
    }

    public void scanbc4bc3(View v) {
        Intent intent = new Intent (scanbc4.this, scanbc3.class);
        startActivity(intent);
    }
}