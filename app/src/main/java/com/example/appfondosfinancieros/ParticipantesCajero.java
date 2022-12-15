package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ParticipantesCajero extends AppCompatActivity {

    ImageView btnAgregarParticipante, btnEditarParticipante, btnBorrarParticipante, btnBackParticipantHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantes_cajero);

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

    public void regresarMenuParti(View view){
        Intent back = new Intent(ParticipantesCajero.this,MenuCajero.class);
        startActivity(back);
    }


}