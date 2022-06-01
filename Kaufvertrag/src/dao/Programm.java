package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) throws Exception {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();


        Vertragspartner vertragspartner1 = new Vertragspartner("Ich","und Du");
        vertragspartner1.setAusweisNr("2");
        vertragspartner1.setAdresse(new Adresse("Hallo","3a","28222","Bremen"));
        vertragspartnerDAO.create(vertragspartner1);

        ArrayList<Vertragspartner> vertragspartnerArrayList = vertragspartnerDAO.read();
        System.out.println("-------------------------------");
        for (Vertragspartner v: vertragspartnerArrayList){
            System.out.println(v);
        }

        WareDAO wareDAO = new WareDAO();
      //  Ware ware = wareDAO.read("0");
       // System.out.println(ware);

        ArrayList<Ware> wareArrayList = wareDAO.read();
        for (Ware w:wareArrayList){
            System.out.println(w);
        }
    }
}