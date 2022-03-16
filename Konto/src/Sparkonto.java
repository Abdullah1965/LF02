public class Sparkonto extends Konto{
    public Sparkonto(Kunde inhaber, double zinsGuthaben) {
        super(inhaber,0, zinsGuthaben);
    }


    public String toString(){
       return super.toString();
    }
}
