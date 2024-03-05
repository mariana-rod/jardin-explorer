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
        listaSitios.add(new Sitio("Reserva Natural Jardín de Rocas","Un espacio para contemplar al ave Gallito de las rocas (Rupicola peruvianus) en medio de su hábitat natural.","2349591", R.drawable.gallito, R.id.btnVerMas1));
        listaSitios.add(new Sitio("Teatro Municipal","Construido en 1912, el Teatro Municipal de Jardín, de estilo isabelino, es un referente cultural y arquitectónico restaurado en 2019. Su programación artística diversa lo convierte en un punto de encuentro imperdible.","2113444",R.drawable.teatromunicipal, R.id.btnVerMas1));
        listaSitios.add(new Sitio("Basílica de la Inmaculada Concepción","Impresionante templo neogótico construido en 1932, la Basílica destaca por su arquitectura tanto externa como interna, con piedra tallada, vitrales y una mística especial como Monumento Nacional.","2012455",R.drawable.basilica, R.id.btnVerMas1));
        listaSitios.add(new Sitio("La Garrucha o Teleférico","El preferido para llegar al mirador Filo de Oro, este mágico recorrido de 1 kilómetro sobre la quebrada Volcanes es uno de los principales atractivos de Jardín, ofreciendo vistas sorprendentes y atardeceres espectaculares.","2503959",R.drawable.garrucha, R.id.btnVerMas1));
        listaSitios.add(new Sitio("Truchera La Argelia","A 2 kilómetros del casco urbano, esta truchera ofrece una experiencia única con el cultivo de truchas de exportación. Puedes pescar y disfrutar de trucha frita, llegando en transporte propio o en los motoratones del municipio.","2123464",R.drawable.truchera, R.id.btnVerMas1));
        listaSitios.add(new Sitio("Parque El libertador","Declarado Monumento Nacional en 1985, el Parque Principal de Jardín deslumbra con su encanto especial, colores vibrantes, balcones y arquitectura única, convirtiéndose en una de las plazas más hermosas de Antioquia.","2495868",R.drawable.parque, R.id.btnVerMas1));
        listaSitios.add(new Sitio("Canyoning en Cascada La Escalera","Esta cascada en la Vereda La Salada, a 3 kilómetros del casco urbano, ofrece una experiencia natural única con aguas cristalinas, paisajes verdes y biodiversidad. Perfectamente accesible para quienes buscan aventuras en la naturaleza.","2002855",R.drawable.canyoning, R.id.btnVerMas1));
        listaSitios.add(new Sitio("Cueva El Esplendor","Sumérgete en la mágica oscuridad de la Cueva El Esplendor, una maravilla subterránea en Jardín que deslumbra con formaciones rocosas impresionantes y una atmósfera única.","2884753",R.drawable.cueva, R.id.btnVerMas1));
        listaSitios.add(new Sitio("Festival de cine","Disfruta de la magia cinematográfica en Jardín con el Festival de Cine, un evento anual que celebra la diversidad y creatividad audiovisual, brindando a los espectadores una experiencia única.","2345691",R.drawable.festivalcine, R.id.btnVerMas1));
        listaSitios.add(new Sitio("Tour del Café","Embárcate en un emocionante Tour del Café en Jardín, explorando las plantaciones locales, conociendo el proceso de producción y degustando exquisitas variedades de café en un viaje educativo y delicioso.","2213565",R.drawable.tourcafe, R.id.btnVerMas1));
    }
}
