package br.iesb.androidiesb.api;

import android.util.Log;

import java.util.List;

import br.iesb.androidiesb.model.Escola;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Paulo on 25/11/2017.
 */

public class RetrofitEscola {


        public static final String BASE_URL = "http:mobile-aceite.tcu.gov.br:80/nossaEscolaRS/";
        private static Retrofit retrofit = null;

        public static Retrofit getRetrofit() {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }

