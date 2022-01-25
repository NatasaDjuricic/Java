package Vozilo;

public class OsobaAutomobil {
    // polje (atribut) klase
    private String ime;
    private String prezime;


    // konstruktor metoda
    // nema povratnu vrednost!
    // ime te metode je uvek isto kao ime klase
    public OsobaAutomobil(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;

    }

    // getter i setter za ime
    public String getIme() {

        return ime;
    }

    public void setIme(String ime) {

        this.ime = ime;
    }

    // getter i setter za prezime
    public String getPrezime() {

        return prezime;
    }

    public void setPrezime(String prezime) {

        this.prezime = prezime;
    }


    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Ime: " + ime + "\n");
        sb.append("Prezime: " + prezime + "\n");
        return sb.toString();




    }
}