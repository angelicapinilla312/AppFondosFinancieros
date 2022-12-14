package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class ReglasCajero extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglas_cajero);

    }


    public void regresarMenuReglas(View view){
        Intent backr = new Intent(ReglasCajero.this,MenuCajero.class);
        startActivity(backr);
    }

}