package com.example.petrofuel_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class team extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
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