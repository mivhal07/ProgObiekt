package uwm.studia.programobiekt.cwiczenia20_11_2022.lista_1_na_cw221120;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {
    private double pojemnoscSilnika;
    private String marka;
    private static int iloscKol;

    private static void main(String[] args) {
        //tak
        Car car = new Car();
        new Car(1987,"BMW");
    }

    private Car() {
    }

    private Car(double pojemnoscSilnika, String marka) {
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.marka = marka;
    }

    public static Object CarCreate(){
        return new Car();
    }

    static Object car = CarCreate();

    public Car(int iloscKol) {
        this.iloscKol = 4;
    }

}
