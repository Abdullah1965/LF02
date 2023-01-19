import java.util.ArrayList;

public class Etage {
    private String name;
    private ArrayList<Zimmer> zimmerList;

    public Etage (String name){
        this.name=name;
    }

    public ArrayList<Zimmer> getZimmerList() {
        return zimmerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAnzahlZimmerFrei(){
        int anazhl = 0;
        for (Zimmer zimmer : zimmerList){
            if (zimmer.getAnzahlGaeste()){
                anazhl += getAnzahlZimmerFrei();
            }
        }
    }
    public int getAnzahlZimmer(){
        return getAnzahlZimmer();
    }
    public int getAnzahlGaeste(){
        return getAnzahlGaeste();
    }

    @Override
    public String toString() {
        return "Etage{" +
                "name='" + name + '\'' +
                ", zimmerList=" + zimmerList +
                '}';
    }
}

