package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrestamosCajero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prestamos_cajero);
    }

    public void regresarMenuPrestamos(View view){
        Intent backpr = new Intent(PrestamosCajero.this,MenuCajero.class);
        startActivity(backpr);
    }

}