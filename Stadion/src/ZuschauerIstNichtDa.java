public class ZuschauerIstNichtDa extends Exception{
    private Zuschauer zuschauer;
    public ZuschauerIstNichtDa(Zuschauer zuschauer){
        this.zuschauer = zuschauer;
    }
    public String getMassage(){
        return "Zuschauer " + zuschauer.getName() + " ist nicht da";
    }
}
