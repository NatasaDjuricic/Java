//3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.

import java.util.Scanner;

public class VezbaTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite neki ceo broj: ");
        int n = sc.nextInt();

        for (int i=1; i<=n+1; i++) {

            System.out.println(i-1);

        }
        System.out.println("***** Kraja programa *****");

    }
}
