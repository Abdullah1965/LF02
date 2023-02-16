public class SitzplatzAngabenInvalideException extends Exception{
    private int reihe;
    private int sitz;
    public SitzplatzAngabenInvalideException(int reihe,int sitz){
      this.reihe = reihe;
      this.sitz = sitz;
    }

    public int getReihe() {
        return reihe;
    }

    public int getSitz() {
        return sitz;
    }

    public String getMessage(){
        return "in diese reihe " + getReihe() +" ist der Sitz " + getSitz()+ "nicht frei";
    }
}
