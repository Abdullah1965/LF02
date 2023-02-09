package businessObjects;

public class Gast extends Person {
    private Adresse adresse;
    private int Nr;

    public Gast(int Nr,String vorname, String nachname, Adresse adresse) {
        super(vorname, nachname);
        this.Nr = Nr;
        this.adresse = adresse;
    }

    public int getNr() {
        return Nr;
    }

    public void setNr(int nr) {
        Nr = nr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        String t = " ";
        t += "\nNr: " + Nr;
        t += "\nVorname: " + getVorname();
        t += "\nNachname: " + getNachname();
        t += "\nAdresse: " + adresse;
        return t;
    }
}
