/*15. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).
[Ovaj zadatak je dosta komplikovan!]
 */

import java.util.Scanner;

public class VezbaPetnaest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i =1; i<=n; i++) {
            System.out.print("Unesite " + i+". "+"broj: ");
            int n1 = sc.nextInt();
            sum = sum + n1;
        }

        System.out.println("\u03A3"+" = " +sum);
        System.out.println("***** Kraj programa *****");
        }


    }

