package uwm.studia.programobiekt.cwiczenia06_11_2022.lista_na_cw221106;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String marka;
    private int rok;
    private String model;
    private int iloscDrzwi;
    private int pojemnoscSilnika;
    public double spalanie;

    public void setRok(int rok) {
        if (rok < 1769 || rok > 2017) {
            System.out.println("A auto to Faraona czy już samo lata?");
        } else {
            this.rok = rok;
        }
    }
}
