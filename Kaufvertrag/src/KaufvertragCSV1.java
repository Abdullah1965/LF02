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

                 String[] ausweis = datensatz[2].split(";");
                 keaufer.setAusweisNr(ausweis[0]);
                 System.out.println(keaufer);

                 //Adresse
                 String[] strasseHasuNr = datensatz[3].split(" ");
                 String hasuNr = strasseHasuNr[strasseHasuNr.length - 1];
                 String strasse = " ";

                 for (int i = 0; i < strasseHasuNr.length - 1;i++){
                     strasse += hasuNr + " ";
                 }
                 strasse = strasse.trim();

                 String[] plazort = datensatz[4].split(" ");
                 String plzort = plazort[strasseHasuNr.length - 1];
                 String ort = " ";
                 for (int i = 0;i < plazort.length;i++){
                     ort += plzort + " ";
                 }
                 ort = ort.trim();

             }
         }
     }
}

