package Schritt4;

public class Ergebnis {
    private int toreHeim;
    private int toreGast;

    public int getToreHeim() {
        return toreHeim;
    }

    public int getToreGast() {
        return toreGast;
    }
    @Override
    public String toString() {
        return "Ergebnis{" +
                "toreHeim=" + toreHeim +
                ", toreGast=" + toreGast +
                '}';
    }
}
