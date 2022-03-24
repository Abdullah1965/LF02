import java.io.*;

public class KaufvertragCSV1 {
    public static void main(String[] args) throws IOException {
    File myObj = new File("H:/LF02/versuch2.csv");
     BufferedReader bufferedReader = new BufferedReader(new FileReader(myObj));
     String zeile;
     while ((zeile = bufferedReader.readLine()) != null){

             String[] datensatz = zeile.split(";");


         if (datensatz[0].equalsIgnoreCase("Käufer")){
                     String[] name = datensatz[1].split(",");
                     Vertragspartner keaufer = new Vertragspartner(name[1],name[0]);

                     String ausweis = datensatz[2];
                     keaufer.setAusweisNr(ausweis);

                     //Adresse
                     String[] strasseHasuNr = datensatz[3].split(" ");

                     String hasuNr = strasseHasuNr[strasseHasuNr.length - 1];

                     String strasse = " ";

                     for (int i = 0; i < strasseHasuNr.length - 1;i++){
                         strasse += strasseHasuNr[i] + " ";
                     }
                     strasse = strasse.trim();




                     String plz = datensatz[4];
                     String ort = datensatz[5];


                     Adresse adresse = new Adresse(strasse,hasuNr,plz,ort);
                     keaufer.setAdresse(adresse);


                     System.out.println(keaufer);
                     System.out.println();
                     System.out.println();
                 }




             if (datensatz[0].equalsIgnoreCase("Verkäufer")){


                 String[] name = datensatz[1].split(",");
                 Vertragspartner verkaufer = new Vertragspartner(name[1],name[0]);

                 String[] ausweis = datensatz[2].split(";");
                 verkaufer.setAusweisNr(ausweis[0]);

                 //Adresse
                 String[] strasseHasuNr = datensatz[3].split(" ");
                 String hasuNr = strasseHasuNr[strasseHasuNr.length - 1];
                 String strasse = " ";

                 for (int i = 0; i < strasseHasuNr.length - 1;i++){
                     strasse += strasseHasuNr[i] + " ";

                 }
                 strasse = strasse.trim();
                 String plz = datensatz[4];
                 String ort = datensatz[5];
                 Adresse adresse1 = new Adresse(strasse,hasuNr,plz,ort);
                 verkaufer.setAdresse(adresse1);
                 System.out.println(verkaufer);
             }






         }
     }
}

