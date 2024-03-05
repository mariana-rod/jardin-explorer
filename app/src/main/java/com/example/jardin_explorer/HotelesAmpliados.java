package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jardin_explorer.moldes.Hotel;
import com.google.android.material.imageview.ShapeableImageView;

public class HotelesAmpliados extends AppCompatActivity {

    Hotel datoshotel;
    TextView nombreHotel;
    ShapeableImageView fotoHotel;
    TextView calificacionHotel;

    TextView descripcionHotel;
    TextView numeroHotel;
    TextView direccionHotel;
    Button botonHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_ampliados);

        nombreHotel=findViewById(R.id.nombrehotelampliando);
        fotoHotel=findViewById(R.id.fotohotelampliando);
        calificacionHotel=findViewById(R.id.calificacionhotelampliando);
        direccionHotel=findViewById(R.id.descripcionhotelampliando);
        numeroHotel=findViewById(R.id.numerohotelampliando);
        direccionHotel=findViewById(R.id.direccionhotelampliando);
        botonHotel=findViewById(R.id.btnVerMas3);

        datoshotel=(Hotel)getIntent().getSerializableExtra("datoshotel");

        nombreHotel.setText(datoshotel.getNombre());
        fotoHotel.setImageResource(datoshotel.getFotografia());
        calificacionHotel.setText(datoshotel.getCalificacion());
        descripcionHotel.setText(datoshotel.getDescripcion());
        direccionHotel.setText(datoshotel.getDireccion());
        numeroHotel.setText(datoshotel.getTelefono());
        botonHotel.setBottom(datoshotel.getBoton());

    }
}