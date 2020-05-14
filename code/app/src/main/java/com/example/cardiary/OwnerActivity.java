package com.example.cardiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class OwnerActivity extends AppCompatActivity {
    private TextView ownerName;
    private TextView ownerMail;
    private Button createProfile;
    //private Spinner chooseProfile;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);

        //Remove title of the activity
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //setContentView(R.layout.activity_owner);

        final PopUp popUp = new PopUp();

        setupUIViews();

        createProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OwnerActivity.this, PopUp.class));
                ownerName.setText(popUp.owner.getName());
                ownerMail.setText(popUp.owner.getMail());
            }
        });

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setupUIViews(){
        ownerName = findViewById(R.id.ownerName);
        ownerMail = findViewById(R.id.ownerMail);
        createProfile = findViewById(R.id.createBtn);
        //chooseProfile = findViewById(R.id.spinnerProfil);
        returnBtn = findViewById(R.id.returnBtn);
    }
}
