import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.io.IOException;


public class Kaufvertrag1 {
    public static void main(String[] args) throws IOException {
        String datei = "H:/LF02/Kaufvertrag1.pdf";
        PdfWriter writer = new PdfWriter(datei);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        document.setFont(font);
        document.setFontSize(12);
        document.setItalic();
        document.setTextAlignment(TextAlignment.LEFT);
        Paragraph p1 = new Paragraph();
        Paragraph p2 = new Paragraph();
        Paragraph p3 = new Paragraph();
        Paragraph p4 = new Paragraph();
        Paragraph p5 = new Paragraph();


        Table table = new Table(3);
        Cell header1 = new Cell();
        header1.add(new Paragraph("Kaufvertrag"));
        header1.setFontColor(ColorConstants.BLUE);
        header1.setFontSize(20);
        header1.setBackgroundColor(ColorConstants.CYAN);
        header1.setTextAlignment(TextAlignment.CENTER);
        p1.add("\n");
        Cell header2 = new Cell();
        header2.add(new Paragraph("Käufer:"));
        header2.setUnderline();
        header2.setFontColor(ColorConstants.GREEN);
        header2.setTextAlignment(TextAlignment.LEFT);
        p2.add("-Name: Klaus Brandt\n");
        p2.add("-AusweisNr: 0123456789\n");
        p2.add("-Adresse: Zu Hause 3a, 28199 Bremen\n\n");
        Cell header3 = new Cell();
        header3.add(new Paragraph("Verkäufer:"));
        header3.setUnderline();
        header3.setFontColor(ColorConstants.RED);
        header3.setTextAlignment(TextAlignment.LEFT);
        p3.add("-Name: Joachim Bredull\n");
        p3.add("-AusweisNr: 9876543210\n");
        p3.add("-Adresse: Auch zu Hause 7, 28195 Bremen\n\n");




        Table table1 = new Table(2);
        Cell heade = new Cell();
        heade.add(new Paragraph("Text"));
        heade.setTextAlignment(TextAlignment.CENTER);
        table1.addHeaderCell(heade);
        Cell heade1 = new Cell();
        heade1.add(new Paragraph("Wert"));
        heade1.setTextAlignment(TextAlignment.CENTER);
        table1.addHeaderCell(heade1);
        p5.add("Verkaufte Ware:").setUnderline().setFontColor(ColorConstants.BLUE);

       String[] tablle = {"Bezeichnung","Laptop","Beschreibung","Super krasses Gaming-Laptop","Preis","250.0","Besonderheiten","[Tasche, Gaming-Maus]","Mängel","[Ladekabel fehlt, Touchpad defekt]"};

       for (int i = 0;i <= tablle.length - 1;i++){
           table1.addCell(tablle[i]);
       }


       p4.add("\n\n\nZahlungsmodalitäten:\n").setUnderline();
       p4.add("Privater Barverkauf");

        document.add(header1);
        document.add(p1);
        document.add(header2);
        document.add(p2);
        document.add(header3);
        document.add(p3);
        document.add(p5);
        document.add(table1);
        document.add(p4);
        document.close();
    }
}
