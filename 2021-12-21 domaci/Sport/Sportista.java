//sport - Napisati klasu Sportista. Sportista ima
//1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
//2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
//3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
//4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi.
//Napisati glavni program koji kreira tri igraca.
// U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.


package Sport;

public class Sportista {
    String imeIPrezime;
    String vrstaSporta;
    String klub;
    int brojNaDresu;



    public Sportista(String imeIPrezimeX, String vrstaSportaX, String klubX, int brojNaDresuX) {
        this.imeIPrezime = imeIPrezimeX;
        this.vrstaSporta = vrstaSportaX;
        this.klub = klubX;
        this.brojNaDresu = brojNaDresuX;

    }

    public String getImeIPrezime() {

        return imeIPrezime;
    }

    public String getVrstaSporta() {

        return vrstaSporta;
    }

    public String getKlub() {

        return klub;
    }

    public int getBrojNaDresu() {

        return brojNaDresu;
    }

    public void setKlub(String klub) {

        this.klub = klub;
    }

    public void setBrojNaDresu(int brojNaDresu) {

        this.brojNaDresu = brojNaDresu;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime i prezime: ");
        sb.append(imeIPrezime);
        sb.append("\n");

        sb.append("Vrsta sporta: ");
        sb.append(vrstaSporta);
        sb.append("\n");

        sb.append("Klub: ");
        sb.append(klub);
        sb.append("\n");

        sb.append("Broj na dresu: ");
        sb.append(brojNaDresu);
        sb.append("\n");
        return sb.toString();

    }
}
