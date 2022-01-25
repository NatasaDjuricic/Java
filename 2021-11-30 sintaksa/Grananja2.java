import java.util.Scanner;
public class Grananja2 {
    /* Grananja2: Sintaksa1 uraditi ponovo, koristeci grananja kako bismo se ogradili od nemogucih
     izracunavanja povrsina (kakvi celi brojevi moraju da budu visina, sirina i duzina?
    Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
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
if (a>0 && b>0 && c>0) {
    System.out.println("Povrsina okrecene prostorije je " + pm + " m\u00B2");
    System.out.println("Kraj programa");
}
else {
    System.out.println("Unosi moraju biti veci od 0, pokrenite ponovo program i unesite ispravan broj!");



}
    }
}


