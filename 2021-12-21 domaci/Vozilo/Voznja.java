package Vozilo;

import java.util.Scanner;

public class Voznja {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //prvi automobil
        System.out.print("Unesite marku prvog automobila: ");
        String markaPrvogAuta = sc.next();

        System.out.print("Unesite model prvog automobila: ");
        String modelPrvogAuta = sc.next();

        System.out.print("Unesite serijski broj prvog automobila: ");
        int sBrojPrvogAuta = sc.nextInt();

        System.out.println();

        Automobil prviAutomobil = new Automobil(markaPrvogAuta, modelPrvogAuta, sBrojPrvogAuta);

        //drugi automobil
        System.out.print("Unesite marku drugog automobila: ");
        String markaDrugogAuta = sc.next();

        System.out.print("Unesite model drugog automobila: ");
        String modelDrugogAuta = sc.next();

        System.out.print("Unesite serijski broj drugog automobila: ");
        int SBrojDrugogAuta = sc.nextInt();

        System.out.println("****************************************");
        Automobil drugiAutomobil = new Automobil(markaDrugogAuta, modelDrugogAuta, SBrojDrugogAuta, new OsobaAutomobil("Pera", "Peric"));
        System.out.println("Podaci o prvom automobilu");
        System.out.println(prviAutomobil);
        System.out.println();
        System.out.println("Podaci o drugom automobilu");;
        System.out.println(drugiAutomobil);

    }


    }


