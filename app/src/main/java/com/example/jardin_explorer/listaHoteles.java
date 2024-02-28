package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class listaHoteles extends AppCompatActivity {

    ArrayList<Hotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerViewHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerViewHoteles = findViewById(R.id.listadinamicahoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearlistaHoteles();
        HotelAdaptador adaptador = new HotelAdaptador(listaHoteles);
        recyclerViewHoteles.setAdapter(adaptador);
    }

    public void crearlistaHoteles(){
        listaHoteles.add();
    }
}