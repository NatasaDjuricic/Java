package Skola;

import java.util.ArrayList;
public class TestSkola {
    public static void main(String[] args) {

        ArrayList<Integer> o1 = new ArrayList<>();
        o1.add(5);
        o1.add(3);
        o1.add(3);


        ArrayList<Integer> o2 = new ArrayList<>();
        o2.add(5);
        o2.add(5);
        o2.add(5);
        o2.add(5);
        o2.add(5);

        ArrayList<Integer> o3 = new ArrayList<>();
        o3.add(5);
        o3.add(2);
        o3.add(3);
        o3.add(3);
        o3.add(5);

        Ucenik u1 = new Ucenik("Nata", "Natic", o1);
        Ucenik u2 = new Ucenik("Pera", "Peric", o2);
        Ucenik u3 = new Ucenik("Mika", "Mikic", o3);
        Ucenik u4 = new Ucenik("Jova", "Jovic", o2);
        Ucenik u5 = new Ucenik("Zika", "Zikic", o2);

        ArrayList<Ucenik> dnevnik1= new ArrayList<>();
        dnevnik1.add(0, u1);
        dnevnik1.add(1, u2);

        ArrayList<Ucenik> dnevnik2= new ArrayList<>();
        dnevnik2.add(0, u3);
        dnevnik2.add(1, u4);

        Odeljenje I9 = new Odeljenje("I9", dnevnik1);
        System.out.println(I9);

        Odeljenje I10 = new Odeljenje("I10", dnevnik2);
        System.out.println(I10);

        dnevnik2.add(2, u5);
        dnevnik2.remove(0);

        System.out.println(I10);



        System.out.println("Ocene ucenika u1: ");
        I9.pogledajOcene(u1);

        System.out.println("Prosecna ocena u2: ");
        I9.prosecnaOcena(u2);

        System.out.println("Prosecna ocena odeljenja: ");
        System.out.println(I9.prosecnaOcenaOdeljenja());

        System.out.print("Opisna ocena u1: ");
        I9.opisnaOcena(u1);

        System.out.println("Svi zapisi u dnevniku: ");
        System.out.println(I9.izlistajDnevnik());

        System.out.println("Velicina odeljenja: ");
        System.out.println(I9.velicinaOdeljenja());


    }
}

