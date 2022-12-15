package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class ReglasCajero extends AppCompatActivity {

<<<<<<< HEAD
=======
    ImageView btnGuardarReglas, btnBackReglasHome;
>>>>>>> data_and_backend

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglas_cajero);

<<<<<<< HEAD
=======
        btnBackReglasHome = findViewById(R.id.btnBackReglasHome);
        btnGuardarReglas = findViewById(R.id.btnGuardarReglas);

        btnBackReglasHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarMenuReglas(v);
            }
        });
>>>>>>> data_and_backend
    }


    public void regresarMenuReglas(View view){
        Intent backr = new Intent(ReglasCajero.this,MenuCajero.class);
        startActivity(backr);
    }

}