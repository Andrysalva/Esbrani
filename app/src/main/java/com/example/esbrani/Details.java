package com.example.esbrani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent i = getIntent();
        info=findViewById(R.id.info_text);
        info.setText("Titolo: " + i.getStringExtra("title")+"\n"+"Autore: " + i.getStringExtra("author")+"\n"+"Genere: " + i.getStringExtra("genre")+"\n"+"durata: " +i.getStringExtra("duration")+"\n"+"Data: " + i.getStringExtra("date"));



    }
}