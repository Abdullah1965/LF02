public class Banane extends Obst{
    private double kruemmung;
    public Banane() {
        super("Banane");
    }
    public double kruemmung() {
        return kruemmung;
    }
    public void setKruemmung(double kruemmung) {
        this.kruemmung = kruemmung;
    }

  //  public String toString(){
    //      String text = "";
    //      text += "\nName: \t" + getName();
    //      text += "\nFarbe: \t" + getFarbe();
    //     text += "\nGewicht: \t" + getGewicht();
    //     text += "\nReif: \t" + isReif();
    //     text += "\nKruemmung: \t" + kruemmung();
    //    return text;
//    }
}
