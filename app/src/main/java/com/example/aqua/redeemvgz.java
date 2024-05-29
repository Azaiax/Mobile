package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class redeemvgz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_redeemvgz);
    }

    public void backredeemvgz(View v) {
        Intent intent = new Intent(redeemvgz.this, home.class);
        startActivity(intent);
    }

    public void sbmtredeemvgz(View v) {
        Intent intent = new Intent(redeemvgz.this, redeemvgz2.class);
        startActivity(intent);
    }
}