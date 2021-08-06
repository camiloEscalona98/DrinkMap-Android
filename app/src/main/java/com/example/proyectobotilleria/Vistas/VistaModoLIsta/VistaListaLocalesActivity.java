package com.example.proyectobotilleria.Vistas.VistaModoLIsta;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.example.proyectobotilleria.AdaptadorLocales;
import com.example.proyectobotilleria.AdaptadorPromociones;
import com.example.proyectobotilleria.InfoFragment;
import com.example.proyectobotilleria.R;

import java.util.ArrayList;
import java.util.List;

public class VistaListaLocalesActivity extends AppCompatActivity {
    private FrameLayout contenedor_fragmentInfoLista;
    private RecyclerView recyclerView;
    private AdaptadorLocales adaptadorLocales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_lista_locales);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerListaId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adaptadorLocales = new AdaptadorLocales(obtenerLocales());
        recyclerView.setAdapter(adaptadorLocales    );

        getSupportActionBar().hide();
        contenedor_fragmentInfoLista = findViewById(R.id.contenedor_fragment_info_lista);
        InfoFragment infoFragment = new InfoFragment();


        adaptadorLocales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final InfoFragment infoFragment = new InfoFragment();
                contenedor_fragmentInfoLista = findViewById(R.id.contenedor_fragment_info_lista);
                setFragment(infoFragment);

            }

        });





    }
    private void setFragment(Fragment fragment) {
        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.contenedor_fragment_info_lista, fragment);
        transaction1.commit();


    }

    public List<ListaLocales> obtenerLocales()
    {
       List<ListaLocales> locales = new ArrayList<>();
       locales.add(new ListaLocales("Calafate","300m",R.drawable.botilleria1,R.drawable.circuloverde));
       locales.add(new ListaLocales("La Tia","580m",R.drawable.botilleria2,R.drawable.circuloverde));
       locales.add(new ListaLocales("Duck","760m",R.drawable.botilleria3,R.drawable.circulorojo));
       locales.add(new ListaLocales("Cavas","940m",R.drawable.botilleria4,R.drawable.circulorojo));
       locales.add(new ListaLocales("Leon","1010m",R.drawable.botilleria5,R.drawable.circulorojo));
       locales.add(new ListaLocales("Me Lance","1150m",R.drawable.botilleria6,R.drawable.circuloverde));
       locales.add(new ListaLocales("El Chanta","1300m",R.drawable.botilleria7,R.drawable.circuloverde));
       locales.add(new ListaLocales("Rock and Roll","1500m",R.drawable.botilleria8,R.drawable.circulorojo));
       locales.add(new ListaLocales("El Faro","2020m",R.drawable.botilleria9,R.drawable.circuloverde));



        return locales;
    }


}
