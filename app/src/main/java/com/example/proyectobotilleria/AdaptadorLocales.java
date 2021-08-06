package com.example.proyectobotilleria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectobotilleria.Vistas.VistaModoLIsta.ListaLocales;

import java.util.List;

public class AdaptadorLocales extends RecyclerView.Adapter<AdaptadorLocales.ViewHolder> implements View.OnClickListener {

    private View.OnClickListener listener;



    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView fotoLocal, disponibilidad;
        TextView nombreLocal, distanciaLocal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreLocal = (TextView)itemView.findViewById(R.id.txv_nombre_local);
            distanciaLocal = (TextView)itemView.findViewById(R.id.txv_distancia);
            fotoLocal = (ImageView)itemView.findViewById(R.id.imv_lista_locales);
            disponibilidad = (ImageView) itemView.findViewById(R.id.img_conexion);


        }
    }


    public List<ListaLocales> listaLocales;
    public AdaptadorLocales(List<ListaLocales> listaLocales) {
        this.listaLocales = listaLocales;
    }
//encargado contenido de lista
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_vista_locales, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        view.setOnClickListener(this);

        return viewHolder;
    }

//modificaciones para cada item



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombreLocal.setText(listaLocales.get(position).getTxv_nombreLocal());
        holder.distanciaLocal.setText(listaLocales.get(position).getTxv_distanciaLocal());
        holder.fotoLocal.setImageResource(listaLocales.get(position).getImg_fotoLocal());
        holder.disponibilidad.setImageResource(listaLocales.get(position).getImg_disponibilidad());
    }

    @Override
    public int getItemCount() {
        return listaLocales.size();
    }

    public void setOnClickListener(View.OnClickListener listener)
    {
        this.listener= listener;
    }


    @Override
    public void onClick(View v) {
         if(listener != null)
         {
             listener.onClick(v);
         }
    }



}
