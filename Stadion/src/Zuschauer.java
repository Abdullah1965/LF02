

public class Zuschauer extends Person {
    private Adresse adresse;
    private String ausweisNr;
    private Gewaltbereitschaft gewaltbereitschaft;

    public Zuschauer(String name,int alter,String ausweisNr){
        super(name,alter);
        this.ausweisNr = ausweisNr;
        this.gewaltbereitschaft = Gewaltbereitschaft.FRIEDLICH;
    }
    public Zuschauer(String name,int alter,String ausweisNr,Gewaltbereitschaft gewaltbereitschaft){
        this(name,alter,ausweisNr);
        this.gewaltbereitschaft = gewaltbereitschaft;
    }

    public Gewaltbereitschaft getGewaltbereitschaft() {
        return gewaltbereitschaft;
    }

    public void setGewaltbereitschaft(Gewaltbereitschaft gewaltbereitschaft) {
        this.gewaltbereitschaft = gewaltbereitschaft;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Zuschauer{" +
                "adresse=" + adresse +
                ", ausweisNr='" + ausweisNr + '\'' +
                ", gewaltbereitschaft=" + gewaltbereitschaft +
                '}';
    }
}
