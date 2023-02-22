package dao;

import businessObjects.Ware;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) throws Exception {
    //    VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        WareDAO wareDAO = new WareDAO();
        TriningDAO triningDAO = new TriningDAO();
    //    Ware triningDAO1 = new TriningDAO().read("00");
      //  System.out.println(triningDAO1);
/*
        ArrayList<Ware> wareArrayList = triningDAO.read();
        for (Ware b:wareArrayList){
            System.out.println(b);
        }
        triningDAO.read("1");
/*
        Vertragspartner vertragspartner = new Vertragspartner("Ich","und Du");
        vertragspartner.setAusweisNr("99");
        vertragspartner.setAdresse(new Adresse("Hallo","3a","28222","Bremen"));
        vertragspartnerDAO.create(vertragspartner);
        vertragspartnerDAO.read("99");



        vertragspartnerDAO.update("99","strasse11","25852");
*/

        Ware ware = new Ware("Laptop9", 280.0);
        ware.setWarenNr("88");
        ware.setBeschreibung("Super krasses Gaming-Laptop5");
        ware.getBesonderheitenListe().add("Tasche3");
        ware.getBesonderheitenListe().add("Gaming-Maus234");
        ware.getMaengelListe().add("Ladekabel fehlt1");
        ware.getMaengelListe().add("Touchpad defekt1");

    //   triningDAO.create(ware);
       triningDAO.read("88");


//        wareDAO.update("99",500,"Laptop");
    //    ArrayList<Ware> wareArrayList = wareDAO.read();
        
    //    for (Ware w: wareArrayList){
     //       System.out.println(w);
     //   }




/*
        ArrayList<Vertragspartner> vertragspartnerArrayList = vertragspartnerDAO.read();
        System.out.println("-------------------------------");
        for (Vertragspartner v: vertragspartnerArrayList){
            System.out.println(v);
        }
*/


      //  Ware ware = wareDAO.read("0");
      //   System.out.println(wareDAO);




    }
}