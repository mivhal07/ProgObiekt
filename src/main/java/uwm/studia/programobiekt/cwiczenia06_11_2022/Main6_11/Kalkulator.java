package uwm.studia.programobiekt.cwiczenia06_11_2022.Main6_11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Kalkulator {
    private double liczba1;
    private double liczba2;

    public double dodawanie() {
        return liczba1 + liczba2;
    }

    public double odejmowanie() {
        return liczba1 - liczba2;
    }

    public double mnożenie() {
        return liczba1 * liczba2;
    }

    public double dzielenie() {
        return liczba1 / liczba2;
    }

    public double pierwiastek() {
        return Math.sqrt(liczba1);
    }

    public double potęgowanie() {
        return Math.pow(liczba1, liczba2);
    }
}
