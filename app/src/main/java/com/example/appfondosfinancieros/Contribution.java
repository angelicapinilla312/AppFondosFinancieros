package com.example.appfondosfinancieros;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contribution extends AppCompatActivity {

    Button btnBackHomeParticipant, btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribution);

        btnPay = findViewById(R.id.btnPay);
        btnBackHomeParticipant = findViewById(R.id.btnBackHomeParticipant);

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                payContribution();
            }
        });

        btnBackHomeParticipant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToHomeParticipant();
            }
        });
    }

    public void payContribution(){
        Toast.makeText(this,"Pago realizado satisfactoriamente",Toast.LENGTH_LONG).show();
        Intent homeReturn = new Intent(Contribution.this,HomeParticipant.class);
        startActivity(homeReturn);
    }

    public void backToHomeParticipant(){
        Intent homeParticipant = new Intent(Contribution.this,HomeParticipant.class);
        startActivity(homeParticipant);
    }
}