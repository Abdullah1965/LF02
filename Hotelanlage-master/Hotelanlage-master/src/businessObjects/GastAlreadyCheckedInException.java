package businessObjects;

public class GastAlreadyCheckedInException extends Exception{
    private Gast gast;

    public GastAlreadyCheckedInException(Gast gast) {
        this.gast = gast;
    }

    public String getMassage() {
        return "Der Gast " + gast.getNachname() + "ist schon in diesem Zimmer eingecheckt.";
    }
}
