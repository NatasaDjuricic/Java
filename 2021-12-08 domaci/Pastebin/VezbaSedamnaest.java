/*17. Uneti double konstante a, b, c, a zatim i pozitivan ceo broj n.
Zatim se unose n double brojeva jedan po jedan. Cim se unese jedan od tih brojeva,
na standardni izlaz (tj. konzola) ispisuje se resenje polinoma: a*x^2 + b*x + c.
[Ovaj zadatak je dosta komplikovan!]*/

import java.util.Scanner;

public class VezbaSedamnaest {
    public static void main(String[] args) {
        final double a = 1;
        final double b = 2;
        final double c =  3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj n: ");
        double n = sc.nextDouble();
        int sum = 0;
        for(int i = 1; i<=n; i++ ){
            sum = i;
            System.out.print("Unesite " + sum + ". "+"broj" + " x: ");
            double x = sc.nextDouble();
            double p = a*Math.pow(x,2) + b*x + c;
            System.out.println("a*x^2 + b*x + c "+"= " +p);

        }
        System.out.println("***** Kraj programa *****");

    }
}
