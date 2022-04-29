package com.example.petrofuel_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
ImageButton petrol,mileage,price,contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        petrol = (ImageButton) findViewById(R.id.imagepetrol);
        mileage = (ImageButton) findViewById(R.id.imagemilaege);
        price = (ImageButton) findViewById(R.id.imageprice);
        contact = (ImageButton) findViewById(R.id.imagecontactus);
       // final Context context = this;
        petrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),PetrolCalculate.class);
                startActivity(intent);
            }
        });
        mileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mileage.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),contact.class);
                startActivity(intent);
            }
        });
        price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Current.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item2:
                Intent intent = new Intent(getApplicationContext(),Home.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                Intent intent1 = new Intent(getApplicationContext(),About.class);
                startActivity(intent1);
                return true;
            case R.id.item4:
                Intent intent2 = new Intent(getApplicationContext(),team.class);
                startActivity(intent2);
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}