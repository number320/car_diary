package com.example.cardiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CarDiary extends AppCompatActivity {
    private TextView nameView;
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
                Intent intent = new Intent(getApplicationContext(), Owner.class);
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

        if(Owner.name == null){
            nameView.setText("Your car diary");
        }
        else{
            nameView.setText(toString());
        }
    }

    private void setupUIViews(){
        nameView = findViewById(R.id.mainTitle);
        ownerInfo = findViewById(R.id.ownerInfoBtn);
        vehicleInfo = findViewById(R.id.carDetailsBtn);
        refuelInfo = findViewById(R.id.refuelInfoBtn);
        results = findViewById(R.id.resultBtn);
        options = findViewById(R.id.optionsBtn);
    }

    public String toString(){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(Owner.name);
        strBuilder.append("'s car");

        return strBuilder.toString();
    }
}
