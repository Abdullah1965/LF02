package businessObjects;

import java.util.ArrayList;

public class Hotelanlage {
    private String name;
    private Adresse adresse;
    private ArrayList<Gebaeude> gebaeudeList;

    public Hotelanlage(String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
        gebaeudeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public ArrayList<Gebaeude> getGebaeudeList() {
        return gebaeudeList;
    }

    public int getAnzahlGebaeude() {
        return gebaeudeList.size();
    }

    public int getAnzahlZimmer() {
        int anzahlZimmer = 0;
        for (Gebaeude g : gebaeudeList) {
            anzahlZimmer += g.getAnzahlZimmer();
        }
        return anzahlZimmer;
    }

    public int getAnzahlZimmerFrei() {
        int zimmerFrei = 0;
        for (Gebaeude g : gebaeudeList) {
            zimmerFrei += g.getAnzahlZimmerFrei();
        }
        return zimmerFrei;
    }

    public int getAnzahlGaeste() {
        int anzahlGaeste = 0;
        for (Gebaeude g : gebaeudeList) {
            anzahlGaeste += g.getAnzahlGaeste();
        }

        return anzahlGaeste;
    }

    @Override
    public String toString() {
        String text = "Hotelanlage: " + getName();
        text += "\n\tAdresse: " + getAdresse();
        for (Gebaeude g: gebaeudeList) {
            text += g.toString();
        }

        text += "\n\tgesamt: Zimmer: " + getAnzahlZimmer();
        text += " ,Zimmer frei: " + getAnzahlZimmerFrei();
        text += " ,Gäste: " + getAnzahlGaeste();

        return text;
    }
}
