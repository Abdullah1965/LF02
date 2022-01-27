package Schritt4;

import Schritt2.Torwart;
import schritt1.Spieler;
import schritt1.Trainer;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;
    public Mannschaft(String name,Trainer trainer,Torwart torwart,ArrayList<Spieler> spielerListe) {
        this.name = name;
        this.spielerListe = spielerListe;
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

    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }
    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }

    public int getMotivation(){
       int motivationSumme = 0;
       int motivationdurchschnitt = 0;
       for (int i = 0;i < spielerListe.size(); i++){
           motivationdurchschnitt += spielerListe.get(i).getMotivation();
       }
       motivationSumme = motivationdurchschnitt / spielerListe.size();
       return motivationSumme;
    }
    public int getstarke(){
        int starkeSumme = 0;
        int motivationdurchschnitt = 0;
        for (int i = 0;i < spielerListe.size();i++){
            motivationdurchschnitt += spielerListe.get(i).getStarke();
        }
        starkeSumme = motivationdurchschnitt / spielerListe.size();
        return starkeSumme;
    }

    @Override
    public String toString(){
        String mannschaft = " ";
        mannschaft += "\nName: " + getName();
        mannschaft += "\nTrainar: \t" + getTrainer();
        mannschaft += "\nTorwart: " + getTorwart();
        mannschaft += "\nSpieler: ";
        for (int i = 0; i < spielerListe.size(); i++) {
            mannschaft += "\n" + spielerListe.get(i).toString();
        }
        mannschaft += "\nMotivation: " + getMotivation();
        mannschaft += "\nSträke: " + getstarke();
        return mannschaft;
    }
}
