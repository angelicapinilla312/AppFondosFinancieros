package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuCajero extends AppCompatActivity {

    Button btnBackToHome;
    TextView txtVwAdminNickName, txtVwBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cajero);

        btnBackToHome = findViewById(R.id.btnBackHome);
        txtVwAdminNickName = findViewById(R.id.txtVwAdminName);
        txtVwBalance = findViewById(R.id.txtVwBalance);
        String name = String.valueOf(getIntent().getExtras().getString("AdminName"));
        txtVwAdminNickName.setText(name);


        btnBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToHome(v);
            }
        });

    }

    public void backToHome(View view){
        Intent home = new Intent(MenuCajero.this,MainActivity.class);
        startActivity(home);
    }
}
