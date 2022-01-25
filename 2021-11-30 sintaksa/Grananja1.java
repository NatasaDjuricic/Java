import java.util.Scanner;
public class Grananja1 {
    /* Grananja1: Napisati program koji proverava da li je uneti broj paran.
    Ukoliko jeste, program treba da ispise poruku: Broj je paran!
    Ukoliko nije, program treba da ispise poruku: Broj je neparan! */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Unesite neki broj: ");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("Broj je paran!");
        } else
            System.out.println("Broj je neparan!");
        System.out.println("Kraj programa!");

    }
}