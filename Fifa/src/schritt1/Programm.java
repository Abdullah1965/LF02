package schritt1;

import Schritt2.Torwart;
import Schritt4.Mannschaft;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {

        //Team 1
        Trainer zidane = new Trainer("Zinedine Zidane",49,10);
        Torwart yunus = new Torwart("Yunus",20,10,10,10);
        Spieler aron = new Spieler("Aron",20,7,8,10,8);
        Spieler cristiano = new Spieler("cristiano ronaldo",36,10,10,10,801);

        ArrayList<Spieler> bestteam = new ArrayList<>();
        bestteam.add(aron);
        bestteam.add(cristiano);


        Mannschaft bestTeam = new Mannschaft("Bestteam",zidane,yunus,bestteam);

        //Team 2
        Trainer abdoul = new Trainer("Abdoul",40,10);
        Torwart mohammad = new Torwart("Mohammad",30,10,7,8);
        Spieler barry = new Spieler("Barry",25,7,10,10,50);
        Spieler hex = new Spieler("Hex",21,10,6,9,10);

        ArrayList<Spieler> gutteam = new ArrayList<>();
        gutteam.add(barry);
        gutteam.add(hex);

        Mannschaft gutTeam = new Mannschaft("Gutteam",abdoul,mohammad,gutteam);

        System.out.println(bestTeam);
        System.out.println(gutTeam);

    }
}
