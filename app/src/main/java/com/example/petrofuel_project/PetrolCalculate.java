package com.example.petrofuel_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PetrolCalculate extends AppCompatActivity {
     TextView P_need,P;
     EditText n1,n2,n3;
     Button cal ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petrol_calculate);
        P_need = (TextView)findViewById(R.id.textView4);
        cal = (Button)findViewById(R.id.button3) ;
        P = (TextView) findViewById(R.id.textView6);
        n1 = (EditText)findViewById(R.id.Trip_Dist);
        n2 = (EditText)findViewById(R.id.Fuel_Pri);
        n3 = (EditText)findViewById(R.id.Mile);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 float number1 = Float.parseFloat(n1.getText().toString());
                float number2 = Float.parseFloat(n2.getText().toString());
                float number3 = Float.parseFloat(n3.getText().toString());
                float Petrol = number1/number3;
                float Price = Petrol*number2;
                P_need.setText("Required fuel: "+String.valueOf(Petrol));
                P.setText("Total Price: "+String.valueOf(Price));


            }
        });

    }
}