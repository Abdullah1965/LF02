package businessObjects;


import java.util.List;

public class Test {
    public static void main(String[] args) {
        Gast gast = new Gast(1,"Mohammmad","Abzied",new Adresse("Helenenstraße", "69", "28795", "Bremen"));
        Gast gast1 = new Gast(2,"Mohammmad","Abzied",new Adresse("Helenenstraße", "69", "28795", "Bremen"));
        GastDao Dao = new GastDao();
        List<Gast> gastListe;

        System.out.println("\nLeere DatemBank prüfen");
        gastListe = Dao.FindAll();
        System.out.println("Anzahl: " + gastListe.size());

        System.out.println("\nDatensätze hinzufügen");
        try {
            Dao.insert(gast);
        }catch (GastAlreadyCheckedInException e){
            System.out.println(e.getMassage());
        }
        System.out.println("\nDatensätze hinzufügen");
        try {
            Dao.insert(gast);
        }catch (GastAlreadyCheckedInException e){
            System.out.println(e.getMassage());
        }
        System.out.println("\nDatensätze hinzufügen");
        try {
            Dao.update(gast1);
        }catch (GastAlreadyCheckedInException e){
            System.out.println(e.getMassage());
        }

    }

}
