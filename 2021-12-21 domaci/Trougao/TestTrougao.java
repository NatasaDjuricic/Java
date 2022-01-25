package Trougao;

import java.util.Scanner;

public class TestTrougao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Unesite stranicu A: ");
        double stranicaA = sc.nextDouble();

        System.out.print("Unesite stranicu B: ");
        double stranicaB = sc.nextDouble();

        System.out.print("Unesite stranicu C: ");
        double stranicaC = sc.nextDouble();

        Trougao trougao1 = new Trougao(stranicaA, stranicaB, stranicaC);

        System.out.println("▲ A = " + trougao1.getStranicaA());
        System.out.println("▲ B = " + trougao1.getStranicaB());
        System.out.println("▲ C = " + trougao1.getStranicaC());
        System.out.println("O ▲ = " + trougao1.Obim());
        System.out.println("P ▲ = " + trougao1.Povrsina());



    }
}
