package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MenuCajero extends AppCompatActivity {

    TextView txtVwAdminNickName, txtVwBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cajero);

        txtVwAdminNickName = findViewById(R.id.txtVwAdminName);
        txtVwBalance = findViewById(R.id.txtVwBalance);
        String name = String.valueOf(getIntent().getExtras().getString("AdminName"));
        txtVwAdminNickName.setText(name);
    }


    public void backToHome(View view){
        Intent inisesCajeroa = new Intent(MenuCajero.this,iniciarSesionCajeroActivity.class);
        startActivity(inisesCajeroa);
    }

    public void HomeToParti(View view){
        Intent inisesCajerob = new Intent(MenuCajero.this,ParticipantesCajero.class);
        startActivity(inisesCajerob);
    }

    public void HomeToReglas(View view){
        Intent inisesCajeroc = new Intent(MenuCajero.this,ReglasCajero.class);
        startActivity(inisesCajeroc);
    }

    public void HomeToPrestamo(View view){
        Intent inisesCajerod = new Intent(MenuCajero.this,PrestamosCajero.class);
        startActivity(inisesCajerod);
    }

    public void HomeToSeguimiento(View view){
        Intent inisesCajeroe = new Intent(MenuCajero.this,SeguimientoCajero.class);
        startActivity(inisesCajeroe);
    }
}
