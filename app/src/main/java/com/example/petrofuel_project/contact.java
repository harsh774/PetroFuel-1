package com.example.petrofuel_project;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class contact extends AppCompatActivity {
    private Button b1;
    private Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        b1 = (Button) findViewById(R.id.button2);
        b2 = (Button) findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendEmail();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenUrl();
            }
        });
    }
    public void SendEmail(){
        String [] reciever = new String[]{"ayush2maheshwari@gmail.com"};
        String subject = "Regarding issue";
        String content = "Hello I have a problem related to";
        Intent intenEmail = new Intent(Intent.ACTION_SEND, Uri.parse("ayush:"));
        intenEmail.putExtra(Intent.EXTRA_EMAIL,reciever);
        intenEmail.putExtra(Intent.EXTRA_SUBJECT,subject);
        intenEmail.putExtra(Intent.EXTRA_TEXT,content);
        intenEmail.setType("text/plain");
        startActivity(Intent.createChooser(intenEmail,"Choose an email client from ..."));


    }
    public void OpenUrl(){
        String url = "https://vitbhopal.ac.in";
        Intent intent = new Intent(Intent.ACTION_VIEW ,Uri.parse(url));
        this.startActivity(intent);

    }
}