package com.example.jardin_explorer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jardin_explorer.adaptadores.HotelAdaptador;
import com.example.jardin_explorer.adaptadores.SitiosAdaptador;
import com.example.jardin_explorer.moldes.Hotel;
import com.example.jardin_explorer.moldes.Sitio;

import java.util.ArrayList;

public class listaSitios extends AppCompatActivity {
    ArrayList<Sitio> listaSitios = new ArrayList<>();
    RecyclerView recyclerViewSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);

        recyclerViewSitios = findViewById(R.id.listadinamicasitios);
        recyclerViewSitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaSitios();
        SitiosAdaptador adaptador = new SitiosAdaptador(listaSitios);
        recyclerViewSitios.setAdapter(adaptador);
    }
    public void crearListaSitios(){
        listaSitios.add(new Sitio(R.drawable.museoceramica, "Museo de la Cerámica", "★★★★", "Un espacio dedicado a la historia y arte de la cerámica local, donde podrás admirar una amplia colección de piezas.\n\nIdeal para aprender sobre la rica tradición ceramista de la región.", "Teléfono: 2349591", R.id.btnVerMas1));
        listaSitios.add(new Sitio(R.drawable.paseodelangel, "Paseo del Ángel", "★★★★★", "Una encantadora calle peatonal repleta de tiendas de artesanías y talleres de cerámica.\n\nLos visitantes pueden explorar y comprar productos locales únicos. Perfecto para disfrutar de una experiencia de compras auténtica.", "Teléfono: 2113444", R.id.btnVerMas1));
        listaSitios.add(new Sitio(R.drawable.granjaagro, "Granjas agroturísticas", "★★★★★", "Una experiencia interactiva en granjas que ofrecen actividades de agricultura y ganadería.\n\nPerfecto para familias y amantes de la naturaleza que deseen vivir el campo y conocer de cerca la vida rural.", "Teléfono: 2012455", R.id.btnVerMas1));
        listaSitios.add(new Sitio(R.drawable.talleralfareria, "Taller de alfarería", "★★★★", "Sumérgete en el mundo de la alfarería local y aprende las técnicas ancestrales de creación de cerámica.\n\nIdeal para quienes buscan experiencias creativas y contacto directo con el arte tradicional.", "Teléfono: 2503959", R.id.btnVerMas1));
        listaSitios.add(new Sitio(R.drawable.ecoparque, "Ecoparque Paseo y Vida", "★★★★★", "Un santuario ecológico que ofrece senderos naturales, áreas de picnic y actividades al aire libre.\n\nEs para toda la familia. Perfecto para disfrutar de la naturaleza y relajarse en un entorno verde y tranquilo.", "Teléfono: 2123464", R.id.btnVerMas1));
    }



}

