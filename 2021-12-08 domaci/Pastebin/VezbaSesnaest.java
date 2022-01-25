/*16. Uneti pozitivan ceo broj n.
Zatim izracunati proizvod unetih narednih n brojeva (double).
[Ovaj zadatak je dosta komplikovan!]*/

import java.util.Scanner;

public class VezbaSesnaest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();
        int sum = 1;
        for(int i = 1; i<=n; i++) {
            System.out.print("Unesite "+ i+". "+"broj: ");
            int n1 = sc.nextInt();
            sum = sum*n1;
        }
        System.out.println("(x) "+"= " + sum);
        System.out.println("***** Kraj programa *****");
    }
}
