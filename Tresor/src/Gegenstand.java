public abstract class Gegenstand {
    private int Id;
    private double Wert;

    public Gegenstand(int id,double wert){
        this.Id = id;
        this.Wert = wert;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public double getWert() {
        return Wert;
    }
    public void setWert(double wert) {
        Wert = wert;
    }

    @Override
    public String toString() {
        String i = " ";
        i += "ID: " + getId();
        i += "Wert: " + getWert();
        return i;
    }
}
