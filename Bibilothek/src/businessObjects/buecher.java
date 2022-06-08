package businessObjects;

import java.util.ArrayList;

public class buecher {

    private String Nr;
    private String titel;
    private String author;
    private String pages;
    private double price;
    private ArrayList<String> category;
    private String language;

    public buecher(String artikelNr,String titel,double preis){
        this.Nr = artikelNr;
        this.titel = titel;
        this.price = preis;
    }

    public String getNr() {
        return Nr;
    }
    public void setNr(String nr) {
        this.Nr = nr;
    }

    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return pages;
    }
    public void setPages(String pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList<String> getCategory() {
        return category;
    }


    @Override
    public String toString(){
        String text = " ";
        text += "\n\t\tNr:" + Nr;
        text += "\n\t\tTitel:" + titel;
        text += "\n\t\tAuthor:" + author;
        text += "\n\t\tPages:" + pages;
        text += "\n\t\tPrice:" + price;
        text += "\n\t\tcategory:" + category;
        text += "\n\t\tLanguage:" + language;
        return text;
    }
}
