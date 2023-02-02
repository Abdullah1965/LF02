package businessObjects;

public class Gast extends Person {
    private Adresse adresse;

    public Gast(String vorname, String nachname, Adresse adresse) {
        super(vorname, nachname);
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return adresse;
    }
}
