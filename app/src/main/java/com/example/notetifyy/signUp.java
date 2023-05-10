package com.example.notetifyy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class signUp extends AppCompatActivity {

    TextView textView4;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        textView4 = (TextView) findViewById(R.id.textView4);
        button2 = (Button) findViewById(R.id.button2);


        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signUp.this, "Log In to Notetify", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signUp.this, "Signed Up Successfully", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(getApplicationContext(),signUp.class);
                startActivity(intent);
            }
        });
    }




}