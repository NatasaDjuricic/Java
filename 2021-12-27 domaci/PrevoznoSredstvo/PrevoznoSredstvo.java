// Napisati klasu PrevoznoSredstvo sa sledecim atributima
//    godinaPoizvodnje int
//    zemljaPoizvodnje String
//    marka string
//

package PrevoznoSredstvo;

public  abstract class PrevoznoSredstvo {
    protected int godinaProizvodnje;
    protected String zemljaProizvodnje;
    protected String marka;

    public PrevoznoSredstvo(int godinaProizvodnje, String zemljaProizvodnje, String marka) {
        this.godinaProizvodnje = godinaProizvodnje;
        this.zemljaProizvodnje = zemljaProizvodnje;
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public String getZemljaProizvodnje() {
        return zemljaProizvodnje;
    }

    public String getMarka() {
        return marka;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void setZemljaProizvodnje(String zemljaProizvodnje) {
        this.zemljaProizvodnje = zemljaProizvodnje;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    // stavljanjem apstraktne klase i metode, primoravamo klase koje je nasledjuju da je implemetiraju i definisu
    //PrevoznoSredstvo nema neki odredjeni zvuk, ali Automobil, Autobus i Voz imaju
    //primorava da definisemo sta taj zvuk radi kod izvedene klase
    public abstract void zvuk ();
}