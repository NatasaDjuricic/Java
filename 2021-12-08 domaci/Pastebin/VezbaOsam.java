/* 8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
	"Dobrodosao u {x}. razred, {ime} {prezime}",
	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda.
	A ako korisnik nije djak ispisati jednu odgovarajucu
    poruku od:
	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"*/

import java.util.Scanner;

public class VezbaOsam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite svoje ime: ");
        String ime = sc.next();

        System.out.print("Unesite svoje prezime: ");
        String prezime = sc.next();

        System.out.print("Unesite svoju godinu rodjenja: ");
        int gRodjenja = sc.nextInt();

        int razred = 2021-gRodjenja-6;


        if (razred < 1) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje");
        } else if ( razred > 12) {
            System.out.println(ime + " " + prezime + " je zavrsio/la skolu");
        } else {
            System.out.println("Dobrodosao/la u " + razred + "." + " razred, " +  ime + " " + prezime);
        }
        System.out.println("***** Kraj programa *****");
    }
}