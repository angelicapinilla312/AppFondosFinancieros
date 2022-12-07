package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class iniciarSesionCajeroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion_cajero);
    }

    public void regresarInicio(View view){
        Intent back = new Intent(iniciarSesionCajeroActivity.this,MainActivity.class);
        startActivity(back);
    }
}