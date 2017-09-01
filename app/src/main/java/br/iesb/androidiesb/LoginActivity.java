package br.iesb.androidiesb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        Button b = (Button) findViewById(R.id.btnCadastrar);
        View.OnClickListener x = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (LoginActivity.this, CadastroActivity.class));
            }
        };
        b.setOnClickListener(x);
    }


    /* BTNCADASTRAR
    public void mostrarTelaCadastro(View parametro){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
    */

    public void efetuarLogin(View parametro){
        Intent it = new Intent(this, TelaPrincipalActivity.class);
        startActivity(it);
    }
}
