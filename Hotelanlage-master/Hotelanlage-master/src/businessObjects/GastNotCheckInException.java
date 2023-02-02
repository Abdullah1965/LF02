package businessObjects;

public class GastNotCheckInException extends Exception{
    private Gast gast;

    public GastNotCheckInException(Gast gast) {
        this.gast = gast;

    }

    public String getMessage() {
        return "Der Gast " + gast.getNachname() + "ist in diesem Zimmer nicht eingecheckt.";
    }


}
