
package com.example.bodabodacooperate;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        displaySplash();
    }

    public void displaySplash(){
        Thread mythread = new Thread(){
            @Override
            public void run() {
                try {
                    int displaytime = 4000;
                    int waittime = 0;
                    while (waittime < displaytime) {
                        sleep(100);
                        waittime = waittime + 100;
                    }
                    super.run();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent a = new Intent(getApplicationContext(), Signin.class);
                    startActivity(a);
                    finish();
                }
            }
        };
        mythread.start();
    }
}
