/*14. Napraviti digitron koji prima double, char, double, gde je char
neki od simbola: {+, -, *, /, %, ^} i ispisuje resenje odgovarajuce operacije.
 */

import java.util.Scanner;

public class VezbaCetrnaest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        double x = sc.nextDouble();
        System.out.print("Unesite operaciju {+, -, *, /, %, ^}: ");
        char operacija = sc.next().charAt(0);
        System.out.print("Unesite drugi broj: ");
        double y = sc.nextDouble();


        switch (operacija) {
            case '+':
                double rezultat = x+y;
                System.out.println("x"+"+"+"y"+"="+rezultat);
                break;
            case '-' :
                    rezultat = x-y;
                    System.out.println("x"+"-"+"y"+"="+rezultat);
                    break;
            case '*' :
                rezultat = x*y;
                System.out.println("x"+"*"+"y"+"="+rezultat);
                break;
            case '/' :
                if (y==0){
                    System.out.println("Ne mozete deliti nulom!");
                }
                else {
                    rezultat = x / y;
                    System.out.println("x"  + "/" + "y" + "=" + rezultat);

                }
                break;

            case '%' :
                rezultat = x%y;
                System.out.println("x"+"%"+"y"+"="+rezultat);
                break;
            case '^' :
                rezultat = Math.pow(x,y);
                System.out.println("x"+"^"+"y"+"="+rezultat);
                break;

            default :
                System.out.println("Niste ispravno uneli operaciju. Pokrenite program ponovo!");

        }


        System.out.println("***** Kraj programa *****");

    }

}
