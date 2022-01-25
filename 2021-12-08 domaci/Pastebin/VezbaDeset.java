/*10. Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
koji je strogo manji od njega (dakle t < n), sumu svih pozitivnih celih brojeva od 1 do tog broja
(dakle 1 + 2 + 3 + ... + t). [Ovaj zadatak je dosta komplikovan!]*/

import java.util.Scanner;

public class VezbaDeset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("[1," + i + "]" +" "+ (sum = sum + i));

        }
        // Ovaj ispis stavljam van scopa for petlje da mi ne bi vrtelo i tu liniju svaki put
        //kad obrne petlju

        System.out.println("***** Kraj programa *****");
    }
}
