package PrevoznoSredstvo;

public class Autobus extends PrevoznoSredstvo {
    int maksimalanBrojPutnika;

    public Autobus(int godinaProizvodnje, String zemljaProizvodnje, String marka, int maksimalanBrojPutnika) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
        this.maksimalanBrojPutnika = maksimalanBrojPutnika;
    }

    public int getMaksimalanBrojPutnika() {
        return maksimalanBrojPutnika;
    }

    public void setMaksimalanBrojPutnika(int maksimalanBrojPutnika) {
        this.maksimalanBrojPutnika = maksimalanBrojPutnika;
    }

    public void zvuk(){
        System.out.println("dum dum");
    }
}
