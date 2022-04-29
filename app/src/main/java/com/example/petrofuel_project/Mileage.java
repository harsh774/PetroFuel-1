package com.example.petrofuel_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mileage extends AppCompatActivity {
    Button b1;
    TextView v1;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mileage);
        b1 = (Button) findViewById((R.id.button3));
        v1 = (TextView) findViewById(R.id.mi);
        e1 = (EditText) findViewById(R.id.NoKm);
        e2 = (EditText) findViewById(R.id.Qn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float distance = Float.parseFloat(e1.getText().toString());
                float fuel = Float.parseFloat(e2.getText().toString());

                float mileage = distance / fuel;
                v1.setText("Mileage: " + String.valueOf(mileage));


            }
        });
    }
}