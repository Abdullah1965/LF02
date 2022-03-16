public abstract class Konto {
    private Kunde inhaber;
    private double konteStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber,double konteStand,double kreditLimit,double zinsGuthaben){
        this.inhaber = inhaber;
        this.konteStand = konteStand;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;
    }


    public Kunde getInhaber() {
        return inhaber;
    }
    public double getKonteStand() {
        return konteStand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }
    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }
    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }

    public boolean einzahlen(double betrag){
        System.out.println("Einzahlen in von " + betrag);
        konteStand += betrag;
        return false;
    }
    public boolean auszahlen(double betrag){
        boolean i = true;
        if (konteStand > betrag){
            System.out.println("auszahlen von " + betrag);
            konteStand -= betrag;
            i = true;
        }
        else if (konteStand < betrag){
            System.out.println(konteStand + "Reicht nicht für ihre auszahlung" + betrag);
            i = false;
        }
        return i;
    }

    public String toString(){
        String text = " ";
        text += "\nInhaber: " + getInhaber();
        text += "\nKontestand: " + getKonteStand();
        text += "\nKreditLimit: " + getKreditLimit();
        text += "\nZinsGuthaben: " + getZinsGuthaben();
        return text;
    }

}
