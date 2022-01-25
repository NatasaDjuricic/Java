/*1.[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetg broja n.
Dupli faktorijel broja n je:
n!! = n * (n-2) * (n-4) * ... * (2 ili 1)*/

package DomaciZadaci;

import java.util.Scanner;

public class DupliFaktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();

        int dFaktorijel = 1;

        for (int i = n; i>=1; i -=2)
        {
            dFaktorijel = dFaktorijel * i;

        }
        System.out.println(n+"!!" + "="+dFaktorijel);
        System.out.println("***** Kraj programa *****");
    }
}