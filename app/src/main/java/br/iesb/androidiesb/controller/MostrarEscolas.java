package br.iesb.androidiesb.controller;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.iesb.androidiesb.R;
import br.iesb.androidiesb.adapter.EscolaAdapter;
import br.iesb.androidiesb.api.RetrofitEscola;
import br.iesb.androidiesb.api.TCUEscolas;
import br.iesb.androidiesb.model.Escola;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MostrarEscolas extends AppCompatActivity {

    private static final String BASE_URL = "http:mobile-aceite.tcu.gov.br:80/nossaEscolaRS/";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private LinearLayoutManager layoutManager;
    List<Escola> escolasList;
    EscolaAdapter escolaAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_escolas);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        escolasList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        TCUEscolas service = RetrofitEscola.getRetrofit().create(TCUEscolas.class);


        Call<List<Escola>> escolas = service.getUserData();

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Carregando");
        progressDialog.show();

        escolas.enqueue(new Callback<List<Escola>>() {
            @Override
            public void onResponse(Call<List<Escola>> call, Response<List<Escola>> response) {
                progressDialog.dismiss();
                escolasList = response.body();

                Log.d("MostrarEscolas", escolasList.toString());

                escolaAdapter = new EscolaAdapter(getApplicationContext(), escolasList);
                recyclerView.setAdapter(escolaAdapter);

            }

            @Override
            public void onFailure(Call<List<Escola>> call, Throwable t) {
                Log.d("MostrarEscolas", t.toString());
            }
        });
    }



}
