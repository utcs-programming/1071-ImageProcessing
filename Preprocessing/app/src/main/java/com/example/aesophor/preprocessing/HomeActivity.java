package com.example.aesophor.preprocessing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    public static final int MEAN_BLUR = 1;
    public static final int GAUSSIAN_BLUR = 3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button bMean = (Button) findViewById(R.id.bMean);
        bMean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", MEAN_BLUR);
                startActivity(i);
            }
        });


        Button bGaussian = (Button) findViewById(R.id.bGaussian);
        bGaussian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("ACTION_MODE", GAUSSIAN_BLUR);
                startActivity(i);
            }
        });
    }

}