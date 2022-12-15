package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ReglasCajero extends AppCompatActivity {

    ImageView btnGuardarReglas, btnBackReglasHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglas_cajero);

        btnBackReglasHome = findViewById(R.id.btnBackReglasHome);
        btnGuardarReglas = findViewById(R.id.btnGuardarReglas);

        btnBackReglasHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarMenuReglas(v);
            }
        });

    }


    public void regresarMenuReglas(View view){
        Intent backr = new Intent(ReglasCajero.this,MenuCajero.class);
        startActivity(backr);
    }

}