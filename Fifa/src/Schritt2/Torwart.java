package Schritt2;

import schritt1.Spieler;

public class Torwart extends Spieler {
    private int reaktion;

    public Torwart(String name, int alter, int starke, int motivation, int reaktion) {
        super(name, alter, starke, 0, motivation, 0);
        this.reaktion = reaktion;
    }

    public int getReaktion() {
        return reaktion;
    }

    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }

    public String toString() {
        String towwart = super.toString();
        towwart += "\n\tReaktion:\t" + reaktion;
        return towwart;
    }

}
