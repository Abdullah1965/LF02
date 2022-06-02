package businessObjects;

import java.util.ArrayList;

public class buecher {

    private String artikelNr;
    private String titel;
    private String autor;
    private String seitenAnzahl;
    private double preis;
    private ArrayList<String> beschreibung;
    private ArrayList<String> genre;

    public buecher(String artikelNr,String titel,double preis){
        this.artikelNr = artikelNr;
        this.titel = titel;
        this.preis = preis;
    }

    public String getArtikelNr() {
        return artikelNr;
    }
    public void setArtikelNr(String artikelNr) {
        this.artikelNr = artikelNr;
    }

    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSeitenAnzahl() {
        return seitenAnzahl;
    }
    public void setSeitenAnzahl(String seitenAnzahl) {
        this.seitenAnzahl = seitenAnzahl;
    }

    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }

    public ArrayList<String> getBeschreibung() {
        return beschreibung;
    }
    public ArrayList<String> getGenre() {
        return genre;
    }


    @Override
    public String toString(){
        String text = " ";
        text += "\n\t\tArtikelNr:" + artikelNr;
        text += "\n\t\tTitel:" + titel;
        text += "\n\t\tAutor:" + autor;
        text += "\n\t\tSeitenAnzahl:" + seitenAnzahl;
        text += "\n\t\tPreis:" + preis;
        text += "\n\t\tBeschreibung" + beschreibung;
        text += "\n\t\tGenre:" + genre;
        return text;
    }
}
