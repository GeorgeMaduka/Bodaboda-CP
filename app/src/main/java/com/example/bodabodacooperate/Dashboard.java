package com.example.bodabodacooperate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dashboard extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itm = item.getItemId();

        if (itm == R.id.menu_about){
            Intent menuabout = new Intent(getApplicationContext(), About.class);
            startActivity(menuabout);
        }

        if (itm == R.id.menu_about){
            Intent menucontact = new Intent(getApplicationContext(), Contact.class);
            startActivity(menucontact);
        }

        if (itm == R.id.menu_about){
            Intent menusettings = new Intent(getApplicationContext(), Settings.class);
            startActivity(menusettings);
        }

        else {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView home = findViewById(R.id.imgHome);
        ImageView news = findViewById(R.id.imgNews);
        ImageView calender = findViewById(R.id.imgCalender);
        ImageView donations = findViewById(R.id.imgDonation);
        ImageView events = findViewById(R.id.imgEvents);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(go);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(getApplicationContext(), News.class);
                startActivity(go);
            }
        });

        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(getApplicationContext(), Calender.class);
                startActivity(go);
            }
        });

        donations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(getApplicationContext(), Donations.class);
                startActivity(go);
            }
        });

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(getApplicationContext(), Events.class);
                startActivity(go);
            }
        });

    }
}