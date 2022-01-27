package Schritt4;

public class Spiel {
    private Mannschaft heim;
    private Mannschaft gast;
    private Ergebnis ergebnis;
    private StringBuilder spielbreicht;
    public Spiel(Mannschaft heim,Mannschaft gast){
        this.heim = heim;
        this.gast = gast;
    }

    public Mannschaft getHeim() {
        return heim;
    }

    public Mannschaft getGast() {
        return gast;
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielbreicht() {
        return spielbreicht;
    }

    @Override
    public String toString() {
        return "Spiel{" +
                "heim=" + heim +
                ", gast=" + gast +
                ", ergebnis=" + ergebnis +
                ", spielbreicht=" + spielbreicht +
                '}';
    }
}
