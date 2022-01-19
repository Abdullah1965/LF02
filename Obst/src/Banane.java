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
    public String toString(){
        String text = super.toString();
        text += "\nKruemmung: " + kruemmung();
        return text;
    }
}
