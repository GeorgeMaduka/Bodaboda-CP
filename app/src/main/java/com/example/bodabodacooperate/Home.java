package com.example.bodabodacooperate;

import android.os.Bundle;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton buttonMenu;
    NavigationView navigationView;
    View headerview;
    TextView username;
    TextView useremail;
    ImageView userimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        drawerLayout = findViewById(R.id.main);
        buttonMenu = findViewById(R.id.img_menu_drawable_icon);
        navigationView = findViewById(R.id.navigation_view);
        username = findViewById(R.id.txt_username);
        useremail = findViewById(R.id.txt_useremail);
        userimage = findViewById(R.id.img_userimage);
        headerview = navigationView.getHeaderView(0);

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });

        userimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, username.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();

                if(itemId == R.id.menu_about){
                    Toast.makeText(Home.this, "About Us ,clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.menu_contact){
                    Toast.makeText(Home.this, "Contact Us ,clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.menu_settings){
                    Toast.makeText(Home.this, "Settings ,clicked", Toast.LENGTH_SHORT).show();
                }

                if(itemId == R.id.menu_about){
                    Toast.makeText(Home.this, "Logout ,clicked", Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });
    }
}