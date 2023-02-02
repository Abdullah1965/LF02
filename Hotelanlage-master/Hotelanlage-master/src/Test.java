import businessObjects.Adresse;
import businessObjects.Gast;
import businessObjects.Zimmer;

public class Test {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("Helenenstraße", "69", "28795", "Bremen");
        Gast gast = new Gast("Yannick", "Schröder", adresse);
        Gast gast1 = new Gast("Lucas", "Buldmann", adresse);


    }

}
