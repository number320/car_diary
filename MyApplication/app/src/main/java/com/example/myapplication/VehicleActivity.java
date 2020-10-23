package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class VehicleActivity extends AppCompatActivity {

    private Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        Spinner distanceSpinner = (Spinner) findViewById(R.id.distanceSpinner);
        ArrayAdapter<String> distanceAdapter = new ArrayAdapter<String>(VehicleActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.milage));
        distanceAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        distanceSpinner.setAdapter(distanceAdapter);

        Spinner capacitySpinner = (Spinner) findViewById(R.id.capacitySpinner);
        ArrayAdapter<String> capacityAdapter = new ArrayAdapter<String>(VehicleActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.volume));
        capacityAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        capacitySpinner.setAdapter(capacityAdapter);
    }
}