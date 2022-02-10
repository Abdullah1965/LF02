public class Test {
    public static void main(String[] args){
        Zauber merlin = new Zauber("Merlin",0,100);
        for (int i = 0; i < 100;i++) {
            try {
                merlin.zaubern();
            } catch (KeineKraftException e) {
                System.out.println(e.getMessage());
            }
        }
            System.out.println(merlin);
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
