package com.example.cardiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CarDiary extends AppCompatActivity {
    private Button ownerInfo;
    private Button vehicleInfo;
    private Button refuelInfo;
    private Button results;
    private Button options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        ownerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OwnerActivity.class);
                startActivity(intent);
            }
        });

        vehicleInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Vehicle.class);
                startActivity(intent);
            }
        });

        refuelInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Refuel.class);
                startActivity(intent);
            }
        });

        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Results.class);
                startActivity(intent);
            }
        });

        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Options.class);
                startActivity(intent);
            }
        });
    }

    private void setupUIViews(){
        ownerInfo = findViewById(R.id.ownerInfoBtn);
        vehicleInfo = findViewById(R.id.carDetailsBtn);
        refuelInfo = findViewById(R.id.refuelInfoBtn);
        results = findViewById(R.id.resultBtn);
        options = findViewById(R.id.optionsBtn);
    }
}
