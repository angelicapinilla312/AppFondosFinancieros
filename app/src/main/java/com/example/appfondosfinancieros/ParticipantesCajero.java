package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ParticipantesCajero extends AppCompatActivity {

    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantes_cajero);
        button = (ImageButton) findViewById(R.id.btnBackMenuCajeroParti);

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
}