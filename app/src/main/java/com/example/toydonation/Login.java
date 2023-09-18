package com.example.toydonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
Button BtnLogin1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        BtnLogin1 = findViewById(R.id.BtnLogin1);

        BtnLogin1.setOnClickListener(new View.OnClickListener(){
            @Override // verificar se tem no cod
            public void onClick(View usu){
                Intent usuario = new Intent(Login.this, Perfil.class);
                startActivity(usuario);
            }
        });
    }
}