//5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.

import java.util.Scanner;

public class VezbaPet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ceo pozitivan broj: ");
        int n = sc.nextInt();


        for (int i=-14; i<=2*n; i++) {
            System.out.println(i);

        }
        System.out.println("***** Kraj programa *****");
    }
}

