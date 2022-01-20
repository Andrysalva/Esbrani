package com.example.esbrani;

import java.util.ArrayList;

public class GestoreBrani {

    ArrayList<Brano> listaBrani = new ArrayList<>();

    public GestoreBrani(ArrayList<Brano> listaBrani) {
        this.listaBrani = listaBrani;
    }

    public void addBrano(Brano b){
        listaBrani.add(b);
    }
}
