package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SeguimientoCajero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguimiento_cajero);
    }

    public void regresarMenuHistorico(View view){
        Intent backh = new Intent(SeguimientoCajero.this,MenuCajero.class);
        startActivity(backh);
    }
}