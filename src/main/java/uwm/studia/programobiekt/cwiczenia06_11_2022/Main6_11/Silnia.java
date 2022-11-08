package uwm.studia.programobiekt.cwiczenia06_11_2022.Main6_11;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Silnia {
    private int liczba;

    public double obliczSilnia() {
        int result = 1;
        for (int j = 1; j <= liczba; j++) {
            result *= j;
        }
        return result;
    }
}
