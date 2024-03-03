package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.jardin_explorer.adaptadores.HotelAdaptador;
import com.example.jardin_explorer.moldes.Hotel;

import java.util.ArrayList;

public class listaHoteles extends AppCompatActivity {

    ArrayList<Hotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerViewHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerViewHoteles = findViewById(R.id.listadinamicahoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        HotelAdaptador adaptador = new HotelAdaptador(listaHoteles);
        recyclerViewHoteles.setAdapter(adaptador);
    }

    public void crearListaHoteles(){
        listaHoteles.add(new Hotel("Gulupa", "precios a partir de","200 COP", "por noche","casa de campo", "4353463", "calle 1", 5, R.drawable.gulupaecolodge, R.id.btnVerMas));
        listaHoteles.add(new Hotel("Gulupa", "precios a partir de","200 COP", "por noche","casa de campo", "4353463", "calle 1", 5, R.drawable.gallito, R.id.btnVerMas));
    }
}