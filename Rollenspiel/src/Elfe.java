public class Elfe extends Spielfigur{
    public Elfe(String name, int staerke) {
        super(name, staerke);
    }

    public void rennen() throws KeineKraftException {
        if (getStaerkepunkte() >= 2) {
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "\trennen");
        }
        else {
            throw new KeineKraftException(getName(),"Rennen");
        }
    }
    public String toString(){
        return super.toString();

    }
}
