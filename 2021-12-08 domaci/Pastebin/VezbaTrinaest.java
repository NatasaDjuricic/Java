/*13. Ispisati tablicu mnozemnja jednocifrenih brojeva
(dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)
 */

public class VezbaTrinaest {
    public static void main(String[] args) {

       /* System.out.println(" x "+" 0 " + " 1 " + " 2 " + " 3 " + " 4 " + " 5 " + " 6 " + " 7 " + " 8 " + " 9 ");
        System.out.println(" 0 " + " 0 " + " 0 " + " 0 " + " 0 " + " 0 " + " 0 " + " 0 " + " 0 " + " 0 " + " 0 ");
        System.out.println(" 1 " + " 0 " + " 1 " + " 2 " + " 3 " + " 4 " + " 5 " + " 6 " + " 7 " + " 8 " + " 9 ");
        System.out.println(" 2 " + " 0 " + " 2 " + " 4 " + " 6 " + " 8 " + "10" + " 12" + " 14" + " 16" + " 18");
        System.out.println(" 3 " + " 0 " + " 3 " + " 6 " + " 9 " + "12" + " 15" + " 18" + " 21" + " 24" + " 27");
        System.out.println(" 4 " + " 0 " + " 4 " + " 8 " + "12" + " 16" + " 20" + " 24" + " 28" + " 32" + " 36");
        System.out.println(" 5 " + " 0 " + " 5 " + "10" + " 15" + " 20" + " 25" + " 30" + " 35" + " 40" + " 45");
        System.out.println(" 6 " + " 0 " + " 6 " + "12" + " 18" + " 24" + " 30" + " 36" + " 42" + " 48" + " 54");
        System.out.println(" 7 " + " 0 " + " 7 " + "14" + " 21" + " 28" + " 35" + " 42" + " 49" + " 56" + " 63");
        System.out.println(" 8 " + " 0 " + " 8 " + "16" + " 24" + " 32" + " 40" + " 48" + " 56" + " 64" + " 72");
        System.out.println(" 9 " + " 0 " + " 9 " + "18" + " 27" + " 36" + " 45" + " 54" + " 63" + " 72" + " 81");
        System.out.println("*****Kraj programa *****");*/
//Treba da se koristi for petlja!!!
        int sum = 0;
        System.out.print("X  ");

        for (int i = 0; i <= 9; i++) {

            System.out.print((sum + i + "  "));
        }

        int s = 20;

            System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.print(sum * i + "  ");
        }


            System.out.println();
            System.out.print("1  ");

        for (int i = 0; i <= 9; i++) {

            System.out.print((sum + i + "  "));
        }

            System.out.println();
            System.out.print("2  ");

        for (int i = 0; i <= 9; i++) {
            if (sum+2*i <=7) {
                System.out.print((sum + 2 * i + "  "));
            }
                else  {
                    System.out.print(sum + 2 * i +" ");
                }
            }

            System.out.println();
            System.out.print("3  ");

        for (int i = 0; i <= 9; i++) {
            if (sum+3*i <=6) {
                System.out.print((sum + 3 * i + "  "));
            }
            else  {
                System.out.print(sum + 3 * i +" ");
            }
        }

            System.out.println();
            System.out.print("4  ");

        for (int i = 0; i <= 9; i++) {
            if (sum+4*i <=5) {
                System.out.print((sum + 4 * i + "  "));
            }
            else  {
                System.out.print(sum + 4* i +" ");
            }
        }


            System.out.println();
            System.out.print("5  ");

        for (int i = 0; i <= 9; i++) {
            if (sum+5*i <=4) {
                System.out.print((sum + 5 * i + "  "));
            }
            else  {
                System.out.print(sum + 5 * i +" ");
            }
        }

            System.out.println();
            System.out.print("6  ");

        for (int i = 0; i <= 9; i++) {
            if (sum+6*i <=5) {
                System.out.print((sum + 6 * i + "  "));
            }
            else  {
                System.out.print(sum + 6 * i +" ");
            }
        }

            System.out.println();
            System.out.print("7  ");

        for (int i = 0; i <= 9; i++) {
            if (sum+7*i <=6) {
                System.out.print((sum + 7 * i + "  "));
            }
            else  {
                System.out.print(sum + 7 * i +" ");
            }
        }

            System.out.println();
            System.out.print("8  ");

        for (int i = 0; i <= 9; i++) {
            if (sum+8*i <=7) {
                System.out.print((sum + 8 * i + "  "));
            }
            else  {
                System.out.print(sum + 8 * i +" ");
            }
        }

            System.out.println();
            System.out.print("9  ");

        for (int i = 0; i <= 9; i++) {
            if (sum+9*i <=8) {
                System.out.print((sum + 9 * i + "  "));
            }
            else  {
                System.out.print(sum + 9 * i +" ");
            }
        }
        System.out.println();
        System.out.println("***** Kraj programa *****");
        }
    }










