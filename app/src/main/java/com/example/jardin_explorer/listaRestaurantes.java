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
        listaRestaurantes.add(new Restaurante(R.drawable.bonappetit, "Bon Appétit", "★★★★★", "Restaurante, pizzería, parrilla", "calle 2", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.aromasdelcafe, "Aromas del Café", "★★★★★", "Cafetería, postres caseros", "Calle 8 #20-45", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.antojitosdelvalle, "Antojitos del Valle", "★★★★☆", "Cocina regional, trucha al ajillo", "Avenida del Río #55-21", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.rinconserrano, "Rincón Serrano", "★★★★★", "Parrilla, carnes a la brasa", "Calle de los Pájaros #9-15", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.lafogata, "La Fogata", "★★★★☆", "Asado al aire libre, ambiente campestre", "Vereda El Fogón", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.deliciasdeljardin, "Delicias del Jardín", "★★★★★", "Platos gourmet, cocina fusionada", "Plaza Principal #30-10", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.saboresmontaneros, "Sabores Montañeros", "★★★★☆", "Especialidades locales, trucha en salsa de maracuyá", "Carrera 4 #18-22", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.elfogondelvalle, "El Fogón del Valle", "★★★★★", "Cocina regional, tamales y sancocho", "Calle del Fogón #12-08", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.eljardindelsabor, "El Jardín del Sabor", "★★★★☆", "Cocina gourmet, vistas panorámicas", "Calle de las Flores #40-55", R.id.btnVerMas2));
        listaRestaurantes.add(new Restaurante(R.drawable.parrilladaslamontana, "Parrilladas La Montaña", "★★★★★", "Parrilla argentina, cortes de carne premium", "Carrera 10 #25-18", R.id.btnVerMas2));
    }

}