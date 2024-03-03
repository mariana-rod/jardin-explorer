package com.example.jardin_explorer.adaptadores;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jardin_explorer.R;
import com.example.jardin_explorer.moldes.Sitio;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class SitiosAdaptador extends RecyclerView.Adapter<SitiosAdaptador.viewHolder> {

    public ArrayList<Sitio> listaSitios;

    public SitiosAdaptador() {
    }

    public SitiosAdaptador(ArrayList<Sitio> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public SitiosAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios, null, false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull SitiosAdaptador.viewHolder holder, int position) {
        holder.pintarMolde(listaSitios.get(position));
    }

    @Override
    public int getItemCount() {
        return listaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView fotomoldesitio;
        TextView nombresitiomolde;
        TextView descripcionsitiomolde;
        Button btnVerMas;

        public viewHolder(@NonNull View itemView) {

            super(itemView);
            fotomoldesitio = itemView.findViewById(R.id.fotomoldehotel);
            nombresitiomolde = itemView.findViewById(R.id.nombresitiomolde);
            descripcionsitiomolde = itemView.findViewById(R.id.descripcionsitiomolde);
            btnVerMas = itemView.findViewById(R.id.btnVerMas);
        }

        public void pintarMolde(Sitio sitio) {
            fotomoldesitio.setImageResource(sitio.getFotografia());
            nombresitiomolde.setText(sitio.getNombre());
            descripcionsitiomolde.setText(sitio.getDescripcion());
            btnVerMas.setBottom(sitio.getBoton());
        }
    }
}