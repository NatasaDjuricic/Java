//6. Ispisati proizvod prvih n celih brojeva [1, n].

import java.util.Scanner;

public class VezbaSest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ceo broj n: ");
        int n = sc.nextInt();
        int proizvod = 1;


        for (int i=1;i<=n;i++) {
            proizvod = proizvod * i;

        }
        System.out.println("Proizvod svih brojeva od 1 do " + n + " je: "+  proizvod);
        System.out.println("***** Kraj programa *****");

    }
}
