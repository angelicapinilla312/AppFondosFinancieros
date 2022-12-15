package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD
import android.widget.ImageButton;

public class ParticipantesCajero extends AppCompatActivity {

    ImageButton button;
=======
import android.widget.ImageView;

public class ParticipantesCajero extends AppCompatActivity {

    ImageView btnAgregarParticipante, btnEditarParticipante, btnBorrarParticipante, btnBackParticipantHome;
>>>>>>> data_and_backend

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantes_cajero);
<<<<<<< HEAD
        button = (ImageButton) findViewById(R.id.btnBackMenuCajeroParti);
=======

        btnAgregarParticipante = findViewById(R.id.btnAgregarParticipante);
        btnEditarParticipante = findViewById(R.id.btnEditarParticipante);
        btnBorrarParticipante = findViewById(R.id.btnBorrarParticipante);
        btnBackParticipantHome = findViewById(R.id.btnBackParticipantHome);

        btnBackParticipantHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarMenuParti(v);
            }
        });
    }
>>>>>>> data_and_backend

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                PartiToCajero(v); // Do something in response to button click
            }
        });
    }
    public void PartiToCajero(View view) {
        Intent backp = new Intent(ParticipantesCajero.this, MenuCajero.class);
        startActivity(backp);
    }
<<<<<<< HEAD
=======


>>>>>>> data_and_backend
}