package com.example.bodabodacooperate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Forgetpassword extends AppCompatActivity {
    String subNewPswd, subConfrimPswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forgetpassword);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button submit = findViewById(R.id.submitButton);
        EditText newPswd = findViewById(R.id.newPassword);
        EditText comfirmPswd = findViewById(R.id.confirmPassword);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get submitted values
                subNewPswd = newPswd.getText().toString();
                subConfrimPswd = comfirmPswd.getText().toString();

                // validate username
                if(subNewPswd.isEmpty()) {
                    newPswd.setError("New password is required");

                } else if(subConfrimPswd.isEmpty()) {
                    comfirmPswd.setError("Confirm new password");

                } else {
                    Intent go = new Intent(getApplicationContext(), Signin.class);
                    startActivity(go);
                }

            }
        });

    }
}