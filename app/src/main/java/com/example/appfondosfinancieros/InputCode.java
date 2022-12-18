package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class InputCode extends AppCompatActivity {

    ImageView imgVwOkayCode, btnBackInCodeLogin;
    EditText edtxCode;

    final String CODE = "0000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_code);

        imgVwOkayCode = findViewById(R.id.imgVwCodeOkay);
        btnBackInCodeLogin = findViewById(R.id.btnBackInCodeLogin);
        edtxCode = findViewById(R.id.edtxCode);

        imgVwOkayCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarCodigo();
            }
        });

        btnBackInCodeLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backLogin(v);
            }
        });

    }

    public void validarCodigo(){
        if(edtxCode.getText().toString().equals(CODE)){
            Intent welcomeParticipants = new Intent(InputCode.this,WelcomeParticipants.class);
            startActivity(welcomeParticipants);
        }
    }

    public void backLogin(View view){
        Intent intent = new Intent(InputCode.this,iniciarSesionCajeroActivity.class);
        startActivity(intent);
    }
}