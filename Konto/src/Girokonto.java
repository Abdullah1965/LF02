public class Girokonto extends Konto{
    private double zinsKredit;

    public Girokonto(Kunde inhaber, double kreditLimit, double zinsGuthaben,double zinsKredit) {
        super(inhaber, kreditLimit, zinsGuthaben);
        this.zinsKredit = zinsKredit;
    }

    public double getZinsKredit() {
        return zinsKredit;
    }
    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }

    public boolean ueberweisen(double betrag,Girokonto girokonto){
        boolean i = true;
        if (girokonto.getKonteStand() > betrag){
            System.out.println("Das betrag wurde Überweiset" + betrag);
            girokonto.ueberweisen(betrag,girokonto);
            i = false;
        }
        else if (girokonto.getKonteStand() < betrag){
            System.out.println("Es reicht nicht für ein Überweisung " + betrag);
            i = true;
        }
        return i;
    }
    public String toString(){
        String text = super.toString();
        text += "\nZinsKredit: \t" + getZinsKredit();
        return text;
    }
}
