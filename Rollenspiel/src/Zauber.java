public class Zauber extends Spielfigur{
        private int zauberpunkte;

        public Zauber(String name, int staerkepunkte, int zauberpunkte){
            super(name,staerkepunkte);
            this.zauberpunkte = zauberpunkte;

        }
        public int getZauberpunkte(){
            return zauberpunkte;
        }
        public void trinkenZaubertrank(){
            zauberpunkte += 3;
            System.out.println(getName() + "\ttrinket");
        }

        public void zaubern() throws KeineKraftException {
            if (getZauberpunkte() >= 1){
                zauberpunkte--;
                System.out.println(getName() + "\tZaubern");
            }
            else {
                throw new KeineKraftException(getName(),"\tZaubern");
            }
        }
        public String toString(){
            String text = super.toString();
            text += "\nZauberpunkte \t" + zauberpunkte;
            return text;
        }
}
