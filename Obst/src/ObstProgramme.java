public class ObstProgramme {
    public static void main(String[] args) {
        Apple apple = new Apple();

        //apple.getName("Apple");
        apple.setFarbe("Grün");
        apple.setGewicht(75);
        apple.setReif(true);
        //Banane
        Banane banane = new Banane();
        banane.setKruemmung(90);
        banane.setFarbe("Gelb");
        banane.setGewicht(75);
        banane.setReif(true);

        System.out.println(apple.getName());
        System.out.println(apple.getFarbe());
        System.out.println(apple.getGewicht());
        System.out.println(apple.isReif());

        System.out.println();
        System.out.println();

        System.out.println(banane.getName());
        System.out.println(banane.getFarbe());
        System.out.println(banane.getGewicht());
        System.out.println(banane.isReif());
        System.out.println(banane.kruemmung() + "°");
    }
}
