package com.example.appfondosfinancieros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeParticipant extends AppCompatActivity {

    ImageView imgVwPayFee, imgVwLoanRequest, imgVwConfiguration, imgVwContribution;
    Button btnBackHomeParti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_participant);

        imgVwPayFee = findViewById(R.id.imgVwPayFee);
        imgVwLoanRequest = findViewById(R.id.imgVwLoanRequest);
        imgVwConfiguration = findViewById(R.id.imgVwConfiguration);
        imgVwContribution = findViewById(R.id.imgVwContribution);

        btnBackHomeParti = findViewById(R.id.btnBackHomeParti);

        imgVwPayFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPayFee();
            }
        });
        imgVwLoanRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLoanRequest();
            }
        });
        imgVwConfiguration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToConfiguration();
            }
        });
        imgVwContribution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToContribution();
            }
        });
    }
    public  void backTo(View view){
        Intent back = new Intent(HomeParticipant.this,iniciarSesionCajeroActivity.class);
        startActivity(back);
    }

    public void goToPayFee(){
        Intent payFee = new Intent(HomeParticipant.this,PayFee.class);
        startActivity(payFee);
    }
    public void goToLoanRequest(){
        Intent loanRequest = new Intent(HomeParticipant.this,LoanApplication.class);
        startActivity(loanRequest);
    }
    public void goToConfiguration(){
        Intent config = new Intent(HomeParticipant.this,Configuration.class);
        startActivity(config);
    }
    public void goToContribution(){
        Intent contribution = new Intent(HomeParticipant.this,Contribution.class);
        startActivity(contribution);
    }
}