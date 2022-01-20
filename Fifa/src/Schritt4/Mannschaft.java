package Schritt4;

import Schritt2.Torwart;
import schritt1.Spieler;
import schritt1.Trainer;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    public Mannschaft(String name,Trainer trainer,Torwart torwart) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }
    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }
    private ArrayList<Spieler> spielerListe;
    public double getMotivation(){
        double mittlerwert;
        for (Spieler spieler:spielerListe){
            System.out.println(spieler);
        }
        mittlerwert = spieler / spielerListe;
        return mittlerwert;
    }
}
