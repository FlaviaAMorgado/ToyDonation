package com.example.toydonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnentrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnentrar = findViewById(R.id.btnentrar);


        btnentrar.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View v) {
                Intent Principal = new Intent( MainActivity.this, Principal.class);
                startActivity(Principal);
            }
        });
    }
}