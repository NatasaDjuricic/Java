/*3. Faktorijel
        Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
        Faktorijel se obelezava sa znakom uzvika "!"
        i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1. Dakle, npr:
        5! = 5 * 4 * 3 * 2 * 1 = 120
        3! = 3 * 2 * 1 = 6*/

package DomaciZadaci;

import java.util.Scanner;

public class Faktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Trazimo od korisnika da unese ceo pozitivan broj
        System.out.print("Unesite ceo pozitivan broj: ");
        int n= sc.nextInt();

        // promenljivu faktorijel uvodimo jer faktorijel racunamo tako sto ga mnozimo
        // samim sobom tako sto se taj broj prilikom sledecg mnozenja umanjuje za 1
        //znaci, trazimo !5 formula ce glasiti 5*4*3*2*1
        //sto je jednako 1*2*3*4*5, tako da krecemo od 1 koju smo dodelili na promenjivoj faktorijel na pocetku
        int faktorijel = 1;

        //Ako posmatramo formulu za faktorijel naopacke (1*2*3*4*5)
        //primecujemo da je svaki sledeci cinilac za jedan veci od prethodnog
        // i da se uvecava do broja za koji trazimo faktorijel
        //Tako da koristimo for petlju
      for(int i=1;i<=n;i++){
            faktorijel=faktorijel*i;

            //Ako skinemo komentar sa sledeceg reda, mozemo da vidimo kako petlja radi
         // System.out.println("faktorijel=faktorijel*i racuna ovo kada : " + i +"." + "put obrne petlju: " + faktorijel + "*" + i);
        }

      //Ispis radimo izvan petlje kako bi nam se prikazao samo krajnji rezultat
        //ne i sve sto se vrtelo u petlji

        System.out.println("Faktorijel broja "+n+" je: "+faktorijel);

        System.out.println("***** Kraj programa *****");
    }

    }




