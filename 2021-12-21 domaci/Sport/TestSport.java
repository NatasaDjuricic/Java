package Sport;

import java.util.Scanner;

public class TestSport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite ime i prezime igraca: ");
        String imeiPrezime1 = sc.next(); // Moram da koristim sc.next() umesto sc.nextLine() i da kucam spojeno
                                            // jer mi sa sc.nextLine() ne cita dobro redove koji su na redu za iscitavanje


        System.out.print("Unesite sport kojim se bavi: ");
        String vrstaSporta1 = sc.next();

        System.out.print("Unesite klub za koji igra: ");
        String klub1 = sc.next();


        System.out.print("Unesite broj na dresu: ");
        int brojnaDresu1 = sc.nextInt();


                Sportista prviIgrac = new Sportista(imeiPrezime1, vrstaSporta1, klub1, brojnaDresu1);

        System.out.println("****************************************");

        System.out.print("Unesite ime i prezime igraca: ");
        String imeiPrezime2 = sc.next();


        System.out.print("Unesite sport kojim se bavi: ");
        String vrstaSporta2 = sc.next();


        System.out.print("Unesite klub za koji igra: ");
        String klub2 = sc.next();


        System.out.print("Unesite broj na dresu: ");
        int brojnaDresu2 = sc.nextInt();


        Sportista drugiIgrac = new Sportista(imeiPrezime2, vrstaSporta2, klub2, brojnaDresu2);

        Sportista treciIgrac = new Sportista("Pera Peric", "Hokej", "Mladost", 11);
        System.out.println("IGRAC 1");
     /*   System.out.println("Ime i prezime: "+ prviIgrac.getImeIPrezime());
        System.out.println("Vrsta sporta: " + prviIgrac.getVrstaSporta());
        System.out.println("Klub: " + prviIgrac.getKlub());
        System.out.println("Broj na dresu: " + prviIgrac.getBrojNaDresu());
        prviIgrac.setBrojNaDresu(15);
        System.out.println("Broj na dresu: " + prviIgrac.getBrojNaDresu());*/
        System.out.println(prviIgrac);
        System.out.println("*******************************************");


        System.out.println("IGRAC 2");
      /*  System.out.println("Ime i prezime: "+ drugiIgrac.getImeIPrezime());
        System.out.println("Vrsta sporta: " + drugiIgrac.getVrstaSporta());
        System.out.println("Klub: " + drugiIgrac.getKlub());
        drugiIgrac.setKlub("Mladost");
        System.out.println("Klub: " + drugiIgrac.getKlub());
        System.out.println("Broj na dresu: " + drugiIgrac.getBrojNaDresu());*/
        System.out.println(drugiIgrac);

        System.out.println("IGRAC 3");
      /*  System.out.println("Ime i prezime: "+ drugiIgrac.getImeIPrezime());
        System.out.println("Vrsta sporta: " + drugiIgrac.getVrstaSporta());
        System.out.println("Klub: " + drugiIgrac.getKlub());
        drugiIgrac.setKlub("Mladost");
        System.out.println("Klub: " + drugiIgrac.getKlub());
        System.out.println("Broj na dresu: " + drugiIgrac.getBrojNaDresu());*/
        System.out.println(treciIgrac);


    }
}
