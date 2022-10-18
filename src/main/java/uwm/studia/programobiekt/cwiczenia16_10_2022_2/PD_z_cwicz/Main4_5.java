package uwm.studia.programobiekt.cwiczenia16_10_2022_2.PD_z_cwicz;

import java.util.Arrays;

public class Main4_5 {

    public static void main(String[] args) {

        int[] tab1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] tab2 = new int[tab1.length];

        for (int i = 0; i < tab1.length - 1; i++) {
            tab2[i + 1] = tab1[i];
        }
        tab2[0] = tab1[tab1.length - 1];
        System.out.println(Arrays.toString(tab2));
    }
}
