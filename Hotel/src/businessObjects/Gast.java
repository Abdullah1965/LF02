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
}
