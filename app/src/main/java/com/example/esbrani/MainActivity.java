package com.example.esbrani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner genere;
    EditText data;
    EditText durata;
    EditText autore;
    EditText titolo;
    Button salva;
    Button visualizza;
    String generi[]={"Metal","Rock","K_Pop","Indie","Rap","Pop","Trap"};
    GestoreBrani gb;
    String stringa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        salva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano(titolo.getEditableText().toString(),autore.getEditableText().toString(),durata.getEditableText().toString(),data.getEditableText().toString(),genere.getSelectedItem().toString());
                Log.d("salva","entrato");
            }
        });
        visualizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Details.class);
                stringa = gb.listSongs().toString();
                Log.d("visualizza","entrato");
                i.putExtra("stringa",stringa);
                startActivity(i);
            }
        });
    }

    private void Init(){
        genere = (Spinner) findViewById(R.id.genere);
        durata = (EditText) findViewById(R.id.durata);
        data = (EditText) findViewById(R.id.data);
        autore = (EditText) findViewById(R.id.autore);
        titolo = (EditText) findViewById(R.id.titolo);
        salva  = (Button) findViewById(R.id.salva);
        visualizza = (Button) findViewById(R.id.visualizza);
        ArrayAdapter<String> adapterSongs=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, generi);
        genere.setAdapter(adapterSongs);
        gb = new GestoreBrani();
    }
}