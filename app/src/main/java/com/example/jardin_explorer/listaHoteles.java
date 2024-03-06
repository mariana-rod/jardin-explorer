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
        listaHoteles.add(new Hotel("Gulupa Ecolodge", "Precios a partir de\nCOP 200.000\npor noche", "Un refugio ecológico en Jardín con estacionamiento vigilado, internet gratuito, bañera de hidromasaje, cafetería, alquiler de bicicletas y servicio de masajes, aceptando mascotas.", "Tel: 2345677", "Vereda La Selva,\nJardín 056057, Colombia.", "★★★★", R.drawable.gulupaecolodge, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Hotel Plantación", "Precios a partir de\nCOP 210.000\npor noche", "Diseño sostenible, restaurante 100% vegetal y seis habitaciones decoradas con artesanías colombianas, a seis cuadras del parque principal.", "Tel: 3092929", "Carrera 9 12 56,\nJardín 056050, Colombia.", "★★★★★", R.drawable.hotelplantacion, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Kantarrana Casa de Campo", "Precios a partir de\nCOP 215.000\npor noche", "Un encantador hotel con dos sedes: una urbana cerca de la Basílica y otra campestre a 4 km, abierto desde 1995 para brindar descanso total en armonía con el paisaje.", "Tel: 2114548", "Carrera 6a # 10-57\nJardín 011-57, Colombia.", "★★★★★", R.drawable.kantarrana, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Kantarrana Casa Urbana", "Precios a partir de\nCOP 218.000\npor noche", "Parte de la marca Kantarrana Casa de Campo, ofrece habitaciones independientes, spa básico de relajación y diversas experiencias, ya sea en la sede campestre o urbana.", "Tel: 3217890", "Cra. 6 #10-57\nJardín, Colombia.", "★★★★★", R.drawable.kantarranaurbana, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Hostería El Paraíso", "Precios a partir de\nCOP 240.000\npor noche", "A 700 metros del Parque de Jardín, esta estancia ofrece estacionamiento, internet de alta velocidad, restaurante, desayuno, actividades infantiles y servicio de lavandería.", "Tel: 4553612", "Sector La Paraisa,\nJardín 050021, Colombia.", "★★★★", R.drawable.hosteriaelparaiso, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Patio Bonito", "Precios a partir de\nCOP 245.000\npor noche", "Rodeado de montañas en Vereda Morro Amarillo, este hotel rural ofrece wifi, estacionamiento gratis, jardín, salón común, terraza, bar y zona de barbacoa.", "Tel: 2336598", "Vereda Morro Amarillo,\nJardín 005634, Colombia.", "★★★★", R.drawable.patiobonito, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Hotel Diana Campestre", "Precios a partir de\nCOP 250.000\npor noche", "Destaca por su combinación de calidad, comodidad y ubicación, ideal para familias con una variedad de servicios.", "Tel: 4567312", "Carrera 1 cll 9 no. 2-39\nJardín 056050, Colombia.", "★★★★★", R.drawable.dianacampestre, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("40 amigos Hotel", "Precios a partir de\nCOP 250.000\npor noche", "Pintoresco hotel, a 5 minutos del parque de Jardín, ofrece tranquilidad y comodidades con parqueadero privado gratuito.", "Tel:5215654", "Carrera 2A 15 16\nJardín 056050, Colombia.", "★★★★", R.drawable.amigoshotel, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Casa del sol", "Precios a partir de\nCOP 260.000\npor noche", "Proporciona estacionamiento gratuito, wifi de alta velocidad, actividades para niños, excursionismo y una zona de picnic, siendo pet-friendly y libre de humo.", "Tel: 4322154", "Vereda La Salada\nJardín 056050, Colombia.", "★★★★", R.drawable.lacasadelsol, R.id.btnVerMas3));
        listaHoteles.add(new Hotel("Casa Passiflora Hotel Boutique", "Precios a partir de\nCOP 300.000\npor noche", "Ofrece habitaciones con cerradura electrónica, WiFi gratis, smart TV HD 55'', jacuzzi y patio con pérgolas para una experiencia excepcional.", "Tel: 6753395", "Carrera 5a 11 48,\nJardín 056050, Colombia.", "★★★★★", R.drawable.passiflora, R.id.btnVerMas3));
    }
}