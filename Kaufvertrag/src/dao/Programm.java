package dao;

import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) throws ClassNotFoundException {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        Vertragspartner vertragspartner = vertragspartnerDAO.read("0");
        System.out.println(vertragspartner);

        ArrayList<Vertragspartner> vertragspartnerArrayList = vertragspartnerDAO.read();
        System.out.println("-------------------------------");
        for (Vertragspartner v: vertragspartnerArrayList){
            System.out.println(v);
        }

        Ware ware = new WareDAO().read("0");
        System.out.println(ware);
    }
}