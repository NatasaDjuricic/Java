//11. Za unete brojeve a i b ispisati veci od njih.

import java.util.Scanner;

public class VezbaJedanaest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
        int a = sc.nextInt();

        System.out.print("Unesite broj b: ");
        int b = sc.nextInt();

        if (a>b) {
            System.out.println(a);
        }
        else if (b>a) {
            System.out.println(b);
        } else {
            System.out.println("Uneti brojevi su jednaki");
        }

        System.out.println("***** Kraj programa *****");
    }
}
