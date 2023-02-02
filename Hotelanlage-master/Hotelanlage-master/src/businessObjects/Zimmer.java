package businessObjects;

import java.util.ArrayList;

public class Zimmer {
    private int nr;
    private ArrayList<Gast> gastListe;

    public Zimmer(int nr) {
        this.nr = nr;
        gastListe = new ArrayList<>();
    }

    public int getNr() {
        return nr;
    }

    public ArrayList<Gast> getGastListe() {
        return gastListe;
    }

    public int getAnzahlGaeste() {
        return gastListe.size();

    }

    public void checkIn(Gast gast) throws GastAlreadyCheckedInException {
        if (this.gastListe.contains(gast)) {
            throw new GastAlreadyCheckedInException(gast);
        }
        gastListe.add(gast);
    }
//Exception andere noch machen
    public void checkOut(Gast gast) throws GastNotCheckInException {
        if (this.gastListe.contains(gast)) {
            gastListe.remove(gast);
        } else throw new GastNotCheckInException(gast);


    }
}
