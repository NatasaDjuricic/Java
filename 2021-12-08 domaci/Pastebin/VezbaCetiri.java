//4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

import java.util.Scanner;

public class VezbaCetiri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ceo negativan broj: ");
        int n = sc.nextInt();


        for (int i=n; i<=0; i++) {
            System.out.println(i);

        }
        System.out.println("***** Kraj programa *****");
    }
}
