package com.example.proyectobotilleria;


import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.fragment.app.Fragment;

import com.example.proyectobotilleria.PromocionesVistaUsuario.VistaPromocionesUsuarioActivity;
import com.example.proyectobotilleria.Reputacion.ReputacionUsuarioActivity;
import com.example.proyectobotilleria.Vistas.VistaModoLIsta.VistaListaLocalesActivity;

public class InfoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
   ImageButton btnCalificar;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView btnAtras;
    ImageButton btnMenuPromociones;

    public boolean isBoton() {
        return boton;
    }

    public void setBoton(boolean boton) {
        this.boton = boton;
    }

    boolean boton;
    ImageButton btnPromociones;

    public InfoFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static InfoFragment newInstance(String param1, String param2) {
        InfoFragment fragment = new InfoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_info, container, false);


        btnAtras = (ImageView) view.findViewById(R.id.btn_atras);
        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                getFragmentManager().beginTransaction().
                        remove(getFragmentManager().findFragmentById(R.id.contenedor_fragment_info_lista)).commit();


            }
        });


        btnMenuPromociones = (ImageButton) view.findViewById(R.id.btn_menu_promociones_usuario);
        btnMenuPromociones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), VistaPromocionesUsuarioActivity.class);
                startActivity(intent);
            }
        });


        btnCalificar = (ImageButton) view.findViewById(R.id.btn_calificar);
        btnCalificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ReputacionUsuarioActivity.class);
                startActivity(intent);

            }
        });

        return view;
    }





}
