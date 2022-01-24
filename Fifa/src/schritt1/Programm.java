package schritt1;

import Schritt2.Torwart;

public class Programm {
    public static void main(String[] args) {
        Spieler cristiano = new Spieler("cristiano ronaldo",36,10,10,10,801);
        Trainer zidane = new Trainer("Zinedine Zidane",49,10);
        Torwart yunus = new Torwart("Yunus",20,10,10,10);
        System.out.println("Zahlen von 1 (unerfahren) bis 10 (Beste)");
        System.out.println(cristiano);
        System.out.println(zidane);
        System.out.println(yunus);
        System.out.println();
    }
}
