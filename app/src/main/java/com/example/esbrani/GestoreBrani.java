package com.example.esbrani;

import java.util.ArrayList;

public class GestoreBrani {

    ArrayList<Brano> listaBrani;

    public GestoreBrani() {
        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(String titolo,String autore,String durata, String data,String genere){
        Brano b = new Brano(titolo,autore,durata,data,genere);
        listaBrani.add(b);
    }

    public String listSongs(){
        StringBuilder sb = new StringBuilder();

        for (Brano b : listaBrani){
            sb.append(b.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
