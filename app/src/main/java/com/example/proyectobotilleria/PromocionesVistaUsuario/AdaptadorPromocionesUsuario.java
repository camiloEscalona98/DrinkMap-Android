package com.example.proyectobotilleria.PromocionesVistaUsuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectobotilleria.R;

import java.util.List;

public class AdaptadorPromocionesUsuario extends RecyclerView.Adapter<AdaptadorPromocionesUsuario.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

            private TextView valorPromocion, descripcionPromocion;
            ImageView fotoPromocion;

            public  ViewHolder(View itemView)
            {
                super(itemView);
                valorPromocion = (TextView)itemView.findViewById(R.id.txv_valor_usuario);
                descripcionPromocion = (TextView)itemView.findViewById(R.id.txv_descripcion_usuario);
                fotoPromocion = (ImageView)itemView.findViewById(R.id.imb_foto_usuario);
            }

        }

        public List<PromocionesUsuario> promocionesUsuarioList;


        public AdaptadorPromocionesUsuario(List<PromocionesUsuario> promocionesUsuarioList)
        {
             this.promocionesUsuarioList = promocionesUsuarioList;
        }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

         View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promocines_vista_usuario,parent,false);
         ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.valorPromocion.setText(promocionesUsuarioList.get(position).getValorPromocion());
        holder.descripcionPromocion.setText(promocionesUsuarioList.get(position).getDescripcionPromocion());
        holder.fotoPromocion.setImageResource(promocionesUsuarioList.get(position).getFotoPromocion());
    }

    @Override
    public int getItemCount() {
        return promocionesUsuarioList.size();
    }
}


