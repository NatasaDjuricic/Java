//31. Napisati funkciju koja racuna proizvod 3 broja.

package DomaciZadaci;

public class TridesetPrvi {
    public static void main(String[] args) {

        System.out.println("p = " + proizvod(11,5,7));
    }
    public static int proizvod(int x, int y, int z){
        int proizvod = x * y *z;
        return proizvod;
    }
}
