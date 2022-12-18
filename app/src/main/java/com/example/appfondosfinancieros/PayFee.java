package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PayFee extends AppCompatActivity {

    Button btnPayFee, btnRegresarPayFeeHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_fee);

        btnPayFee = findViewById(R.id.btnPayFee);
        btnRegresarPayFeeHome = findViewById(R.id.btnRegresarPayFeeHome);

        btnRegresarPayFeeHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarToHome(v);
            }
        });
        btnPayFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                payFee(v);
            }
        });
    }

    public void payFee(View view){
        Toast.makeText(this,"Pago completo! ", Toast.LENGTH_LONG).show();
    }

    public void regresarToHome(View view){
        Intent homeParti = new Intent(PayFee.this,HomeParticipant.class);
        startActivity(homeParti);
    }
}