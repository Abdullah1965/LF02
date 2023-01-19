import java.util.ArrayList;

public class Hotelanlage {
    private String name;
    private Adresse adresse;
    private ArrayList<Gebaeude> gebaeudeList;

    Hotelanlage (String name,Adresse adresse){
        this.adresse=adresse;
        this.name=name;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Adresse getAdresse() {
        return adresse;
    }
    public ArrayList<Gebaeude> getGebaeudeList() {
        return gebaeudeList;

    }
    public int getAnzahlGebaeude(){
        int anzahl = 0;
        for (Gebaeude gebaeude : gebaeudeList{
            anzahl +=
        }
    }
    public int getAnzahlZimmer(){
        return getAnzahlZimmer();
    }
    public int getAnzahlZimmerFrei(){
        return getAnzahlZimmerFrei();
    }
    public int getAnzahlGaeste(){
        return getAnzahlGaeste();
    }


    @Override
    public String toString() {
        return "Hotelanlage{" +
                "name='" + name + '\'' +
                ", adresse=" + adresse +
                ", gebaeudeList=" + gebaeudeList +
                '}';
    }
}
