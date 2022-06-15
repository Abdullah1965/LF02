package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) throws Exception {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        Ware wareDAO = new WareDAO().read("1");


/*
        Vertragspartner vertragspartner = new Vertragspartner("Ich","und Du");
        vertragspartner.setAusweisNr("99");
        vertragspartner.setAdresse(new Adresse("Hallo","3a","28222","Bremen"));
        vertragspartnerDAO.create(vertragspartner);
        vertragspartnerDAO.read("99");



        vertragspartnerDAO.update("99","strasse11","25852");
*/
/*
        Ware ware = new Ware("Laptop9", 280.0);
        ware.setWarenNr("99");
        ware.setBeschreibung("Super krasses Gaming-Laptop5");
        ware.getBesonderheitenListe().add("Tasche3");
        ware.getBesonderheitenListe().add("Gaming-Maus2");
        ware.getMaengelListe().add("Ladekabel fehlt1");
        ware.getMaengelListe().add("Touchpad defekt1");

        wareDAO.create(ware);
*/


//        wareDAO.update("99",500,"Laptop");


/*
        ArrayList<Vertragspartner> vertragspartnerArrayList = vertragspartnerDAO.read();
        System.out.println("-------------------------------");
        for (Vertragspartner v: vertragspartnerArrayList){
            System.out.println(v);
        }
*/


      //  Ware ware = wareDAO.read("0");
         System.out.println(wareDAO);




    }
}