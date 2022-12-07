package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarSesionCajero(View view){
        Intent inisesCajero = new Intent(MainActivity.this,iniciarSesionCajeroActivity.class);
        startActivity(inisesCajero);
    }

}