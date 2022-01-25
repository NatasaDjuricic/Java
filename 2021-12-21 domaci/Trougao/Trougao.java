//Klasa trougao ima 3 polja koji predstavljaju stranice:
// stranicaA, stranicaB, stranicaC. Vrednost stranica je tipa double.
// Napisati konstruktor, getter i setter metode za sve stranice i metode za racunanje obima i povrsine.

package Trougao;

public class Trougao {
    double stranicaA;
    double stranicaB;
    double stranicaC;


    public Trougao(double stranicaA, double stranicaB, double stranicaC) {
        if((stranicaA+stranicaB)>stranicaC && (stranicaA+stranicaC)>stranicaB && (stranicaB+stranicaC)>stranicaA) {
            this.stranicaA = stranicaA;
            this.stranicaB = stranicaB;
            this.stranicaC = stranicaC;
        }
        else {
            System.out.println("Nisu unesene dobre stranice.!");
        }
        }


    public double getStranicaA() {
        return stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaA(double stranicaA) {
        if((stranicaA+stranicaB)>stranicaC && (stranicaA+stranicaC)>stranicaB && (stranicaB+stranicaC)>stranicaA) {
            this.stranicaA = stranicaA;
        }
        else {
            System.out.println("Nisu unesene dobre stranice.!");
        }
    }


    public void setStranicaB(double stranicaB) {
        if((stranicaA+stranicaB)>stranicaC && (stranicaA+stranicaC)>stranicaB && (stranicaB+stranicaC)>stranicaA) {
            this.stranicaB = stranicaB;
        }
        else {
                System.out.println("Nisu unesene dobre stranice.!");
            }
    }

    public void setStranicaC(double stranicaC) {
        if((stranicaA+stranicaB)>stranicaC && (stranicaA+stranicaC)>stranicaB && (stranicaB+stranicaC)>stranicaA) {
            this.stranicaC = stranicaC;
        }
        else {
            System.out.println("Nisu unesene dobre stranice!");
        }
    }


    public double Obim() {
        double o = stranicaA + stranicaB + stranicaC;
        return o;
    }

    public double Povrsina() {

        double s = (stranicaA + stranicaB + stranicaC) / 2;
        double p = Math.sqrt(s * (s - stranicaA) * (s - stranicaB) * (s - stranicaC));
        return p;

    }
}

