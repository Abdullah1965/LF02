import java.util.ArrayList;

public class TresorTur {
    private ArrayList<Gegenstand> gegenstands;
    public TresorTur(){
    }
    public Gegenstand getGegenstand(int id) throws GegenstandNichtGefundenException{
        if (gegenstands.contains(id)){
            return gegenstands.get(id);
        }
        else {
            throw new GegenstandNichtGefundenException(id);
        }
    }
    public void addGegenstand(Gegenstand gegenstand){
        gegenstands.add(gegenstand);
    }
    public void removeGegenstand(Gegenstand gegenstand) throws GegenstandNichtGefundenException {
        if (gegenstands.contains(gegenstand)){
            gegenstands.remove(gegenstand);
        }
        else {
            throw new GegenstandNichtGefundenException(gegenstand.getId());
        }
    }
    public double berchneGesamtwert(){
        int gesamt = 0;
        for (int i = 0;i < gegenstands.size();i++){
            gesamt += gegenstands.get(i).getWert();
        }
        return gesamt;
    }

    @Override
    public String toString() {
        return "TresorTur{" +
                "gegenstands=" + gegenstands +
                '}';
    }
}
