/*Grananja3: Napisati program koji na osnovu u
nete godine i meseca ispisuje koliko taj mesec
ima dana.
(Vodite racuna o prestupnoj godini!)*/

package DomaciZadaci;

import java.util.Scanner;

public class Grananja3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite neku godinu: ");
        int godina = sc.nextInt();

        System.out.print("Unesite redni broj meseca, npr. za Januar unesite 1: ");
        int mesec = sc.nextInt();

     switch(mesec) {
         case 1 :
             System.out.println("Januar " + godina + "." + " ima 31 dan");
             break;

             case 2 :
                 if (godina % 4 == 0 && (godina % 100 != 0 || godina % 400 == 00)) {
                     System.out.println("Februar " + godina + "." + " ima 29 dan");
                 } else {
                     System.out.println("Februar " + godina + "." + " ima 28 dan");
                 }
                 break;

                 case 3 :
                     System.out.println("Mart " + godina + "." + " godine" + " ima 31 dan");
                     break;

                case 4 :
                    System.out.println("April " + godina + "." + " godine" + " ima 30 dan");
                    break;

                case 5 :
                    System.out.println("Maj " + godina + "." + " godine" + " ima 31 dan");
                    break;

                case 6 :
                    System.out.println("Jun " + godina + "." + " godine" + " ima 30 dan");
                    break;

                case 7 :
                    System.out.println("Jul " + godina + "." + " godine" + " ima 31 dan");
                    break;

                case 8 :
                    System.out.println("Avgust " + godina + "." + " godine" + " ima 31 dan");
                    break;

                case 9 :
                    System.out.println("Septembar " + godina + "." + " godine" + " ima 30 dan");
                    break;

                case 10 :
                    System.out.println("Oktobar " + godina + "." + " godine" + " ima 31 dan");
                    break;

                case 11 :
                    System.out.println("Novembar " + godina + "." + " godine" + " ima 30 dan");
                    break;
                case 12:
                    System.out.println("Decembar " + godina + "." + " godine" + " ima 31 dan");
                    break;

         default:
             System.out.println("Unesli ste nepostojeci mesec");

        }

        System.out.println("***** Kraj programa *****");




    }
}
