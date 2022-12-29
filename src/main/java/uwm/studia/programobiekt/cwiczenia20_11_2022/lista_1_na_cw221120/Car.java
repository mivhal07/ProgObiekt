package uwm.studia.programobiekt.cwiczenia20_11_2022.lista_1_na_cw221120;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {
    static Object car = CarCreate();
    private double pojemnoscSilnika;
    private String marka;
    private int iloscKol = 4;

    public Car() {
    }

    private Car(double pojemnoscSilnika, String marka) {
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.marka = marka;
    }

    public static Object CarCreate() {
        return new Car();
    }

    public static void main(String[] args) {
        Car car = new Car();
        new Car(1987, "BMW");
        System.out.println(car.getIloscKol());
    }

    public int getIloscKol() {
        return iloscKol;
    }
}
