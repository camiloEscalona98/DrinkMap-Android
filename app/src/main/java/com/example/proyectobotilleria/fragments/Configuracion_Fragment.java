package com.example.proyectobotilleria.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.proyectobotilleria.ConfiguracionLocal.ConCuentaActivity;
import com.example.proyectobotilleria.ConfiguracionLocal.ConReputacionActivity;
import com.example.proyectobotilleria.InicioSesion.InicioLocalActivity;
import com.example.proyectobotilleria.ModPromociones.AnadirPromocion;
import com.example.proyectobotilleria.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Configuracion_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Configuracion_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Configuracion_Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ImageView btnMiLocal, btnReputacionLocal;
    private CheckedTextView btn_cerrarLocal;


    private OnFragmentInteractionListener mListener;

    public Configuracion_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Configuracion_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Configuracion_Fragment newInstance(String param1, String param2) {
        Configuracion_Fragment fragment = new Configuracion_Fragment();
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
        View view = inflater.inflate(R.layout.fragment_configuracion_, container, false);

        btnMiLocal = (ImageView) view.findViewById(R.id.btn_mi_local);
        btnMiLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (view.getContext(), ConCuentaActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        btnReputacionLocal = (ImageView) view.findViewById(R.id.imv_reputacion_local);
        btnReputacionLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ConReputacionActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        btn_cerrarLocal = (CheckedTextView) view.findViewById(R.id.btn_cerrarSesion_local);
        btn_cerrarLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), InicioLocalActivity.class);
                startActivityForResult(intent, 0);
            }
        });







        return view;



    }


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
