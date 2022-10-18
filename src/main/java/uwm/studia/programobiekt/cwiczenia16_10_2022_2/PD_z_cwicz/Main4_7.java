package uwm.studia.programobiekt.cwiczenia16_10_2022_2.PD_z_cwicz;

import java.util.Arrays;

public class Main4_7 {

    public static void main(String[] args) {

        int[][] tab1 = {{0, 1, 2}, {3, 4, 5}};
        int[][] tab2 = {{6, 7, 8}, {9, 10, 11}};
        int[][] tabResult = new int[tab1.length][tab1[0].length];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                tabResult[i][j] = tab1[i][j] + tab2[i][j];
            }
        }
        for (int[] ints : tabResult) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
