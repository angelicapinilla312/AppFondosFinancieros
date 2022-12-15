package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PrestamosCajero extends AppCompatActivity {

    ImageView btnBackPrestamoHome;
    Button btnPrestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prestamos_cajero);

        btnBackPrestamoHome = findViewById(R.id.btnBackPrestamoHome);
        btnPrestar = findViewById(R.id.btnPrestar);

        btnBackPrestamoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarMenuPrestamos(v);
            }
        });
        btnPrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarMenuPrestamos(v);
            }
        });

    }

    public void regresarMenuPrestamos(View view){
        Intent backpr = new Intent(PrestamosCajero.this,MenuCajero.class);
        startActivity(backpr);
    }


}