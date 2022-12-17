package com.example.appfondosfinancieros;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.appfondosfinancieros.domain.entities.Participant;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ParticipantesCajero extends AppCompatActivity {

    ImageView btnBackParticipantHome;
    EditText edtxDocument, edtxName,edtxLastName, edtxPhoneNumber,edtxAddress;
    ListView listViewParticipants;

    private List<Participant> participantList = new ArrayList<>();
    ArrayAdapter<Participant> participantArrayAdapter;
    Participant participantSelected;

    // Clases para firebase
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantes_cajero);

        btnBackParticipantHome = findViewById(R.id.btnBackParticipantHome);
        edtxDocument = findViewById(R.id.edtxDocument);
        edtxName = findViewById(R.id.edtxName);
        edtxLastName = findViewById(R.id.edtxLastName);
        edtxPhoneNumber = findViewById(R.id.edtxPhoneNumber);
        edtxAddress = findViewById(R.id.edtxAddress);

        listViewParticipants = findViewById(R.id.listViewParticipants);

        inicializarFirebase();
        listarDatos();

        btnBackParticipantHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarMenuParti(v);
            }
        });
        listViewParticipants.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                participantSelected = (Participant) parent.getItemAtPosition(position);
                edtxDocument.setText(participantSelected.getDocument());
                edtxName.setText(participantSelected.getName());
                edtxLastName.setText(participantSelected.getLastName());
                edtxAddress.setText(participantSelected.getAddress());
                edtxPhoneNumber.setText(participantSelected.getPhoneNumber());
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_participante, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String documento = edtxDocument.getText().toString();
        String nombre = edtxName.getText().toString();
        String apellido = edtxLastName.getText().toString();
        String direccion = edtxAddress.getText().toString();
        String telefono = edtxPhoneNumber.getText().toString();

        switch (item.getItemId()) {
            case R.id.btnAgregarParticipante:
                if (documento.isEmpty()||nombre.isEmpty()||
                        apellido.isEmpty()||direccion.isEmpty()||telefono.isEmpty()){
                    validacion();
                }
                else {
                    Participant participant= new Participant();
                    participant.setName(nombre);
                    participant.setDocument(documento);
                    participant.setLastName(apellido);
                    participant.setAddress(direccion);
                    participant.setPhoneNumber(telefono);
                    databaseReference.child("participant").child(participant.getDocument()).setValue(participant);
                    Toast.makeText(this, "Registro guardado exitosamente",
                            Toast.LENGTH_SHORT).show();
                    limpiarCajas();
                    break;
                }

            case R.id.btnEditarParticipante:
                Participant participant = new Participant();
                participant.setDocument(participantSelected.getDocument());
                participant.setName(edtxName.getText().toString().trim());
                participant.setLastName(edtxLastName.getText().toString().trim());
                participant.setAddress(edtxAddress.getText().toString().trim());
                participant.setPhoneNumber(edtxPhoneNumber.getText().toString().trim());
                databaseReference.child("participant").child(participant.getDocument()).setValue(participant);
                Toast.makeText(this, "Registro actualizado exitosamente",
                        Toast.LENGTH_SHORT).show();
                limpiarCajas();
                break;

            case R.id.btnBorrarParticipante:
                participant = new Participant();
                participant.setDocument(participantSelected.getDocument());
                databaseReference.child("participant").child(participant.getDocument()).removeValue();
                Toast.makeText(this, "Registro eliminado exitosamente",
                        Toast.LENGTH_SHORT).show();
                limpiarCajas();
                break;
            default:
                break;
        }
        return true;
    }

    private void inicializarFirebase(){
        FirebaseApp.initializeApp(this);
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference= firebaseDatabase.getReference();
        Toast.makeText(this, "Inicializando base de datos",
                Toast.LENGTH_SHORT).show();
    }
    public void limpiarCajas(){
        edtxDocument.setText("");
        edtxName.setText("");
        edtxLastName.setText("");
        edtxPhoneNumber.setText("");
        edtxAddress.setText("");
    }
    public void validacion(){
        String documento= edtxDocument.getText().toString();
        String nombre= edtxName.getText().toString();
        String apellido= edtxLastName.getText().toString();
        String direccion= edtxAddress.getText().toString();
        String telefono= edtxPhoneNumber.getText().toString();

        if (documento.isEmpty()){
            edtxDocument.setError("requerido");
        }
        else if (nombre.isEmpty()){
            edtxName.setError("requerido");
        }
        else if (apellido.isEmpty()){
            edtxLastName.setError("requerido");
        }
        else if (direccion.isEmpty()){
            edtxAddress.setError("requerido");
        }
        else  {
            edtxPhoneNumber.setText("requerido");
        }
    }

    public void regresarMenuParti(View view) {
        Intent backp = new Intent(ParticipantesCajero.this, MenuCajero.class);
        startActivity(backp);
    }

    private void listarDatos(){
        databaseReference.child("participant").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                participantList.clear();
                for(DataSnapshot objSnapshot: snapshot.getChildren()){
                    Participant participant= objSnapshot.getValue(Participant.class);
                    participantList.add(participant);
                    participantArrayAdapter= new ArrayAdapter<Participant>(
                            ParticipantesCajero.this,android.R.layout.simple_list_item_1,
                            participantList);
                    listViewParticipants.setAdapter(participantArrayAdapter);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {}
        });
    }

}