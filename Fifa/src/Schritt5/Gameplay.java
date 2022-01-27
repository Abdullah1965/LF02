package Schritt5;

import Schritt4.Mannschaft;

public class Gameplay {
private int spielzeit = 90;
private int nachspielzeit = 10;
private int aktion = 5;
private static int ermittelMannschaftsWert(Mannschaft mannschaft){
    int wert = 0;
    wert += (mannschaft.getMotivation() * mannschaft.getstarke() * mannschaft.getTrainer().getErfahrung());
    return wert;
}

}
