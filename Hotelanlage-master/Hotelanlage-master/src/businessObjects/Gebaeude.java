package businessObjects;

import java.util.ArrayList;

public class Gebaeude {
    private String name;
    private ArrayList<Etage> etagenListe;

    public Gebaeude(String name) {
        this.name = name;
        etagenListe = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Etage> getEtagenListe() {
        return etagenListe;
    }

    public int getAnzahlEtagen() {
        return etagenListe.size();
    }

    public int getAnzahlZimmer() {
        int anzahlZimmer = 0;
        for (Etage e : etagenListe) {
            anzahlZimmer += e.getAnzahlZimmer();
        }
        return anzahlZimmer;
    }

    public int getAnzahlZimmerFrei() {
        int zimmerFrei = 0;
        for (Etage e : etagenListe) {
            zimmerFrei += e.getAnzahlZimmerFrei();

        }

        return zimmerFrei;
    }

    public int getAnzahlGaeste() {
        int anzahlGaeste = 0;
        for (Etage e : etagenListe) {
            anzahlGaeste += e.getAnzahlGaeste();
        }
        return anzahlGaeste;
    }

    @Override
    public String toString() {
        String text = "\n\tGebäude: " + getName();
        for (Etage e : etagenListe) {
            text += e.toString();
        }
        text += "\n\t\tgesamt: Zimmer: " + getAnzahlZimmer();
        text += " ,Zimmer frei: " + getAnzahlZimmerFrei();
        text += " ,Gäste: " + getAnzahlGaeste();

        return text;
    }
}
