import java.util.ArrayList;

public class Gebaeude {
    private String name;
    private ArrayList<Etage> etageList;

    Gebaeude (String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Etage> getEtageList() {
        return etageList;
    }
    public int getAnzahlEtagen(){
        return getAnzahlEtagen();
    }
    public int getAnzahlZimmerFrei(){
        return getAnzahlZimmerFrei();
    }
    public int getAnzahlZimmer(){
        return getAnzahlZimmer();
    }
    public int getAnzahlGaeste(){
        return getAnzahlGaeste();
    }

    @Override
    public String toString() {
        return "Gebaeude{" +
                "name='" + name + '\'' +
                ", etageList=" + etageList +
                '}';
    }
}
