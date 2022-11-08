package uwm.studia.programobiekt.cwiczenia06_11_2022.Main6_11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BMI {
    private double waga;
    private double wzrost;

    public double obliczBMI() {
        return waga / Math.pow(wzrost, 2);
    }
}
