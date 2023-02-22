import java.util.ArrayList;

public class Programme {
    public static void main(String[] args) throws ClassNotFoundException {
        LebensmittelDAO lebensmittelDAO = new LebensmittelDAO();
        Lebensmittel lebensmittel = new Lebensmittel(4,"essen",2.99);
        lebensmittel.setGewicht(20);
        lebensmittel.getNuesse().add("ohne Nuesse");
        lebensmittel.getMilch().add("ohne milch");
        lebensmittelDAO.create(lebensmittel);
        lebensmittelDAO.read(4);
        Lebensmittel lebensmittel1 = new Lebensmittel(5,"essen",4.99);
        lebensmittel1.setGewicht(20);
        lebensmittel1.getNuesse().add("ohne Nuesse");
        lebensmittel1.getMilch().add("ohne milch");
        lebensmittelDAO.read(5);
        lebensmittelDAO.Delete(5);
        ArrayList<String> lebensmittelDAOArrayList = new ArrayList<>();
        for (String b: lebensmittelDAOArrayList){
            System.out.println(b);
        }

    }
}
