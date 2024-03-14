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
        listaHoteles.add(new Hotel("Gulupa Ecolodge", "Precios a partir de\nCOP 200.000\npor noche", "Un refugio ecológico en Jardín con estacionamiento vigilado, internet gratuito, bañera de hidromasaje, cafetería, alquiler de bicicletas y servicio de masajes, aceptando mascotas.", "Tel: 2345677", "Vereda La Selva,\nCarmen 056057, Colombia.", "★★★★", R.drawable.gulupaecolodge, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Hotel Plantación", "Precios a partir de\nCOP 210.000\npor noche", "Diseño sostenible, restaurante 100% vegetal y seis habitaciones decoradas con artesanías colombianas, a seis cuadras del parque principal.", "Tel: 3092929", "Carrera 9 12 56,\nCarmen 056050, Colombia.", "★★★★★", R.drawable.hotelplantacion, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Kantarrana Casa de Campo", "Precios a partir de\nCOP 215.000\npor noche", "Un encantador hotel con dos sedes: una urbana cerca de la Basílica y otra campestre a 4 km, abierto desde 1995 para brindar descanso total en armonía con el paisaje.", "Tel: 2114548", "Carrera 6a # 10-57\nCarmen 011-57, Colombia.", "★★★★★", R.drawable.kantarrana, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Kantarrana Casa Urbana", "Precios a partir de\nCOP 218.000\npor noche", "Parte de la marca Kantarrana Casa de Campo, ofrece habitaciones independientes, spa básico de relajación y diversas experiencias, ya sea en la sede campestre o urbana.", "Tel: 3217890", "Cra. 6 #10-57\nCarmen, Colombia.", "★★★★★", R.drawable.kantarranaurbana, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Hostería El Paraíso", "Precios a partir de\nCOP 240.000\npor noche", "A 700 metros del Parque de Jardín, esta estancia ofrece estacionamiento, internet de alta velocidad, restaurante, desayuno, actividades infantiles y servicio de lavandería.", "Tel: 4553612", "Sector La Paraisa,\nCarmen 050021, Colombia.", "★★★★", R.drawable.hosteriaelparaiso, R.id.btnVerMas3));
    }
}