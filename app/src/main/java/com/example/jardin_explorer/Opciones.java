package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Opciones extends AppCompatActivity {

    //atributos para referenciar elementos gráficos
    // qué tengo en el xml que quiero controlar

    Button botonRestaurantes;
    Button botonAlojamiento;
    Button botonExplorar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        //asociar las variables creadas con los ID de los elementos que vienen desde XML

        botonRestaurantes = findViewById(R.id.btnRestaurantes);
        botonAlojamiento = findViewById(R.id.btnAlojamiento);
        botonExplorar = findViewById(R.id.btnExplorar);

        //escuchar eventos = dar clic en los botones
        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //acá escribo lo que quiero hacer cuando presionen el botón
                Toast.makeText(Opciones.this, "", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Opciones.this, Restaurantes.class);
                startActivity(intent);

            }
        });

        botonAlojamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //acá escribo lo que quiero hacer cuando presionen el botón
                Toast.makeText(Opciones.this, "", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Opciones.this, Alojamiento.class);
                startActivity(intent);
            }
        });

        botonExplorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //acá escribo lo que quiero hacer cuando presionen el botón
                Toast.makeText(Opciones.this, "", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Opciones.this, Explorar.class);
                startActivity(intent);
            }
        });


    }
}