package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuCajero extends AppCompatActivity {

    ImageView btnBackToHome, btnParticipantes, btnPrestamos, btnReglas, btnSeguimiento;
    TextView txtVwAdminNickName, txtVwBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cajero);

        btnBackToHome = findViewById(R.id.btnBackToHome);
        btnParticipantes = findViewById(R.id.btnParticipantes);
        btnPrestamos = findViewById(R.id.btnPrestamos);
        btnReglas = findViewById(R.id.btnReglas);
        btnSeguimiento = findViewById(R.id.btnSeguimiento);

        txtVwAdminNickName = findViewById(R.id.txtVwAdminName);
        txtVwBalance = findViewById(R.id.txtVwBalance);


        btnBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToHome(v);
            }
        });
        btnParticipantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeToParti(v);
            }
        });
        btnPrestamos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeToPrestamo(v);
            }
        });
        btnReglas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeToReglas(v);
            }
        });
        btnSeguimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeToSeguimiento(v);
            }
        });

    }

    public void backToHome(View view){
        Intent home = new Intent(MenuCajero.this,MainActivity.class);
        startActivity(home);
    }

    public void homeToParti(View view){
        Intent home = new Intent(MenuCajero.this,ParticipantesCajero.class);
        startActivity(home);
    }

    public void homeToPrestamo(View view){
        Intent home = new Intent(MenuCajero.this,PrestamosCajero.class);
        startActivity(home);
    }

    public void homeToReglas(View view){
        Intent home = new Intent(MenuCajero.this,ReglasCajero.class);
        startActivity(home);
    }

    public void homeToSeguimiento(View view){
        Intent home = new Intent(MenuCajero.this,SeguimientoCajero.class);
        startActivity(home);
    }
}
