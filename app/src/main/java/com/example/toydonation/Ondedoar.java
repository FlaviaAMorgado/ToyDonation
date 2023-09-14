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
            public void onClick(View v) {

                double latitude = -23.486393083991224;
                double longitude = -46.74007585711585;
                Uri location = Uri.parse ("geo:"+latitude+","+longitude);

               // Uri location = Uri.parse (“"geo:"0,0"?q=""Projeto"+"Saint"+"German"”); por pesquisa
               Intent map = new Intent(Intent.ACTION_VIEW, location);
               startActivity(map);
            }
        });
    }
}