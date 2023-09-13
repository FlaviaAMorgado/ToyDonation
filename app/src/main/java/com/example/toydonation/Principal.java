package com.example.toydonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Principal extends AppCompatActivity {

    ImageButton BtnBeneficio;
    ImageButton BtnImportancia;
    ImageButton BtnOndeDoar;
    ImageButton BtnComoDoar;

    // barra
    ImageView BtnPerfil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        // Instanciando os botões
        BtnBeneficio = findViewById (R.id.BtnBeneficio);
        BtnOndeDoar = findViewById (R.id.BtnOndeDoar);
        BtnComoDoar = findViewById (R.id.BtnComoDoar);
        BtnImportancia = findViewById (R.id.BtnImportancia);
        BtnPerfil = findViewById (R.id.BtnPerfil);

        BtnImportancia.setOnClickListener(new View.OnClickListener(){
            @Override // verificar se tem no cod
            public void onClick(View i){
                Intent PqDoar = new Intent(Principal.this, PqDoar.class);
                startActivity(PqDoar);
            }
        });

        BtnBeneficio.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View b) {
                Intent Beneficio = new Intent( Principal.this, Beneficio.class);
                startActivity(Beneficio);
            }
        });
        BtnOndeDoar.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View o) {
                Intent OndeDoar= new Intent( Principal.this, Ondedoar.class);
                startActivity(OndeDoar);
            }
        });
        BtnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View p) {
                Intent Perfil= new Intent( Principal.this, Login.class); //tava perfil pq? "Perfil.class"
                startActivity(Perfil);
            }
        });
        BtnComoDoar.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View c) {
                Intent ComoDoar= new Intent( Principal.this, ComoDoar.class);
                startActivity(ComoDoar);
            }
        });
    }
}