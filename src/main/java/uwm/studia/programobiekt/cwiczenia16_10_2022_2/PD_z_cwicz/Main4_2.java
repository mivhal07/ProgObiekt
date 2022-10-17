package uwm.studia.programobiekt.cwiczenia16_10_2022_2.PD_z_cwicz;

import java.util.Arrays;

public class Main4_2 {

    public static void main(String[] args) {

        int[] tab1 = {0, 1, 2, 3, -4, 5, 6, -7, 8, 9};
        int[] tab2 = new int[10];
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] < 0) {

            } else {
                tab2[i] = tab1[i];
            }
        }
        System.out.println(Arrays.toString(tab2));
    }
}
