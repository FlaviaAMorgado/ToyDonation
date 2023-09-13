package com.example.toydonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Perfil ou MainActivity nessa parte?
public class Perfil extends AppCompatActivity {
    Button BtnDoar;
    Button BtnBrinquedosDoados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        BtnDoar = findViewById (R.id.BtnDoar);
        BtnBrinquedosDoados = findViewById (R.id.BtnBrinquedosDoados);


        BtnDoar.setOnClickListener(new View.OnClickListener(){
            @Override // verificar se tem no cod
            public void onClick(View d) {
                Intent Doar = new Intent( Perfil.this, Ondedoar.class);
                startActivity(Doar);

                // Questão, podemos chamar a mesma intente ?
            }
        });
    }
}