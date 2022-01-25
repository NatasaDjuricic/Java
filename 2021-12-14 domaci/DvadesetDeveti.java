//29. -//-. Ispisati svaki treci element u obrnutom redosledu.
//Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
//29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.


package DomaciZadaci;

import java.util.Scanner;

public class DvadesetDeveti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Koliko clanova ima niz: ");
        int n = sc.nextInt();

        int[] niz = new int[n];

        System.out.println("Unesite clanove niza: ");

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        svakiTreci(niz);
    }


    public static void svakiTreci(int[] niz3) {
        System.out.println("Svaki treci element unazad: ");

        for (int i = niz3.length - 1; i >= 0; i -= 3) {

            System.out.println(niz3[i]);

        }
        System.out.println("***** Kraj programa *****");
    }
}