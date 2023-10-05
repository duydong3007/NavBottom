package com.example.bottomnavigation;

import static com.example.bottomnavigation.R.id.nav_bottom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView =findViewById(nav_bottom);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_home) {
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                }else if(item.getItemId() == R.id.nav_favorite){
                    Toast.makeText(MainActivity.this, "Favorite", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "My Page", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });
    }
}