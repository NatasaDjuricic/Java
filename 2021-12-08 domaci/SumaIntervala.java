//2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].


package DomaciZadaci;

import java.util.Scanner;

public class SumaIntervala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj m: ");
        int m = sc.nextInt();

        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();
        int sum = 0;
        if (m <= n) {


            for (int i = m; i <= n; i++) {
                sum = sum + i;



            }
        }
        else {
                System.out.println("'m' mora biti manje od 'n'. Ponovo pokrenite program!");
            }
        System.out.println("\u03A3" + "[" + m + "," + n + "}" + "=" + sum);
            System.out.println("***** Kraj programa ******");
        }
    }

