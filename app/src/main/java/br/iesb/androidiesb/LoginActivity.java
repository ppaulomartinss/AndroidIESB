package br.iesb.androidiesb;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import br.iesb.androidiesb.controller.MainActivity;


public class LoginActivity extends AppCompatActivity {

    private EditText loginEmail;
    private EditText loginSenha;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        loginEmail = (EditText) findViewById(R.id.loginEmail);
        loginSenha = (EditText) findViewById(R.id.loginSenha);

        mAuth = FirebaseAuth.getInstance();


        /*----------------------------------------------------------------------------------------------*/

        //LOGIN COM EMAIL E SENHA
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (loginEmail.getText() == null || loginEmail.getText().toString().equals("")) {
                    loginEmail.setError("Digite o seu email!");
                    return;
                }

                if (loginSenha.getText() == null || loginSenha.getText().toString().equals("")) {
                    loginSenha.setError("Digite sua senha!");
                    return;
                }

                mAuth.signInWithEmailAndPassword(loginEmail.getText().toString(), loginSenha.getText().toString())
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (!task.isSuccessful()) {
                                    Toast.makeText(LoginActivity.this, "Erro no login", Toast.LENGTH_LONG).show();
                                } else {
                                    FirebaseUser user = task.getResult().getUser();
                                    if (user != null) {
                                        Intent it = new Intent(LoginActivity.this, MainActivity.class);
                                        startActivity(it);
                                        finish();

                                    }
                                }
                            }
                        });

            }

        });


        Button btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        View.OnClickListener x = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, CadastroActivity.class));
            }

        };
        btnCadastrar.setOnClickListener(x);
    }

}


