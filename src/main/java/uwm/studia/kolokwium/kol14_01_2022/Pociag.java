package uwm.studia.kolokwium.kol14_01_2022;

public class Pociag extends SrodekLokomocji {
    private int dlugoscTrasy;

    @Override
    public void obliczCene() {
        if (this.dlugoscTrasy > 100) {
            this.cenaBiletu = dlugoscTrasy * 1.42;
        } else {
            try {
                obliczCene();
            } catch (StackOverflowError e) {
                e.getMessage();
            }
        }
    }

    public Pociag(int iloscMiejsc, int dlugoscTrasy) {
        this.iloscMiejsc = iloscMiejsc;
        this.dlugoscTrasy = dlugoscTrasy;
        obliczCene();
    }

    @Override
    public String toString() {
        return "Pociag{" +
                "dlugoscTrasy=" + dlugoscTrasy +
                ", iloscMiejsc=" + iloscMiejsc +
                ", cenaBiletu=" + cenaBiletu +
                '}';
    }
}
