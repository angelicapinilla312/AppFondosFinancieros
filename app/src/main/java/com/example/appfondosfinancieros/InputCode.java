package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputCode extends AppCompatActivity {

    ;
    Button btnOkayCode, btnBackToLogin;
    EditText edtxCode;

    final String CODE = "0000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_code);


        btnOkayCode = findViewById(R.id.btnOkayCode);
        btnBackToLogin = findViewById(R.id.btnBackToLogin);
        edtxCode = findViewById(R.id.edtxCode);

        btnOkayCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateCode(v);
            }
        });

        btnBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backLogin(v);
            }
        });

    }

    public void validateCode(View view){
        if(edtxCode.getText().toString().equals(CODE)){
            Intent welcomeParticipants = new Intent(InputCode.this,WelcomeParticipants.class);
            startActivity(welcomeParticipants);
        }
    }

    public void backLogin(View view){
        Intent backLogin = new Intent(InputCode.this,iniciarSesionCajeroActivity.class);
        startActivity(backLogin);
    }
}