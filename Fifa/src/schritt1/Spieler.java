package schritt1;

import Schritt3.Person;

public class Spieler extends Person {
    private int starke;
    private int torschuss;
    private int motivation;
    private int tore;

    public Spieler(String name,int alter,int starke,int torschuss,int motivation,int tore){
        super(name,alter);
        this.starke = starke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.tore = tore;
    }
    public int getStarke(){
        return starke;
    }
    public void setStarke(int starke){
        this.starke = starke;
    }

    public int getTorschuss(){
        return torschuss;
    }
    public void setTorschuss(int torschuss){
        this.torschuss = torschuss;
    }

    public int getMotivation(){
        return motivation;
    }
    public void setMotivation(int motivation){
        this.motivation = motivation;
    }

    public int getTore(){
        return tore;
    }
    public void setTore(int tore){
        this.tore = tore;
    }

    @Override
    public String toString(){
        String spieler = super.toString();
        spieler += "\n\tStärke:\t\t" + starke;
        spieler += "\n\tTorschuss:\t" + torschuss;
        spieler += "\n\tMotivation: " + motivation;
        spieler += "\n\tLebenslang Tore: " + tore;
        return spieler;
    }
}
