import java.util.ArrayList;

public class Zimmer {
    private int nr;
    private ArrayList<Gast> gastList;
    public Zimmer(int nr){
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

}
