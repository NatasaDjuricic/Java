//Napisati klasu Odeljenje koja ima sledeca polja:
//	- String oznaka
//	- ArrayList dnevnik
//Napisati 2 konstruktora, opet na isti nacin.
//Napisati gettere i settere za sva polja.


package Skola;
import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();


    }

    public String getOznaka() {
        return oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }
    //Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }

    //Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
    }

    //Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }

    //Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
    public void ispisiUcenika(int redniBroj) {
        dnevnik.remove(redniBroj);
    }


    //Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
    public void pogledajOcene(Ucenik u) {
        System.out.println(u.getOcene());
    }

    //Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
    public void pogledajOcene(int redniBroj) {
        System.out.println(dnevnik.get(redniBroj).getOcene());
    }


    //Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
    public void prosecnaOcena(Ucenik u) {
        System.out.println(u.prosek());

    }

    //Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    public void prosecnaOcena(int redniBroj) {
        System.out.println(dnevnik.get(redniBroj).prosek());
    }

    //Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
    public double prosecnaOcenaOdeljenja() {
        if (dnevnik.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Ucenik ucenik : dnevnik) {
            suma = suma + ucenik.prosek();
        }
        return suma / dnevnik.size();
    }

    public void opisnaOcena(Ucenik u) {
        if (u.prosek() >= 4.5) {
            System.out.println("Odlican.");
        } else if (3.5 <= u.prosek() || u.prosek() < 4.5) {
            System.out.println("Vrlo dobar.");
        } else if (2.5 <= u.prosek() || u.prosek() < 3.5) {
            System.out.println("Dobar.");
        } else if (1.5 <= u.prosek() || u.prosek() < 2.5) {
            System.out.println("Dovoljan.");
        } else if (u.prosek() >= 1) {
            System.out.println("Nedovoljan.");
        }
    }

    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();
        for (Ucenik ucenik : dnevnik) {
            sb.append(ucenik.getIme());
            sb.append(" ");
            sb.append(ucenik.getPrezime());
            sb.append(" ima ocene: ");
            sb.append(ucenik.getOcene());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String velicinaOdeljenja() {

        String velicinaOdeljenja = "";
        if (dnevnik.size() > 25) {
            velicinaOdeljenja = "Veliko odeljenje";
        } else if (dnevnik.size() < 15 || dnevnik.size() < 25) {
            velicinaOdeljenja = "Srednje odeljenje";
        } else if (dnevnik.size() < 15) {
            velicinaOdeljenja = "Malo odeljenje";
        }

        return velicinaOdeljenja;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append(" odeljenje ima sledece ucenike: \n");
        for (Ucenik ucenik : dnevnik) {
            sb.append(ucenik.getIme());
            sb.append(" ");
            sb.append(ucenik.getPrezime());
            sb.append("\n");
        }
        return sb.toString();
    }

}








