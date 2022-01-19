public class programm {
    public static void main(String[] args) {
        Apple apple = new Apple();

        //Apple
        apple.setFarbe("Grün");
        apple.setGewicht(75);
        apple.setReif(true);
        //Banane
        Banane banane = new Banane();
        banane.setKruemmung(90);
        banane.setFarbe("Gelb");
        banane.setGewicht(75);
        banane.setReif(true);


        System.out.println(banane);
        System.out.println(apple);
    }
}
