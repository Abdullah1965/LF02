package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) throws Exception {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        WareDAO wareDAO = new WareDAO();

     /*

     Creat new

        Vertragspartner vertragspartner1 = new Vertragspartner("Ich","und Du");
        vertragspartner1.setAusweisNr("2");
        vertragspartner1.setAdresse(new Adresse("Hallo","3a","28222","Bremen"));
        vertragspartnerDAO.create(vertragspartner1);

        Delete

        vertragspartnerDAO.delete("0");

        Updata

        vertragspartnerDAO.update("1","strasse","1");

        Ware ware = new Ware("Laptop2", 250.0);
        ware.setWarenNr(2);
        ware.setBeschreibung("Super krasses Gaming-Laptop");
        ware.getBesonderheitenListe().add("Tasche");
        ware.getBesonderheitenListe().add("Gaming-Maus");
        ware.getMaengelListe().add("Ladekabel fehlt");
        ware.getMaengelListe().add("Touchpad defekt");
        wareDAO.create(ware);

        wareDAO.delete("0");

        wareDAO.update("1",500,"Laptop");
    */
        Ware ware = new Ware("Laptop2", 250.0);
        ware.setWarenNr(2);
        ware.setBeschreibung("Super krasses Gaming-Laptop");
        ware.getBesonderheitenListe().add("Tasche");
        ware.getBesonderheitenListe().add("Gaming-Maus");
        ware.getMaengelListe().add("Ladekabel fehlt");
        ware.getMaengelListe().add("Touchpad defekt");
        wareDAO.create(ware);



        ArrayList<Vertragspartner> vertragspartnerArrayList = vertragspartnerDAO.read();
        System.out.println("-------------------------------");
        for (Vertragspartner v: vertragspartnerArrayList){
            System.out.println(v);
        }


      //  Ware ware = wareDAO.read("0");
       // System.out.println(ware);

        ArrayList<Ware> wareArrayList = wareDAO.read();
        for (Ware w:wareArrayList){
            System.out.println(w);
        }
    }
}