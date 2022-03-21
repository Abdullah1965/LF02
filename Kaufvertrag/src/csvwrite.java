import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class csvwrite {
	public static void main(String[] args) throws FileNotFoundException {
		Ware ware = new Ware("Laptop", 250.0);
		ware.setBeschreibung("Super krasses Gaming-Laptop");
		ware.getBesonderheiten().add("Tasche");
		ware.getBesonderheiten().add("Gaming-Maus");
		ware.getMaengel().add("Ladekabel fehlt");
		ware.getMaengel().add("Touchpad defekt");

		Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt");
		kaeufer.setAusweisNr("0123456789");
		kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

		Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull");
		verkaeufer.setAusweisNr("9876543210");
		verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));

		Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
		vertrag.setZahlungsModalitaeten("Privater Barverkauf");

		System.out.println(vertrag);
		String datei = "H:/LF02/versuch2.csv";
		PrintWriter writer = new PrintWriter(datei);
		writer.print("Vertragspartner;");
		writer.print("Name;");
		writer.print("AusweisNr;");
		writer.print("Straße;");
		writer.print("Plz;");
		writer.println("Ort");

		writer.print("Käufer;");
		writer.print(kaeufer.getNachname() + "," + kaeufer.getVorname() + ";");
		writer.print(kaeufer.getAusweisNr() + ";");
		writer.print(kaeufer.getAdresse().getStrasse() + " " + kaeufer.getAdresse().getHausNr() + ";");
		writer.print(kaeufer.getAdresse().getPlz() + ";");
		writer.println(kaeufer.getAdresse().getOrt());

		writer.print("Verkäufer;");
		writer.print(verkaeufer.getNachname() + "," + verkaeufer.getVorname() + ";");
		writer.print(verkaeufer.getAusweisNr() + ";");
		writer.print(verkaeufer.getAdresse().getStrasse() + " " + verkaeufer.getAdresse().getHausNr() + ";");
		writer.print(verkaeufer.getAdresse().getPlz() + ";");
		writer.println(verkaeufer.getAdresse().getOrt());
		writer.close();
	}
}
