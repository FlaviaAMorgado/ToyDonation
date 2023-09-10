package com.example.toydonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Principal extends AppCompatActivity {

    ImageButton BtnBeneficio;
    ImageButton BtnImportancia;
    ImageButton BtnOndeDoar;
    ImageButton BtnComoDoar;

    // barra
    ImageButton BtnPerfil;


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
                Intent Importancia = new Intent(Principal.this, PqDoar.class);
                startActivity(Importancia);
            }
        });
    }
}