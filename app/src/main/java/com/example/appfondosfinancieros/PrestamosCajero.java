package com.example.appfondosfinancieros;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.appfondosfinancieros.domain.entities.Prestamos;
import com.example.appfondosfinancieros.domain.entities.Participant;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class PrestamosCajero extends AppCompatActivity {

    Button btnBackPrestamoHome, btnPrestar;
    EditText edtxtMontoaPrestar,edtxtAmountDues, edtxParticipantName, edtxParticipantDoc;
    ListView lvParticipantesPrestamo;

    private List<Participant> participantList = new ArrayList<>();
    ArrayAdapter<Participant> participantArrayAdapter;
    Participant participantSelected;

    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prestamos_cajero);

        btnBackPrestamoHome = findViewById(R.id.btnBackPrestamoHome);
        btnPrestar = findViewById(R.id.btnPrestar);
        edtxtMontoaPrestar = findViewById(R.id.edtxtMontoaPrestar);
        edtxtAmountDues = findViewById(R.id.edtxtAmountDues);
        edtxParticipantName = findViewById(R.id.edtxParticipantName);
        edtxParticipantDoc = findViewById(R.id.edtxParticipantDoc);
        lvParticipantesPrestamo = findViewById(R.id.lvParticipantesPrestamo);

        inicializarFirebase();
        listarDatos();

        lvParticipantesPrestamo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                participantSelected = (Participant) parent.getItemAtPosition(position);
                edtxParticipantName.setText(participantSelected.getName());;
                edtxParticipantDoc.setText(participantSelected.getDocument());
            }
        });

        btnBackPrestamoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarMenuPrestamos(v);
            }
        });
        btnPrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generarPrestamo(v);
            }
        });

    }

    public void regresarMenuPrestamos(View view){
        Intent backpr = new Intent(PrestamosCajero.this,MenuCajero.class);
        startActivity(backpr);
    }

    public void generarPrestamo(View view){

        String amountMoney = edtxtMontoaPrestar.getText().toString();
        String amountDues = edtxtAmountDues.getText().toString();
        String participantName = edtxParticipantName.getText().toString();
        String participantDoc = edtxParticipantDoc.getText().toString();

        if(amountMoney.isEmpty() || amountDues.isEmpty() || participantName.isEmpty() || participantDoc.isEmpty()){
            validacion();
        }else{
            Prestamos prestamos = new Prestamos(participantName,participantDoc,
                    Double.parseDouble(amountMoney),Double.parseDouble(amountDues));
            databaseReference.child("prestamo").child(prestamos.getDocumentParticipant()).setValue(prestamos);
            Toast.makeText(this, "Registro guardado exitosamente",
                    Toast.LENGTH_SHORT).show();
            limpiarCajas();
        }

    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        Toast.makeText(this, "Inicializando base de datos",
                Toast.LENGTH_SHORT).show();
    }

    private void listarDatos() {
        databaseReference.child("participant").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                participantList.clear();
                for (DataSnapshot objSnapshot : snapshot.getChildren()) {
                    Participant participant = objSnapshot.getValue(Participant.class);
                    participantList.add(participant);
                    participantArrayAdapter = new ArrayAdapter<Participant>(
                            PrestamosCajero.this, android.R.layout.simple_list_item_1,
                            participantList);
                    lvParticipantesPrestamo.setAdapter(participantArrayAdapter);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }

    public void validacion() {
        String amountMoney = edtxtMontoaPrestar.getText().toString();
        String amountDues = edtxtAmountDues.getText().toString();
        String participantName = edtxParticipantName.getText().toString();

        if (amountMoney.isEmpty()) {
            edtxtMontoaPrestar.setError("Requerido");
        } else if (amountDues.isEmpty()) {
            edtxtAmountDues.setError("Requerido");
        }else if(participantName.isEmpty()){
            edtxParticipantName.setError("Requerido");
        }else {
            edtxParticipantDoc.setError("Requerido");
        }

    }

    public void limpiarCajas() {
        edtxtMontoaPrestar.setText("");
        edtxtAmountDues.setText("");
        edtxParticipantName.setText("");
        edtxParticipantDoc.setText("");
    }

}