public abstract class Person {
    private String vorName;
    private String nachName;
    private Adresse adresse;

    public Person(String vorName,String nachName,Adresse adresse){
        this.vorName = vorName;
        this.nachName = nachName;
        this.adresse = adresse;
    }

    public String getVorName() {
        return vorName;
    }
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public Adresse getAdresse() {
        return adresse;
    }
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String toString(){
        String text = " ";
        text += "\nVorName: \t" + getVorName();
        text += "\nNachName: \t" + getNachName();
        text += "\nAdresse: \t" + getAdresse();
        return text;
    }
}
