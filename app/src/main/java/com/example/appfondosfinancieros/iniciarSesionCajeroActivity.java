package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class iniciarSesionCajeroActivity extends AppCompatActivity {

    Button btnLogin, btnBack;
    EditText edtxEmail, edtxPassword;
    final String  adminEmailOrNickName = "juan.castellanosj";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion_cajero);
        btnLogin = findViewById(R.id.btnLogin);
        btnBack = findViewById(R.id.btnBack);
        edtxEmail = findViewById(R.id.edtxEmailOrNickN);
        edtxPassword = findViewById(R.id.edtxPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarIngreso(v);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarInicio(v);
            }
        });

    }
    public void validarIngreso(View view){
        String email = edtxEmail.getText().toString();
        if(email.equals(adminEmailOrNickName)) {
        Intent homeAdmin = new Intent(iniciarSesionCajeroActivity.this,MenuCajero.class);
        startActivity(homeAdmin);
        }else{
            Intent inputCode = new Intent(iniciarSesionCajeroActivity.this,InputCode.class);
            startActivity(inputCode);

        }
    }

    public void regresarInicio(View view){
        Intent back = new Intent(iniciarSesionCajeroActivity.this,MainActivity.class);
        startActivity(back);
    }
}