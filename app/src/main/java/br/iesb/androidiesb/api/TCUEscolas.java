package br.iesb.androidiesb.api;

import java.util.List;

import br.iesb.androidiesb.model.Escola;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Paulo on 24/11/2017.
 */

public interface TCUEscolas {
    @GET("rest/escolas")
    Call<List<Escola>> getUserData();
}
