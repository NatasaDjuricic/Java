//42. Napisati funkciju koja proverava da li u nizu niski imena postoji
// "Marija" ili "Petar".

import java.util.Scanner;

public class CetrdesetDrugi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broja clanova niza: ");
        int n = sc.nextInt();//Korisnik unosi broj clanova niza

        String[] niz = new String[n];//Deklariseno niz tipa String u koji cemo smestati imena

        for (int i = 0; i < niz.length; i++) {//koristimo for petlju da bismo uneli imena

            System.out.print(i + "--> ");//Na ekranu se u svakoj iteraciji ispisuje
                                            // kojem indeksu dodeljujemo koju String vrednost

            niz[i] = sc.next(); //Korisnik pored svakog indeksa u iteraciji ispisuje neko ime
        }
        provera(niz);// pozivamo funkciju koja proverava da li nis sadrzi zadata imena
        System.out.println("***** THE END *****");
    }

    //vracamo String niz jer u main metodi iz String niza citamo clanove niza
    // kao parametar koristimo String niz jer cemo iz  niza uporedjivati Stringove sa Stringovima "Marija i "Petar"
    //DA LI SAM MOGLA NEKE DRUGI TIP PODATKA DA ISKORISTIM U METODI I PARAMETRIMA, DA VRATIM NESTO DRUGO???

    public static String[] provera(String[] niz1) {

    int postoji = 0;    //uvodim ovaj int kao neku referencu koja ce mi sluziti umesto true i false



        for (int i = 0; i < niz1.length; i++) {//idemo kroz petlju onoliko puta koliko je dugacak niz

            //proveravamo u svakoj iteraciji da li je rec istovetna sa "Marija" ili "Petar"
            if (niz1[i].equals("Marija") || niz1[i].equals("Petar")) {
                postoji++;//Ako se pojavljuje "Marija" ili "Petar" povecavamo vrednost za 1
                            // svaki put kada naidje na neko od njih
            }
        }
            if (postoji>0){ //vrednost veca od 0 znaci da je program naisao na "Marija" ili "Petar"
                System.out.println("Imena Marija i Petar postoje u nizu");
            }
            else { //U suprotnom, pvrednost postoji se nije povecala iznad 0 sto znaci da nije naisla na ta imena
                System.out.println("Imena Marija i Petar ne postoje u nizu");


        }
        return niz1;
    }
}

