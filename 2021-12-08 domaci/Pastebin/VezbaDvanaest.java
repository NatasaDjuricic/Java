//12. Za unete brojeve a, b i c ispisati najmanji od njih

import java.util.Scanner;

public class VezbaDvanaest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj a: ");
        int a = sc.nextInt();

        System.out.print("Unesite broj b: ");
        int b = sc.nextInt();

        System.out.print("Unesite broj c: ");
        int c = sc.nextInt();

                if (a<b && b<c) {  //ako je a<b i b<c onda je i a<c
                    System.out.println(a);
                }
                //ako je u prvom uslovu a manje od b i c,
                // program nece nastaviti dalje tako da nam na ovoj liniji ostaju samo b i c
                else if (b<c) {
                    System.out.println(b);
                }
                //ako je a najmanje program ce se ispuniti u prvom uslovu,
                // ako je b najmanje u drugom uslovu, tako da nam ovde ostaje samo c < b i a
                else {
                    System.out.println(c);
                }

        System.out.println("***** Kraj programa *****");
    }
}
