public class Aktie extends Gegenstand{
    private String Unternehmen;
    private double nennwert;

    public Aktie(int id, double wert,String unternehmen,double nennwert) {
        super(id, wert);
        this.Unternehmen = unternehmen;
        this.nennwert = nennwert;
    }

    public String getUnternehmen() {
        return Unternehmen;
    }
    public void setUnternehmen(String unternehmen) {
        Unternehmen = unternehmen;
    }

    public double getNennwert() {
        return nennwert;
    }
    public void setNennwert(double nennwert) {
        this.nennwert = nennwert;
    }

    @Override
    public String toString() {
        String i = super.toString();
        i += "Unternehmen: " + getUnternehmen();
        i += "Nennwert: " + getNennwert();
        return i;
    }
}
