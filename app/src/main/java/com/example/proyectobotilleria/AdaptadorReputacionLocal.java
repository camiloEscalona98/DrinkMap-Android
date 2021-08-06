package com.example.proyectobotilleria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectobotilleria.Reputacion.ReputacionLocal;

import java.util.List;

public class AdaptadorReputacionLocal   extends RecyclerView.Adapter<AdaptadorReputacionLocal.ViewHolder> {

    public static class  ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView nombre, comentario;
        private ImageView valoracion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = (TextView)itemView.findViewById(R.id.txv_nombre_reputacion);
            comentario = (TextView)itemView.findViewById(R.id.txv_comentario_reputacion);
            valoracion = (ImageView)itemView.findViewById(R.id.imv_valoracion_reputacion);

        }
    }
    public List<ReputacionLocal> comentariosLista;
    public AdaptadorReputacionLocal(List<ReputacionLocal> comentariosLista) {
        this.comentariosLista = comentariosLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_reputacion_local,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
//modificaciones de contenido
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.comentario.setText(comentariosLista.get(position).getComentario());
        holder.nombre.setText(comentariosLista.get(position).getNombre());
        holder.valoracion.setImageResource(comentariosLista.get(position).getValoracion());
    }

    @Override
    public int getItemCount() {
        return comentariosLista.size();
    }
}
