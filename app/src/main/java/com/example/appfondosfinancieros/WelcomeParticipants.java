package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeParticipants extends AppCompatActivity {

    Button btnWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_participants);

        btnWelcome = findViewById(R.id.btnWelcome);

        btnWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }
        });
    }
    public void goToHome(){
        Intent home = new Intent(WelcomeParticipants.this,HomeParticipant.class);
        startActivity(home);
    }
}
