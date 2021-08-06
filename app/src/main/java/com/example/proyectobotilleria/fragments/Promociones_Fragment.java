package com.example.proyectobotilleria.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.proyectobotilleria.AdaptadorPromociones;
import com.example.proyectobotilleria.Promociones;
import com.example.proyectobotilleria.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class Promociones_Fragment extends Fragment {



    private View.OnClickListener listener;

   private GridLayoutManager grid;




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    ArrayList<Promociones> listaPromociones;
    RecyclerView recyclerPromociones;

    public Promociones_Fragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static Promociones_Fragment newInstance(String param1, String param2) {
        Promociones_Fragment fragment = new Promociones_Fragment();
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
        View vista =  inflater.inflate(R.layout.fragment_promociones_, container, false);
        listaPromociones = new ArrayList<>();
        recyclerPromociones = vista.findViewById(R.id.recyclerId);
        recyclerPromociones.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarListaPromociones();

        AdaptadorPromociones adapter = new AdaptadorPromociones(listaPromociones);
        recyclerPromociones.setAdapter(adapter);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Selecciona: "+listaPromociones.get(recyclerPromociones.getChildAdapterPosition(view)).getValor(),Toast.LENGTH_SHORT).show();
            }
        });

        return vista;

    }

    private void llenarListaPromociones() {
        listaPromociones.add(new Promociones("Pisco Mistral","$5000",R.drawable.mistral));
        listaPromociones.add(new Promociones("Pisco Alto del Carmer","$4500",R.drawable.altodelcarmen));
        listaPromociones.add(new Promociones("vodka","$3500",R.drawable.vodka));
        listaPromociones.add(new Promociones("Mistral  + Bebida + Hielo","$7500",R.drawable.promocion1));
        listaPromociones.add(new Promociones("Alto del Carmen  + Bebida + Hielo","$7000",R.drawable.promocion2));
        listaPromociones.add(new Promociones("Red label","$7500",R.drawable.promocion5));
        listaPromociones.add(new Promociones("Pack evercrisp","$3990",R.drawable.promocion4));
        listaPromociones.add(new Promociones("Papas fritas Lays 500gr","$2500",R.drawable.lays));
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
