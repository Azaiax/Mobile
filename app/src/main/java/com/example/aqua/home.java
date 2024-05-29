package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        DrawerLayout drawerLayout = findViewById(R.id.driver_layout);;
        NavigationView navigationView =findViewById(R.id.nav_menu);


        navigationView.setNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.logout) {
                Intent intent1 = new Intent(home.this, login.class);
                startActivity(intent1);
            }

            drawerLayout.closeDrawers();
            return true;
        });

    }

    public void openDrawer(View view) {
        DrawerLayout drawerLayout = findViewById(R.id.driver_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END);
        } else {
            drawerLayout.openDrawer(GravityCompat.END);
        }
    }

    public void scanbc(View v) {
        Intent intent = new Intent (home.this, scanbarcode.class);
        startActivity(intent);
    }

    public void redeemvgz(View v) {
        Intent intent = new Intent (home.this, redeemvgz.class);
        startActivity(intent);
    }
}