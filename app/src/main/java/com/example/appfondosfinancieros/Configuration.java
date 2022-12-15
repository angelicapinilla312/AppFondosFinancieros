package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Configuration extends AppCompatActivity {

    Button btnGuardarConfig, btnRegresarConfigHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        btnGuardarConfig = findViewById(R.id.btnGuardarConfig);
        btnRegresarConfigHome = findViewById(R.id.btnRegresarConfigHome);

        btnRegresarConfigHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarToHome(v);
            }
        });
        btnGuardarConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarConfig(v);
            }
        });
    }
    public void guardarConfig(View view){
        Toast.makeText(this,"Configuration guardada",Toast.LENGTH_LONG).show();
    }

    public void regresarToHome(View view){
        Intent homeParticipant = new Intent(Configuration.this,HomeParticipant.class);
        startActivity(homeParticipant);
    }
}