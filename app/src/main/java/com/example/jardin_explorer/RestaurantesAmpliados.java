package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.jardin_explorer.moldes.Hotel;

public class RestaurantesAmpliados extends AppCompatActivity {

    Restaurantes datosrestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_ampliados);

        datosrestaurante=(Restaurantes) getIntent().getSerializableExtra("datosrestaurante");
        Toast.makeText(this, datosrestaurante.getNombre(), Toast.LENGTH_SHORT).show();
    }
}