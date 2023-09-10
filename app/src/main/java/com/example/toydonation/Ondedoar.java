package com.example.toydonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ondedoar extends AppCompatActivity {

    Button BtnMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ondedoar); // main ou ondedoar?

        BtnMapa = findViewById(R.id.BtnMapa);
        BtnMapa.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View cd) {
              // Uri location = Uri.parse (“geo:-23.487397160607976,-46.73992407620505?z=14”);
                Intent map = new Intent(Intent.ACTION_VIEW, location);
                startActivity(map);
            }
        });
    }
}