package com.example.cardiary;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PopUp extends Activity {

    public Owner owner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int heignt = dm.heightPixels;

        getWindow().setLayout((int) (width*.8), (int) (heignt*.6));

        final EditText addName = findViewById(R.id.addName);
        final EditText addMail = findViewById(R.id.addMail);
        Button saveBtn = findViewById(R.id.saveBtn);



        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                owner = new Owner(addName.getText().toString(), addMail.getText().toString());
                finish();
            }
        });
    }
}
