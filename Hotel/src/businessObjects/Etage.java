package businessObjects;

import java.util.ArrayList;

public class Etage {
    private String name;
    private ArrayList<Zimmer>zimmerListe;

    public Etage(String name) {
        this.name = name;
        zimmerListe = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Zimmer> getZimmerListe() {
        return zimmerListe;
    }

    public int getAnzahlZimmer() {
        return zimmerListe.size();
    }

    public int getAnzahlZimmerFrei() {
        int zimmerFrei = 0;
        for (Zimmer z : zimmerListe) {
            if (z.getGastListe().isEmpty()) {
                zimmerFrei++;
            }
        }
        return zimmerFrei;
    }

    public int getAnzahlGaeste() {
        int anzahlGaeste = 0;
        for (Zimmer z : zimmerListe) {
            anzahlGaeste += z.getAnzahlGaeste();

        }
        return anzahlGaeste;
    }

    @Override
    public String toString() {
        return "\n\t\tEtage: " + getName() +
                " ,Zimmer: " + getAnzahlZimmer() +
                " ,Zimmer frei: " + getAnzahlZimmerFrei() +
                " ,Gäste: " + getAnzahlGaeste();
    }
}
