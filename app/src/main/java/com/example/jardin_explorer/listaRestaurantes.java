package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.jardin_explorer.adaptadores.HotelAdaptador;
import com.example.jardin_explorer.adaptadores.RestauranteAdaptador;
import com.example.jardin_explorer.moldes.Hotel;
import com.example.jardin_explorer.moldes.Restaurante;
import com.example.jardin_explorer.moldes.Sitio;

import java.util.ArrayList;

public class listaRestaurantes extends AppCompatActivity {

    ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerViewRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerViewRestaurantes = findViewById(R.id.listadinamicarestaurantes);
        recyclerViewRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaRestaurantes();
        RestauranteAdaptador adaptador = new RestauranteAdaptador(listaRestaurantes);
        recyclerViewRestaurantes.setAdapter(adaptador);
    }
    public void crearListaRestaurantes(){
        listaRestaurantes.add(new Restaurante(R.drawable.micacera, "Micacera Restaurante", "★★★★★", "Comida latina, bar, café, fusión", "Dirección: calle 22 #30-11", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.aromasdelcafe, "Aromas del Café", "★★★★★", "Cafetería, postres caseros", "Dirección: Calle 8 #20-45", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.dellanonna, "Della Nonna Trattoria", "★★★★☆", "Cocina italiana, apta para vegetarianos", "Dirección: Avenida del Río #55-21", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.youssef, "Youssef Mediterranean Taste", "★★★★★", "Comida mediterránea, marroquí y árabe", "Dirección: Calle de los Pájaros #9-15", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.lacantaleta, "La Cantaleta", "★★★★☆", "Comida típica colombiana", "Dirección: Vereda El Fogón", R.id.btnVerMas2));
        }

}