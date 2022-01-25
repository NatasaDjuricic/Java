package PrevoznoSredstvo;

public class TestPrevoznoSredstvo {
    public static void main(String[] args) {

        //Ne moze da se napravi PrevoznoSredstvo jer je abstract--> ne postoji kao takvo,
        //vec Automobil, Autobus i Voz imaju neke zajednicke atribute ciji je nosilac ta abstraktna klasa
        //(godinaProizvodnje, zemljaPorekla, marka) u ovom slucaju

        //  PrevoznoSredstvo ps = new PrevoznoSredstvo(1987, "Japan", "Toyota");

        //Automobil am = new Automobil(2000,"Francuska", "Peugeot", "Diesel", 50);
        //Autobus ab = new Autobus(2001, "Nemacka", "Mercedes", 100);
        //Voz v = new Voz(1995, "Italija", "Super", 20);

       // ps.zvuk();--> metoda je abstract i pripada abstract klasi koja ne moze da se napravi


        //Polimorfizam --> omogucuje da u promenjive (am) osnovne klase (PrevoznoSredstvo)
        //stavljam vrednosti koje su tipa izvedene klase (new  Automobil)
        PrevoznoSredstvo am = new Automobil(2000,"Francuska", "Peugeot", "Diesel", 50);
        PrevoznoSredstvo ab = new Autobus(2001, "Nemacka", "Mercedes", 100);
        PrevoznoSredstvo v = new Voz(1995, "Italija", "Super", 20);

        am.zvuk();//poziva se zvuk ne iz PrevoznoSredstvo, vec iz Automobil --> polimorfizam,
                    //ali pristupamo poljima i metodama koje se nalaze u osnovnoj klasi
        ab.zvuk();//poziva se zvuk ne iz PrevoznoSredstvo, vec iz Autobus --> polimorfizam
        v.zvuk();//poziva se zvuk ne iz PrevoznoSredstvo, vec iz Voz --> polimorfizam


    }
}
