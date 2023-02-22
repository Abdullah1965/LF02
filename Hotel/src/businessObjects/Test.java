package businessObjects;


import java.util.List;

public class Test {
    public static void main(String[] args) {
        Gast gast = new Gast(1,"Mohammmad","Abzied",new Adresse("Helenenstraße", "69", "28795", "Bremen"));
        Gast gast1 = new Gast(1,"Mohammmad","Abziedddd",new Adresse("Helenenstraße", "69", "28795", "Bremen"));
        GastDao Dao = new GastDao();
        List<Gast> gastListe;

        //hallo
        System.out.println("\nLeere DatenBank prüfen");
        gastListe = Dao.FindAll();
        System.out.println("Anzahl: " + gastListe.size());

        System.out.println("\nDatensätze hinzufügen");
        try {
            Dao.insert(gast);
        }catch (GastAlreadyCheckedInException e){
            System.out.println(e.getMassage());
        }
        System.out.println("\nDatenBank prüfen");
        gastListe = Dao.FindAll();
        System.out.println("Anzahl: " + gastListe);

        System.out.println("\nDatensätze update");
        try {
            Dao.update(gast1);
        }catch (GastAlreadyCheckedInException e){
            System.out.println(e.getMassage());
        }

        System.out.println("\nDatenBank prüfen");
        gastListe = Dao.FindAll();
        System.out.println("Anzahl: " + gastListe);

        System.out.println("\nfinden");
        try{
            Dao.findById(1);
        } catch (GastNotCheckInException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nDatenBank prüfen");
        gastListe = Dao.FindAll();
        System.out.println("Anzahl: " + gastListe);

        System.out.println("Löchen");
        try{
            Dao.delete(gast);
        } catch (GastNotCheckInException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nDatenBank prüfen");
        gastListe = Dao.FindAll();
        System.out.println("Anzahl: " + gastListe);


    }

}
