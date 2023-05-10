package com.example.notetifyy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText loginText, passwordText;
    Button btnLogin;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        loginText = (EditText) findViewById(R.id.emailAddress);
        passwordText = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.loginButton);
        textView3 = (TextView) findViewById(R.id.textView3);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = loginText. getText().toString();
                String password = passwordText. getText(). toString();

                if(username.equals("beary") && password.equals("gud"))
                {
                    Toast.makeText(MainActivity.this, "Welcome to Notetify", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getApplicationContext(),MainActivity1.class);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(MainActivity.this, "Invalid Credentials.", Toast.LENGTH_SHORT).show();
                }


            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sign Up to Notetify", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(getApplicationContext(),signUp.class);
                startActivity(intent);
            }
        });

    }
}


