package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //atributos para referenciar elementos gráficos
    // qué tengo en el xml que quiero controlar

    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //asociar las variables creadas con los ID de los elementos que vienen desde XML

        botonHoteles = findViewById(R.id.botonhoteles);
        botonRestaurantes = findViewById(R.id.botonrestaurantes);
        botonSitios = findViewById(R.id.botonsitios);

        //escuchar eventos = dar clic en los botones
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //acá escribo lo que quiero hacer cuando presionen el botón
                Toast.makeText(Home.this, "hizo clic en hoteles", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Home.this, Hoteles.class);
                startActivity(intent);

            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //acá escribo lo que quiero hacer cuando presionen el botón
                Toast.makeText(Home.this, "hizo clic en restaurantes", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Home.this, Restaurantes.class);
                startActivity(intent);
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //acá escribo lo que quiero hacer cuando presionen el botón
                Toast.makeText(Home.this, "hizo clic en sitios turísticos", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Home.this, Sitios.class);
                startActivity(intent);
            }
        });


    }
}
