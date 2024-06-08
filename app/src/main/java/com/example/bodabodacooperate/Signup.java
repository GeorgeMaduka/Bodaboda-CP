package com.example.bodabodacooperate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Signup extends AppCompatActivity {
    String subUsername, subEmail, subPassword, subConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button register = findViewById(R.id.registerButton);
        TextView haveAccount = findViewById(R.id.tvLoginAccount);
        EditText username = findViewById(R.id.edUsername);
        EditText email = findViewById(R.id.edEmail);
        EditText password = findViewById(R.id.edPassword);
        EditText confirmPassword = findViewById(R.id.EdConfirmPassword);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get submitted values
                subUsername = username.getText().toString();
                subEmail = email.getText().toString();
                subPassword = password.getText().toString();
                subConfirmPassword = confirmPassword.getText().toString();

                // validate username
                if(subUsername.isEmpty()) {
                    username.setError("Username is required");

                } else if(subEmail.isEmpty()) {
                    username.setError("Email address is required");

                } else if(subPassword.isEmpty()) {
                    username.setError("Password is required");

                } else if(subConfirmPassword.isEmpty()) {
                    username.setError("Confirm your Password");

                } else {
                    Intent go = new Intent(Signup.this, Signin.class);
                    startActivity(go);
                }

            }
        });

        haveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(Signup.this, Signin.class);
                startActivity(go);
            }
        });

    }

}