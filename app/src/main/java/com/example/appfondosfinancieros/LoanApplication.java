package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoanApplication extends AppCompatActivity {

    Button btnSolicitarPrestamo, btnRegresarPrestamoToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_application);

        btnSolicitarPrestamo = findViewById(R.id.btnSolicitarPrestamo);
        btnRegresarPrestamoToHome = findViewById(R.id.btnRegresarPrestamoToHome);

        btnRegresarPrestamoToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarToHome(v);
            }
        });

        btnSolicitarPrestamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solicitarPrestamo(v);
            }
        });
    }

    public void solicitarPrestamo(View view){
        Toast.makeText(this,"Prestamo solicitado",Toast.LENGTH_LONG).show();
    }
    public void regresarToHome(View view){
        Intent homeParti = new Intent(LoanApplication.this,HomeParticipant.class);
        startActivity(homeParti);
    }
}