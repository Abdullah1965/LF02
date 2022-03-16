public class Kunde extends Person{
    private Mitarbeiter betruer;

    public Kunde(String vorName, String nachName, Adresse adresse,Mitarbeiter betruer) {
        super(vorName, nachName, adresse);
        this.betruer = betruer;
    }

    public Mitarbeiter getBetruer() {
        return betruer;
    }
    public void setBetreuer(Mitarbeiter betruer) {
        this.betruer = betruer;
    }

    public String toString(){
        String text = super.toString();
        text += "\nBetruer: \t" + getBetruer();
        return text;
    }
}
