package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz2;

import java.util.Arrays;

public class Main4_6 {

    public static void main(String[] args) {

        double suma = 0;
        double[][] tab = {{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9},
                {11, 22, 33, 44, 55}, {66, 77, 88, 99, 111}, {222, 333, 444, 555, 666}};
        for (double[] doubles : tab) {
            System.out.println(Arrays.toString(doubles));
        }
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i][i];
        }
        System.out.println(suma);
    }
}
