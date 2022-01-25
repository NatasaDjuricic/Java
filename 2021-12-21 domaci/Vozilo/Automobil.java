//vozilo  - Napisati klasu Automobil. Automobil ima
//1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
//2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
//3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
//Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
// Napisati klasu Voznja iz koje ce program moci da se pokrene.
// U njoj ce se kreirati najmanje dva automobila.
// Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil

package Vozilo;

public class Automobil {

    private String marka;
    private String model;
    private int serijskiBroj;
    private OsobaAutomobil vlasnik;

    public Automobil(String marka, String model, int serijskiBroj, OsobaAutomobil vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;
    }

    public Automobil(String marka, String model, int serijskiBroj){
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;

    }

    public String getMarka () {
        return marka;
    }

    public String getModel(){
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public OsobaAutomobil getVlasnik(){
        return vlasnik;
    }


    public void setVlasnik (){
        this.vlasnik=vlasnik;
    }

public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Marka: ");
        sb.append(marka);
        sb.append("\n");
        sb.append("Model: ");
        sb.append(model);
        sb.append("\n");
        sb.append("Serijski broj: ");
        sb.append(serijskiBroj);
        sb.append("\n");
        if (vlasnik == null) {
            sb.append("Automobil nema vlasnika");
        }
        else {
            sb.append("Ime vlasnika: ");
            sb.append(vlasnik.getIme());
            sb.append("\n");
            sb.append("Prezime vlasnika: ");
            sb.append(vlasnik.getPrezime());
            sb.append("\n");
        }

        return sb.toString();

}

}
