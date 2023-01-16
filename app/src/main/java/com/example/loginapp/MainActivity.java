package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view){
        EditText email = (EditText)findViewById(R.id.email);
        EditText haslo = (EditText)findViewById(R.id.Password);
        EditText haslo2 = (EditText)findViewById(R.id.Password2);
        TextView wynik = (TextView)findViewById(R.id.wynik);



        if(haslo.getText().toString().equals(haslo2.getText().toString()) && email.getText().toString().contains("@")){
            wynik.setText("Witaj " + email.getText().toString());
        }
        else if(email.getText().toString().contains("@")==false){
            wynik.setText("zly email");
        }
        else if(haslo != haslo2){
            wynik.setText("hasla sie roznia");
        }
    }
}