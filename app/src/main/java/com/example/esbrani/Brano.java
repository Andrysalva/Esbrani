package com.example.esbrani;

public class Brano {
    private String titolo;
    private String autore;
    private String durata;
    private String data;
    private String genere;

    public Brano(String titolo, String autore, String durata, String data, String genere) {
        this.titolo = titolo;
        this.autore = autore;
        this.durata = durata;
        this.data = data;
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Brano{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", durata='" + durata + '\'' +
                ", data='" + data + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
