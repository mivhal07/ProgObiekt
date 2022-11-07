package uwm.studia.programobiekt.cwiczenia06_11_2022;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Punkt {
    @Getter
    @Setter
    private int x = 3;
    @Getter
    @Setter
    private int[] x2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    @Getter
    @Setter
    private int y = 13;
    @Getter
    @Setter
    private int[] y2 = {9, 1, 8, 2, 7, 3, 6, 4, 5};
}

