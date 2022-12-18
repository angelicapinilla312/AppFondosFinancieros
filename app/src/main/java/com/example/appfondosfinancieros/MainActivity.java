package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIniciarCajero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciarCajero = findViewById(R.id.btnIniciarCajero);

        btnIniciarCajero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn(v);
            }
        });

    }

    public void signIn(View view){
        Intent signInActivity = new Intent(MainActivity.this,iniciarSesionCajeroActivity.class);
        startActivity(signInActivity);
    }
}