package com.example.cedro_nds.myfilmesclient;

import java.util.List;

import interfaces.Autenticacao;
import model.AutenticarModel;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Test implements Autenticacao {
    @Override
    public Call<List<AutenticarModel>> autenticacaoAPI() {        Retrofit retrofit = new Retrofit.Builder().baseUrl(Autenticacao.API_URL)
            .addConverterFactory(GsonConverterFactory.create()).build();

        List<AutenticarModel> repositories = null;

        Autenticacao service = retrofit.create(Autenticacao.class);

        Call<List<AutenticarModel>> call = service.autenticacaoAPI();
        Call<List<AutenticarModel>> call2 = call.clone();
        Response<List<AutenticarModel>> response = null;
        try {
            response = call2.execute();
            repositories = response.body();
            if (repositories != null) {

                return (Call<List<AutenticarModel>>) repositories;
            }
            return (Call<List<AutenticarModel>>) repositories;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
