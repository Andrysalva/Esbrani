package com.example.esbrani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner genere;
    EditText data;
    EditText durata;
    EditText autore;
    EditText titolo;
    Button salva;
    Button carica;
    String generi[]={"Metal","Rock","K_Pop","Indie","Rap","Pop","Trap"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genere = (Spinner) findViewById(R.id.genere);
        durata = (EditText) findViewById(R.id.durata);
        data = (EditText) findViewById(R.id.data);
        autore = (EditText) findViewById(R.id.autore);
        titolo = (EditText) findViewById(R.id.titolo);
        salva  = (Button) findViewById(R.id.salva);
        carica = (Button) findViewById(R.id.carica);
        ArrayAdapter<String> adapterSongs=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, generi);
        genere.setAdapter(adapterSongs);
        carica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Details.class);
                i.putExtra("title",titolo.getEditableText().toString());
                i.putExtra("author",autore.getEditableText().toString());
                i.putExtra("duration",durata.getEditableText().toString());
                i.putExtra("date", data.getEditableText().toString());
                i.putExtra("genre",genere.getSelectedItem().toString());
                startActivity(i);
            }
        });
    }
}