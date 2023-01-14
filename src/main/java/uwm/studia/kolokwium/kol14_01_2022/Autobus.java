package uwm.studia.kolokwium.kol14_01_2022;

public class Autobus extends SrodekLokomocji{

    public Autobus(int miejsca) {
        this.iloscMiejsc=miejsca;
        obliczCene();
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "iloscMiejsc=" + iloscMiejsc +
                ", cenaBiletu=" + cenaBiletu +
                '}';
    }
}
