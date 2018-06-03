package com.example.cedro_nds.myfilmesclient;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import model.AutenticarModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Test test = new Test();
        Context contexto = getApplicationContext();
        System.out.println(test.autenticacaoAPI());

        List<AutenticarModel> model = (List<AutenticarModel>) test.autenticacaoAPI();



        int duracao = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(contexto, model.get(0).getRequestToken(),duracao);
        toast.show();
        setContentView(R.layout.activity_main);
    }
}
