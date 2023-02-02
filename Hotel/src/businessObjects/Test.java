package businessObjects;


import businessObjects.Gast;
import businessObjects.Zimmer;

public class Test {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("Helenenstraße", "69", "28795", "Bremen");
        Gebaeude gebaeude = new Gebaeude("Erster");
        Zimmer zimmer = new Zimmer(20);
        Etage etage = new Etage("erster Etage");
        Gast gast = new Gast("Mohammmad","Abzied",adresse);
        Hotelanlage hotelanlage = new Hotelanlage("Pof",adresse);
        hotelanlage.getAnzahlZimmerFrei();

    }

}
