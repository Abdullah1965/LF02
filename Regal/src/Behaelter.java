public abstract class Behaelter {
    private String behaelterNr;
    private double gewichtbehaelter;
    private double gewichtInhaltMax;
    private double gewichtInhalt;
    private double hoehe;


    public Behaelter(String behaelterNr,double gewichtbehaelter, double gewichtInhalt,double gewichtInhaltMax,double hoehe){
        this.behaelterNr=behaelterNr;
        this.gewichtbehaelter=gewichtbehaelter;
        this.gewichtInhaltMax=gewichtInhaltMax;
        this.gewichtInhalt=gewichtInhalt;
        this.hoehe=hoehe;



    }

    public double getGewichtbehaelter() {
        return gewichtbehaelter;
    }

    public void setGewichtbehaelter(double gewichtbehaelter) {
        this.gewichtbehaelter = gewichtbehaelter;
    }

    public double getGewichtInhalt() {
        return gewichtInhalt;
    }

    public void setGewichtInhalt(double gewichtInhalt) {
        this.gewichtInhalt = gewichtInhalt;
    }

    public double getGewichtInhaltMax() {
        return gewichtInhaltMax;
    }

    public void setGewichtInhaltMax(double gewichtInhaltMax) {
        this.gewichtInhaltMax = gewichtInhaltMax;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public String getBehaelterNr() {
        return behaelterNr;
    }

    public void setBehaelterNr(String behaelterNr) {
        this.behaelterNr = behaelterNr;
    }

    @Override
    public String toString() {
        return "Behaelter{" +
                "behaelterNr='" + behaelterNr + '\'' +
                ", gewichtbehaelter=" + gewichtbehaelter +
                ", gewichtInhaltMax=" + gewichtInhaltMax +
                ", gewichtInhalt=" + gewichtInhalt +
                ", hoehe=" + hoehe +
                '}';
    }
}
