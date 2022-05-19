package dao;

import businessObjects.Vertragspartner;

public class Programm {
            public static void main(String[] args) throws ClassNotFoundException {
                VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
                Vertragspartner vertragspartner = new VertragspartnerDAO().read("A123");
                System.out.println("super!!!!");
    }

}