package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class InputCode extends AppCompatActivity {

    ImageView imgVwOkayCode;
    EditText edtxCode;

    final String CODE = "xdrs-2231-rtf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_code);

        imgVwOkayCode = findViewById(R.id.imgVwCodeOkay);
        edtxCode = findViewById(R.id.edtxCode);

        imgVwOkayCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarCodigo();
            }
        });
    }

    public void validarCodigo(){
        if(edtxCode.getText().toString() == CODE){
            Intent welcomeParticipants = new Intent(InputCode.this,WelcomeParticipants.class);
            startActivity(welcomeParticipants);
        }
    }
}