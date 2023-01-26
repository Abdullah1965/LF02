public class Tonne extends Behaelter {
    private double durchmesser;


    public Tonne(String behaelterNr, double gewichtbehaelter, double gewichtInhalt, double gewichtInhaltMax, double hoehe, double durchmesser) {
        super(behaelterNr, gewichtbehaelter, gewichtInhalt, gewichtInhaltMax, hoehe);
        this.durchmesser = durchmesser;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(double durchmesser) {
        this.durchmesser = durchmesser;
    }

    @Override
    public String toString() {
        return "Tonne{" +
                "durchmesser=" + durchmesser +
                '}';
    }
}
