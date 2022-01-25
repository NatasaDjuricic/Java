import java.util.Scanner;
public class Sintaksa1 {
    /* Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
    tako sto se ivice prostorije ucitavaju preko konzole.
    (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).*/
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Unesite visinu zida u cm: ");
        int a = scanner.nextInt();
        // a je visina zidova
        System.out.print("Unesite sirinu jednog zida u cm: ");
        int b = scanner.nextInt();
        // b je sirina jednog zida
        System.out.print("Unesite sirinu susednog zida cm: ");
        int c = scanner.nextInt();
        // c je sirina susednog zida
        int p = 2 * a * ( b +c ) + b * c;
        // p je povrsina 2 x 2 naspramna zida + povrsina plafona
        int pm = p / 100;
        //pm je povrsina okrecene prostorije u metrima

        System.out.println("Povrsina okrecene prostorije je " + pm + " m\u00B2");
        System.out.println("Kraj programa");
    }
}
