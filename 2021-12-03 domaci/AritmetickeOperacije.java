/*1. Aritmeticke opracije
Na standardni ulaz se unose dva cela broja.
Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku, proizvod, kolicnik
i ostatak deljenja prvog broja drugim
tim redom.*/



package DomaciZadaci;

import java.util.Scanner;

public class AritmetickeOperacije {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Pocetak programa*****");

        //Trazimo od korisnika da unese prvi broj
        System.out.print("Unesite prvi broj: ");
        int prviBroj = sc.nextInt();

        // Trazimo od korisnika da unese drugi broj
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = sc.nextInt();

        //Racunamo i ispisujemo operacije sabiranja, oduzimanja deljenja
        System.out.println("Zbir ova dva broja je: " + (prviBroj + drugiBroj));
        System.out.println("Razlika ova dva broja je: " + (prviBroj - drugiBroj));
        System.out.println("Proizvod ova dva broja je: " + (prviBroj * drugiBroj));


        //Otvaramo petlju za operaciju deljenja i celebrojnog deljenja da proverimo da li je drugi broj 0
        if (drugiBroj == 0) {
            System.out.println("Za operacije deljenja i celobrojnog deljenja delilac ne sme biti 0");

            // Ukoliko je drugiBroj 0 program ovde staje, a ukoliko nije prelazi na else
        } else {
            System.out.println("Kolicnik ova dva broja je: " + ((double) prviBroj) / drugiBroj);
            System.out.println("Modulo ova dva broja je: " + (prviBroj % drugiBroj));

        }
        // Ovde stavljam kraj programa jer, u slucaju da je drugiBroj 0, program ne bi ispisao ovu liniju
        System.out.println("***** Kraj programa *****");
    }
}
