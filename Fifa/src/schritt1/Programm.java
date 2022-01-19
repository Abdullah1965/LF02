package schritt1;

public class Programm {
    public static void main(String[] args) {
        Spieler cristiano = new Spieler("cristiano ronaldo",36,10,10,10,801);
        Trainer zidane = new Trainer("Zinedine Zidane",49,10);
        System.out.println("Zahlen von 1 (unerfahren) bis 10 (Beste)");
        System.out.println(cristiano);
        System.out.println(zidane);
    }
}
