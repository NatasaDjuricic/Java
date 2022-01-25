//41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

package DomaciZadaci;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CetrdesetPrvi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj clanova niza: ");
        int n = sc.nextInt(); // Korisnik unosi broj clanova niza

        double[] niz = new double[n]; // Deklarisemo niz da je tipa double

        double suma = 0; // pocetna suma 0 nam treba da bismo dalje racunali ukupnu sumu niza u petlji

        for (int i = 0; i < niz.length; i++) {
            System.out.print(i + "-->: ");//Vrti petlju onoliko puta koliko je duzina niza,
            niz[i] = sc.nextDouble();//Posle svakog kruga korisnik upisuje broj preko skenera,
                                        //a program ga stavlja na ono mesto u nizu u kojem je krugu
                                            //prvi broj na 0. index, drugi, na 1. treci na 2. itd...
        }

        //ispisujemo prosecnu vrednost koju smo pozvali iz sumaDva metoda
        System.out.println("Prosecna vrednost niza je; " + sumaDva(niz));
        System.out.println("***** THE END *****"); // Da li se ovde program zavrsava?
    }

    //Treba da vratimo double vrednost (tip metode) koristeci podatke iz niza (parametar)
    //ONO STO MI NIJE JASNO DA LI JE OVDE TREBALO SA FOR PETLJOM DA UCITAM NIZ
    //A DA U MAINU BUDE SAMO KOLIKO CLANOVA IMA NIZ
    static double sumaDva(double[] nizDva) {

        //Racunamo sumu tako sto sabiramo svaki sledeci broj koji je korisnik ukucao
        double sumaSumaDva = 0;
        for (int i = 0; i < nizDva.length; i++) {//vrti petlju i u svakoj narednoj iteraciji dodaje
                                                    // novi unos na prethodno izracunatu sumu
            sumaSumaDva += nizDva[i];
        }
        //Konacno racunamo srednju vrednost deleci sumu niza sa brojem clanova i vracamo je u main
        double srednjaVrednost = sumaSumaDva / nizDva.length; // Ovo van petlje da bi racunao
                                                                //samo sumu iz poslednje iteracije ???
        return srednjaVrednost;
    }

}


