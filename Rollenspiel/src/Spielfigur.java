public abstract class Spielfigur {
    private String name;
    private int staerkepunkte;

    public Spielfigur(String name, int staerkepunkte) {
        this.name = name;
        this.staerkepunkte = staerkepunkte;

    }

    public String getName() {
        return name;
    }

    public int getStaerkepunkte() {
        return staerkepunkte;
    }

    protected void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public void essen() {
        staerkepunkte = staerkepunkte + 10;
    }

    public void laufen() throws KeineKraftException {
        if (getStaerkepunkte() >= 1) {
            setStaerkepunkte(getStaerkepunkte() - 1);
            System.out.println(getName() + " \tlaufen");
        }
        else {
            throw new KeineKraftException(name, "\tlaufen");
        }
    }

    public void klettern() throws KeineKraftException {
        if (getStaerkepunkte() >= 2) {
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "\tklettern");
        } else {
            throw new KeineKraftException(name, "\tklettern");
        }
    }

    public void kaempfen() throws KeineKraftException {
        if (getStaerkepunkte() >= 3) {
            setStaerkepunkte(getStaerkepunkte() - 3);
            System.out.println(getName() + "\tkämpfen");
        } else {
            throw new KeineKraftException(name, "\tkämpfen");
        }
    }

    public String toString() {
        String Spielfigur = "name \t" + name;
        Spielfigur += "\nStaerkepunkte \t" + staerkepunkte;
        return Spielfigur;
    }
}
