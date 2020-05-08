package com.example.cardiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Owner extends AppCompatActivity {
    private String name, mail;
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
