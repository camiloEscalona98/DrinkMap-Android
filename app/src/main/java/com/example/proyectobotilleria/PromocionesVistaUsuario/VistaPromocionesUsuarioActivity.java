package com.example.proyectobotilleria.PromocionesVistaUsuario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.proyectobotilleria.Promociones;
import com.example.proyectobotilleria.R;

import java.util.ArrayList;
import java.util.List;

public class VistaPromocionesUsuarioActivity extends AppCompatActivity {

    private RecyclerView recyclerViewUsuario;
    private AdaptadorPromocionesUsuario adaptadorPromocionesUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_promociones_usuario);

        getSupportActionBar().hide();

      recyclerViewUsuario = (RecyclerView)findViewById(R.id.recycler_promociones_usuario);
      recyclerViewUsuario.setLayoutManager(new LinearLayoutManager(this));
      adaptadorPromocionesUsuario= new AdaptadorPromocionesUsuario(obtenerPromocionesUsuario());
      recyclerViewUsuario.setAdapter(adaptadorPromocionesUsuario);
    }

    public List<PromocionesUsuario> obtenerPromocionesUsuario()
    {
        List<PromocionesUsuario> promocionesUsuarios = new ArrayList<>();
        promocionesUsuarios.add(new PromocionesUsuario("$5000","Pisco Mistral",R.drawable.mistral));
        promocionesUsuarios.add(new PromocionesUsuario("$4500","Pisco Alto del Carmer",R.drawable.altodelcarmen));
        promocionesUsuarios.add(new PromocionesUsuario("$3500","Vodka",R.drawable.vodka));
        promocionesUsuarios.add(new PromocionesUsuario("$7000","Alto del Carmen  + Bebida + Hielo",R.drawable.promocion2));
        promocionesUsuarios.add(new PromocionesUsuario("$7500","Red label",R.drawable.promocion5));
        promocionesUsuarios.add(new PromocionesUsuario("$3990","Pack evercrisp",R.drawable.promocion4));
        promocionesUsuarios.add(new PromocionesUsuario("$2500","Papas fritas Lays 500gr",R.drawable.lays));


        return promocionesUsuarios;
    }

}
