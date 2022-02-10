public class Test {
    public static void main(String[] args){
        Zauber merlin = new Zauber("Merlin",5,10);
        try {
            merlin.zaubern();
        } catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
            merlin.trinkenZaubertrank();
        try {
            merlin.zaubern();
        } catch (KeineKraftException e){
        System.out.println(e.getMessage());
    }
        try {
            merlin.kaempfen();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        try {
            merlin.klettern();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        try {
            merlin.klettern();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }

        System.out.println(merlin);

    }
}
