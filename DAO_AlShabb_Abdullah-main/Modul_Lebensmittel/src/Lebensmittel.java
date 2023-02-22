import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lebensmittel {
    private int ID;
    private String Name;
    private double Gewicht;
    private double Preis;
    private ArrayList<String> Nuesse;
    private ArrayList<String> Milch;


    public Lebensmittel(int id,String name,double preis){
        this.ID = id;
        this.Name = name;
        this.Preis = preis;
        Nuesse = new ArrayList<>();
        Milch = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public double getGewicht() {
        return Gewicht;
    }
    public void setGewicht(double gewicht) {
        Gewicht = gewicht;
    }

    public double getPreis() {
        return Preis;
    }
    public void setPreis(double preis) {
        Preis = preis;
    }

    public ArrayList<String> getNuesse() {
        return Nuesse;
    }

    public ArrayList<String> getMilch() {
        return Milch;
    }

    @Override
    public String toString(){
        String text = " ";
        text += "\n\t\t\tID" + ID;
        text += "\n\t\t\tName" + Name;
        text += "\n\t\t\tGewicht" + Gewicht;
        text += "\n\t\t\tPreis" + Preis;
        text += "\n\t\t\tNuesse" + Nuesse;
        text += "\n\t\t\tMilch" + Milch;
        return text;
    }




}
