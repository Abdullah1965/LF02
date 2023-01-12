public abstract class Person {
    private String vorName;
    private String nachName;

    public Person(String vorName, String nachName){
        this.vorName = vorName;
        this.nachName = nachName;
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


    public String toString(){
        String text = " ";
        text += "\nVorName: \t" + getVorName();
        text += "\nNachName: \t" + getNachName();
        return text;
    }
}
