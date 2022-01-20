package schritt1;

import Schritt3.Person;

public class Trainer extends Person {
    private int erfahrung;

    public Trainer(String name, int alter, int erfahrung){
        super(name,alter);
        this.erfahrung = erfahrung;
    }

    public int getErfahrung(){
        return erfahrung;
    }
    public void setErfahrung(int erfahrung){
        this.erfahrung = erfahrung;
    }
    @Override
    public String toString(){
        String tainer = super.toString();
        tainer += "\n\tErfahrung:\t" + erfahrung;
        return tainer;
    }

}
