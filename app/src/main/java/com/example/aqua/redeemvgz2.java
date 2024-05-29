package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class redeemvgz2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_redeemvgz2);
    }

    public void backredeemvgz(View v) {
        Intent intent = new Intent(redeemvgz2.this, redeemvgz.class);
        startActivity(intent);
    }

    public void poinekstra(View v) {
        Intent intent = new Intent(redeemvgz2.this, ekstravgz.class);
        startActivity(intent);
    }
}