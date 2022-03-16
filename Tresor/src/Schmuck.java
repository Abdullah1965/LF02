public class Schmuck extends Gegenstand {
    private String Beszeichung;
    public Schmuck(int id, double wert,String beszeichung) {
        super(id, wert);
        this.Beszeichung = beszeichung;
    }

    public String getBeszeichung() {
        return Beszeichung;
    }

    public void setBeszeichung(String beszeichung) {
        Beszeichung = beszeichung;
    }

    @Override
    public String toString() {
        String i = super.toString();
        i += "Bezeichung: " + getBeszeichung();
        return i;
    }
}
