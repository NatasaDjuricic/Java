//1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

import java.util.Scanner;

public class VezbaJedan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");
        int n = sc.nextInt();
        if (n % 2 == 0 ) {
            System.out.println("Paran");
        }
        else {
            System.out.println("Neparan");

            System.out.println("***** Kraj programa *****");
        }
    }
}
