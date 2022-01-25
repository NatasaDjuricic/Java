//30. Izracunati proizvod elemenata tog niza.
//Primer: [2, 4] -> 8

package DomaciZadaci;

import java.util.Scanner;

public class Trideseti {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Koliko clanova ima niz: ");
            int n = sc.nextInt();

            int[] niz = new int[n];

            System.out.println("Unesite clanove niza: ");

            for (int i = 0; i < niz.length; i++) {
                niz[i] = sc.nextInt();
            }
            proizvod(niz);
        }

    public static void proizvod (int[] niz5) {
        int p = 1;
        for(int i=0;i < niz5.length;i++){
            p=p*niz5[i];
        }
        System.out.println("p="+p);
        System.out.println("***** Kraj programa *****");

    }

    }


