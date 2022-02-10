public class elfe extends Spielfigur{
    public elfe(String name, int staerke) {
        super(name, staerke);
    }

    public void rennen() {
        if (getStaerkepunkte() >= 2) {
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "rennen");
        }
    }
    public String toString(){
        return super.toString();

    }
}
