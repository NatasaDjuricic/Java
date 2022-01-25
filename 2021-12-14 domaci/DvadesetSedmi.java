/* 27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
Ispisati svaki drugi element tog niza
Primer: [1, 2, 3, 4, 5] -> 1 3 5
27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza. */

package DomaciZadaci;

import java.util.Scanner;

public class DvadesetSedmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Koliko clanova ima niz: ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        System.out.println("Unesite clanove niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        svakiDrugi(niz);
    }


    public static  void svakiDrugi(int [] niz1) {
        System.out.println("Svaki drugi clan niza je: ");
        for (int i = 0; i < niz1.length; i += 2) {
            System.out.println(niz1[i]);

        }
        System.out.println("***** Kraj programa *****");
    }

}