package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SeguimientoCajero extends AppCompatActivity {

    ImageView btnBackSeguimientoHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguimiento_cajero);

        btnBackSeguimientoHome = findViewById(R.id.btnBackSeguimientoHome);

        btnBackSeguimientoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarMenuHistorico(v);
            }
        });
    }

    public void regresarMenuHistorico(View view){
        Intent back = new Intent(SeguimientoCajero.this,MenuCajero.class);
        startActivity(back);
    }
}