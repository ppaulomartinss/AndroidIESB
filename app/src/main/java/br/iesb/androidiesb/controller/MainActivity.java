package br.iesb.androidiesb.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import br.iesb.androidiesb.atividades.LoginActivity;
import br.iesb.androidiesb.R;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //BOTÃO ESCOLAS
        Button btnEscolas = (Button) findViewById(R.id.btnEscolas);
        View.OnClickListener x = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MostrarEscolas.class));
            }

        };
        btnEscolas.setOnClickListener(x);


        //BOTÃO ENCERRAR SESSÃO
        Button btnEncerrar = (Button) findViewById(R.id.btnEncerrar);
        View.OnClickListener y = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }

        };
        btnEncerrar.setOnClickListener(y);


        //BOTÃO MAPA
        /*Button btnMapa = (Button) findViewById(R.id.btnMapa);
        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent it = new Intent( MainActivity.this, Main2Activity.class);
                it.putExtra ("latitude",15.34223);
                it.putExtra ("longitude", 45.67676);
                startActivity(it);
            }
        });*/

    }

}


