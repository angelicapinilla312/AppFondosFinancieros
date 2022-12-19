package com.example.appfondosfinancieros;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.appfondosfinancieros.domain.entities.Prestamos;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class SeguimientoCajero extends AppCompatActivity {

    Button btnBackSeguimientoHome;
    ListView lvPrestamos;
    private List<Prestamos> prestamosList = new ArrayList<>();
    ArrayAdapter<Prestamos> prestamosArrayAdapter;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguimiento_cajero);

        btnBackSeguimientoHome = findViewById(R.id.btnBackSeguimientoHome);
        lvPrestamos = findViewById(R.id.lvPrestamos);
        inicializarFirebase();
        listarDatos();

        btnBackSeguimientoHome.setOnClickListener(this::regresarMenuHistorico);
    }

    public void regresarMenuHistorico(View view){
        Intent backh = new Intent(SeguimientoCajero.this,MenuCajero.class);
        startActivity(backh);
    }
    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        Toast.makeText(this, "Inicializando base de datos",
                Toast.LENGTH_SHORT).show();
    }
    private void listarDatos() {
        databaseReference.child("prestamo").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                prestamosList.clear();
                for (DataSnapshot objSnapshot : snapshot.getChildren()) {
                    Prestamos prestamos = objSnapshot.getValue(Prestamos.class);
                    prestamosList.add(prestamos);
                    prestamosArrayAdapter = new ArrayAdapter<Prestamos>(
                            SeguimientoCajero.this, android.R.layout.simple_list_item_1,
                            prestamosList);
                    lvPrestamos.setAdapter(prestamosArrayAdapter);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
}