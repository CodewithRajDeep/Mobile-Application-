package com.example.mymobileapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import  android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View v)
            {
                Toast.makeText( context: MainActivity.this, text = "Button Clicked", Toast.LENGTH_SHORT.show());
            }
        });
    }
}