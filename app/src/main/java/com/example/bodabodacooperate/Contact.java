package com.example.bodabodacooperate;

import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        //make reference of widgets from XML TO Java
        EditText edtemail = findViewById(R.id.contact_email);
        EditText edtphonenumber = findViewById(R.id.contact_phonenumber);
        EditText edtlocation = findViewById(R.id.contact_location);
        ImageView imginstagram = findViewById(R.id.instagram);
        ImageView imgtwitter = findViewById(R.id.twitter);
        ImageView imggithub = findViewById(R.id.github);
        ImageView imgfacebook = findViewById(R.id.facebook);

        //generate Intent between Source and Destination Activity
        edtemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///Toast.makeText(ContactsActivity.this, "social button pressed", Toast.LENGTH_SHORT).show();
                Intent Emailintent = new Intent(Intent.ACTION_SEND);
                Emailintent.setType("text/html");
                Emailintent.putExtra(Intent.EXTRA_EMAIL, "demo@info.co.tz" +
                        "" +
                        "" +
                        "    ");
                Emailintent.putExtra(Intent.EXTRA_SUBJECT, " ");
                //  EmailIntent.putExtra(Intent.EXTRA_TEXT, "I'myMapView email body.");

                startActivity(Intent.createChooser(Emailintent, "Send Email"));
            }
        });

        edtphonenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(ContactsActivity.this, "Phone pressed", Toast.LENGTH_SHORT).show();
                Intent Phoneintent = new Intent();
                Phoneintent.setAction(Intent.ACTION_DIAL);
                Phoneintent.setData(Uri.parse("tel:+255 758 536  319"));
                startActivity(Phoneintent);
            }
        });

        edtlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(ContactsActivity.this, "Location pressed", Toast.LENGTH_SHORT).show();
                String uri = "https://www.google.com/maps/place/Dar+es+Salaam+Institute+of+Technology/@-6.8148018,39.2778339,17z/data=!4m5!3m4!1s0x185c4b09e848c92d:0x90d02db3c3d6c912!8m2!3d-6.8148071!4d39.2800226";
                Intent locintent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(locintent);
            }
        });

        imgfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent FacebookIntent = new Intent();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/afyadigital  ")));
            }
        });

        imgtwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent twitterIntent = new Intent();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/DigitalAfya")));
            }
        });

        imginstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent instagramIntent = new Intent();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/afyadigital")));
            }
        });

  }
}