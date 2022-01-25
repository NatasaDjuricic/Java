//1) Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
// pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom)
// i da li je iz Srbije odgovorite preko booleana.
// Sve potrebno za glumca i glumicu da budu dva ispisa (edited)

package Glumci;

public class Glumac {
    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean daLiIzSrbije;

    public Glumac(String ime, String prezime, char pol, int godine, double ocena, boolean daLiIzSrbije) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.daLiIzSrbije = daLiIzSrbije;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public char getPol() {
        return pol;
    }

    public int getGodine() {
        return godine;
    }

    public double getOcena() {
        return ocena;
    }

    public boolean isDaLiIzSrbije() {
        return daLiIzSrbije;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public void setDaLiIzSrbije(boolean daLiIzSrbije) {
        this.daLiIzSrbije = daLiIzSrbije;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ");
        sb.append(ime + "\n");
        sb.append("Prezime: ");
        sb.append(prezime + "\n");
        sb.append("Pol: ");
        sb.append(pol + "\n");
        sb.append("Godine: ");
        sb.append(godine+"\n");
        sb.append("Ocena: ");
        sb.append(ocena+"\n");
        sb.append("Da li je iz Srbije: ");
        sb.append(daLiIzSrbije + "\n");
        return sb.toString();
    }
}
