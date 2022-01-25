//7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

import java.util.Scanner;


public class VezbaSedam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite mesec rodjenja: ");
        String mesec = sc.next().toLowerCase();


        System.out.print("Unesite dan rodjenja: ");
        int dan = sc.nextInt();

        switch (mesec) {

            case "mart":
                if (dan == 0 || dan > 31) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 22) {
                    System.out.println("Rodjeni ste u znaku Ribe");
                } else {
                    System.out.println("Rodjeni ste u znaku Ovna");

                }

                break;

            case "april":
                if (dan == 0 || dan > 30) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 20) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Ovan");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Bik");

                }

                break;

            case "maj":
                if (dan == 0 || dan > 31) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 21) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Bik");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Blizanci");

                }

            break;

            case "jun":
                if (dan == 0 || dan > 30) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 21) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Blizanci");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Rak");

                }

            break;

            case "jul":
                if (dan == 0 || dan > 31) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 22) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Rak");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Lav");

                }

            break;

            case "avgust":
                if (dan == 0 || dan > 31) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 23) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Lav");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Devica");

                }

            break;

            case "septembar":
                if (dan == 0 || dan > 30) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 22) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Devica");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Vaga");

                }

                break;

            case "oktobar":
                if (dan == 0 || dan > 30) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 23) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Vaga");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Skorpija");

                }

            break;

            case "novembar":
                if (dan == 0 || dan > 30) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 22) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Skorpija");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Strelac");

                }

            break;

            case "decembar":
                if (dan == 0 || dan > 31) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 21) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Strelac");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Jarac");

                }

                break;

            case "januar":
                if (dan == 0 || dan > 31) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 20) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Jarac");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Vodolija");

                }

            break;

            case "februar":

                if (dan == 0 || dan > 29) {

                    System.out.println("Uneli ste nepostojeci datum. Ponovo pokrenite program!");

                } else if (dan <= 19) {
                    System.out.println("Rodjeni ste u horoskopskom znaku Vodolija");
                } else {
                    System.out.println("Rodjeni ste u horoskopskom znaku Ribe");

                }

            break;

            default:

                System.out.println("Uneli ste nepostojeci mesec. Ponovo pokrenite program!");
        }
        System.out.println("***** Kraj programa *****");
    }
}