package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ParticipantesCajero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantes_cajero);
    }

    public void regresarMenuParti(View view){
        Intent back = new Intent(ParticipantesCajero.this,MenuCajero.class);
        startActivity(back);
    }

}