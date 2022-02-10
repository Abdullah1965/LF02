public class KeineKraftException extends Exception{
    private String aktion;
    private String name;

    public KeineKraftException(String aktion ,String name ){
        this.aktion = aktion;
        this.name = name;
    }

    public String getAktion() {
        return aktion;
    }

    public String getName() {
        return name;
    }

    public String getMessage(){
        return name + "ist zu schwach zum  " + aktion;
    }
}
