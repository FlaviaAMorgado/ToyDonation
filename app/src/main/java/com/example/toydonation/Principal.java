package com.example.toydonation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

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
        BtnImportancia = findViewById (R.id.btnImportancia);
        BtnPerfil = findViewById (R.id.BtnPerfil);

        BtnImportancia.setOnClickListener(new View.OnClickListener(){
            @Override // verificar se tem no cod
            public void onClick(View i){
                Intent pqdoar = new Intent(Principal.this, PqDoar.class);
                startActivity(pqdoar);
            }
        });

        BtnBeneficio.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View b) {
                Intent beneficio = new Intent( Principal.this, Beneficio.class);
                startActivity(beneficio);
            }
        });
        BtnOndeDoar.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View o) {
                Intent ondedoar= new Intent( Principal.this, Ondedoar.class);
                startActivity(ondedoar);
            }
        });
        BtnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View p) {
                Intent perfil= new Intent( Principal.this, Cadastro.class); //tava perfil pq? "Perfil.class"
                startActivity(perfil);
            }
        });
        BtnComoDoar.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View c) {
                Intent comodoar= new Intent( Principal.this, ComoDoar.class);
                startActivity(comodoar);
            }
        });
    }
}