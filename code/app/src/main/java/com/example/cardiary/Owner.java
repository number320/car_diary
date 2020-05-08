package com.example.cardiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Owner extends AppCompatActivity {
    public static String name;
    public static String mail;
    //private ArrayList listOfCars;
    private EditText addName;
    private EditText addMail;
    private Button vehicleInfo;
    private Button save;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);

        setupUIViews();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = addName.getText().toString();
                mail = addMail.getText().toString();

            }
        });

        vehicleInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Vehicle.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CarDiary.class);
                startActivity(intent);
            }
        });
    }

    private void setupUIViews(){
        addName = findViewById(R.id.addName);
        addMail = findViewById(R.id.addMail);
        vehicleInfo = findViewById(R.id.carDetailsBtn);
        save = findViewById(R.id.saveBtn);
        back = findViewById(R.id.backBtn);
    }
}
