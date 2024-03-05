package com.example.jardin_explorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.jardin_explorer.moldes.Hotel;
import com.example.jardin_explorer.moldes.Sitio;

public class SitiosAmpliados extends AppCompatActivity {

    Sitio datossitio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_ampliados);

        datossitio=(Sitio) getIntent().getSerializableExtra("datossitio");
        Toast.makeText(this, datossitio.getNombre(), Toast.LENGTH_SHORT).show();
    }
}