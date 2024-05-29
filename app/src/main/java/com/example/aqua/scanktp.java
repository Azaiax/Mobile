package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scanktp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scanktp);
    }

    public void scanktpbc3(View v) {
        Intent intent = new Intent (scanktp.this, scanbc3.class);
        startActivity(intent);
    }

    public void scanktpslmt(View v) {
        Intent intent = new Intent (scanktp.this, selamatklaim.class);
        startActivity(intent);
    }
}