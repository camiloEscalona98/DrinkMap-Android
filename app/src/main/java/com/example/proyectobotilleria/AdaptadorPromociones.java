package com.example.proyectobotilleria;


import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPromociones extends RecyclerView.Adapter<AdaptadorPromociones.ViewHolderPromociones> implements View.OnClickListener{

    ArrayList<Promociones>listapromociones;


    private View.OnClickListener listener;
    private Context mContext;


    public AdaptadorPromociones(ArrayList<Promociones> listapromociones){

        this.listapromociones = listapromociones;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolderPromociones onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_promociones,null,false);
        view.setOnClickListener(this);
        return new ViewHolderPromociones(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolderPromociones holder, final int position) {
        final Promociones promociones = listapromociones.get(position);
        holder.descripcion.setText(listapromociones.get(position).getDescripcion());
        holder.valor.setText(listapromociones.get(position).getValor());
        holder.foto.setImageResource(listapromociones.get(position).getFoto());







    }

    @Override
    public int getItemCount() {
        return listapromociones.size();

    }
    public void setOnClickListener(View.OnClickListener listener) {





    }


    @Override
    public void onClick(View view) {
        if(listener!=null)
        {
            listener.onClick(view);
        }

    }


    public class ViewHolderPromociones extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {

        TextView valor, descripcion,opciones;
        ImageView foto;
        CardView cardView;

        public ViewHolderPromociones(@NonNull View itemView) {
            super(itemView);
            valor = (TextView) itemView.findViewById(R.id.txv_valor);
            descripcion = (TextView) itemView.findViewById(R.id.txv_descripcion);
            foto = (ImageView) itemView.findViewById(R.id.imb_foto);
            opciones = (TextView) itemView.findViewById(R.id.opciones);

        }


        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

            menu.add(this.getAdapterPosition(),1,0,"Actualizar");
            menu.add(this.getAdapterPosition(),2,0,"Eliminar");



        }
    }
}
