package com.example.toydonation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cadastro extends AppCompatActivity { //Main Activity? no cod mandado
    Button BtnCadastrar1;
    Button BtnLogin2;
    /* EditText edtxtNome;
    EditText edtxtEmail;
    EditText edtxtTelefone;
    EditText edtxtSenha; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro); // activity main?

        BtnCadastrar1 = findViewById(R.id.BtnCadastrar1);
        BtnLogin2 = findViewById(R.id.BtnLogin2);

        BtnCadastrar1.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View cdo) {
                Intent Cadastrar1 = new Intent(Cadastro.this, Perfil.class);
                startActivity(Cadastrar1);
            }
        });

        BtnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override // verificar se tem no cod
            public void onClick(View l) {
                Intent Login2 = new Intent(Cadastro.this, Login.class);
                startActivity(Login2);

            }
        });
    }
}