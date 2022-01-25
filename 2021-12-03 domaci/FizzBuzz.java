/*2. FizzBuzz
Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno sa n nisku
"Fizz" ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5,
a nisku "FizzBuzz" ako je on deljiv i sa 3 i sa 5.*/

package DomaciZadaci;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        // Trazimo od korisnika da pomocu skenera unese broj
        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite neki celi nenegativni broj: ");

        int n = sc.nextInt();

        // Pravimo petlju koja ce da se ispisuje i povecava za 1 dok god ne dodjemo do broja koji je korisnik uneo
        for (int i = 1; i <= n; i++) {

            // Pravimo if grananje
            //Prvi uslov da je broj deljiv sa 15
            if (i % 15 == 0) {
                System.out.println(i + ":" + "FizzBuzz");
            }
            //ako nije deljiv sa 15, program nastavlja dalje i proverava da li je broj deljiv sa 5
            else if(i % 5 == 0) {
                System.out.println(i + ":" + "Buzz");
            }
            //ako nije deljiv ni sa 15 ni sa 5, proverava da li je deljiv sa 3
            else if(i % 3 == 0) {
                System.out.println(i + ":" + "Fuzz");
            }
            //ako nije deljiv sa 15,5 i 3 ispisuje samo i
            else {
                System.out.println(i + ":");


            }

        }
        System.out.println("***** Kraj programa *****");
        }

    }