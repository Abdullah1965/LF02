import java.util.ArrayList;

public class Regal {
    private Lagerhalle lagerhalle;
    private ArrayList<Behaelter> BehaelterListe;


    public Regal(Lagerhalle lagerhalle){
        this.lagerhalle = lagerhalle;
    }

    public Lagerhalle getLagerhalle() {
        return lagerhalle;
    }
    public void addBehaelter(Behaelter behaelter) {
        BehaelterListe.add(behaelter);
    }
    public void romoveBehaelter(Behaelter behaelter) {
        BehaelterListe.remove(behaelter);
    }

    public ArrayList<Behaelter> getBehaelterListe() {
        return BehaelterListe;
    }

    public int getAnzahlBehaelter(){
        int wert = BehaelterListe.size();
        return wert;
    }
    public double getGewichtGesamt() {
        double x = 0;
        for ( Behaelter b : BehaelterListe ){
            x += b.getGewichtbehaelter();
            x += b.getGewichtInhalt();
        }
        return x;
    }

}
