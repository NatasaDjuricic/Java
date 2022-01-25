/*3.[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole.
Na standardni izlaz ispisati resenje izraza:
1 - 2 + 3 - .... (+/-) n.*/

package DomaciZadaci;

import java.util.Scanner;

public class NaizmenicnaSuma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();
        int sum = 0;




        for (int i = 0; i <= n; i ++) {
            if (i % 2 == 0) {
                sum = sum-i;
            }
            else {
                sum = sum+i;
            }
        }
        System.out.println(sum);

        System.out.println("***** Kraj programa *****");
    }
}




