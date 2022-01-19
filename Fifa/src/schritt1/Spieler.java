package schritt1;

public class Spieler {
    private String name;
    private int alter;
    private int starke;
    private int torschuss;
    private int motivation;
    private int tore;

    public Spieler(String name,int alter,int starke,int torschuss,int motivation,int tore){
        this.name = name;
        this.alter = alter;
        this.starke = starke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.tore = tore;
    }
    //Get
    public String getName(){
        return name;
    }
    public int getAlter(){
        return alter;
    }
    public int getStarke(){
        return starke;
    }
    public int getTorschuss(){
        return torschuss;
    }
    public int getMotivation(){
        return motivation;
    }
    public int getTore(){
        return tore;
    }
    //Set
    public void setName(String name){
        this.name = name;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }
    public void setStarke(int starke){
        this.starke = starke;
    }
    public void setTorschuss(int torschuss){
        this.torschuss = torschuss;
    }
    public void setMotivation(int motivation){
        this.motivation = motivation;
    }
    public void setTore(int tore){
        this.tore = tore;
    }

    @Override
    public String toString(){
        String spieler = " ";
        spieler += "\nName: " + name;
        spieler += "\n\tAlter:\t\t" + alter;
        spieler += "\n\tStärke:\t\t" + starke;
        spieler += "\n\tTorschuss:\t" + torschuss;
        spieler += "\n\tMotivation: " + motivation;
        spieler += "\n\tLebenslang Tore: " + tore;
        return spieler;
    }
}
