public class ZuschauerIstDa extends Exception{
    private Zuschauer zuschauer;
    public ZuschauerIstDa(Zuschauer zuschauer){
        this.zuschauer = zuschauer;
    }
    public String getMassage(){
        return "Zuschauer " + zuschauer.getName() + " ist schön da";
    }
}
