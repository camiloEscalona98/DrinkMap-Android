package com.example.proyectobotilleria.ConfiguracionLocal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proyectobotilleria.AdaptadorReputacionLocal;
import com.example.proyectobotilleria.R;
import com.example.proyectobotilleria.Reputacion.ReputacionLocal;

import java.util.ArrayList;
import java.util.List;

public class ConReputacionActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private AdaptadorReputacionLocal adaptadorReputacionLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_reputacion);
        getSupportActionBar().hide();


        recyclerView = (RecyclerView)findViewById(R.id.recycler_reputacion_local);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adaptadorReputacionLocal = new AdaptadorReputacionLocal(obtenerReputacion());
        recyclerView.setAdapter(adaptadorReputacionLocal);
    }

    public List<ReputacionLocal> obtenerReputacion()
    {

        List<ReputacionLocal> reputacionLocal = new ArrayList<>();
        reputacionLocal.add(new ReputacionLocal("Juan","muy buena atencion",R.drawable.megusta));
        reputacionLocal.add(new ReputacionLocal("Pedro","muy buenos precios",R.drawable.megusta));
        reputacionLocal.add(new ReputacionLocal("Diego","pesimo!!!",R.drawable.nomegusta));
        reputacionLocal.add(new ReputacionLocal("Cristian","excelente",R.drawable.megusta));
        reputacionLocal.add(new ReputacionLocal("Ignacia","faltan promos...",R.drawable.nomegusta));
        reputacionLocal.add(new ReputacionLocal("Ivan","la raja!!!",R.drawable.megusta));
        reputacionLocal.add(new ReputacionLocal("Santiago","super buena la atencion",R.drawable.megusta));
        reputacionLocal.add(new ReputacionLocal("Cristobal","muy buenas promos",R.drawable.megusta));
        reputacionLocal.add(new ReputacionLocal("francisca","Nueva botilleria favorita",R.drawable.megusta));
        reputacionLocal.add(new ReputacionLocal("Javiera","100% recomendada",R.drawable.megusta));
        return  reputacionLocal;
    }

}
