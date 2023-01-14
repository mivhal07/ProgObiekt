package uwm.studia.programobiekt.cwiczenia23_10_2022.PD_z_cwicz;

import java.util.Arrays;

public class Main5_4 {

    public static void main(String[] args) {

        int[] tab = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int mnoż = 3;
        System.out.println(Arrays.toString(przemn(tab, mnoż)));
        przemnoz(tab, mnoż);
    }


    public static int[] przemn(int[] tab, int mnoz) {
        int[] result = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            result[i] = tab[i] * mnoz;
        }
        return result;
    }

    //b
    public static void przemnoz(int[] tab, int mnoz) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] *= mnoz;
        }
        System.out.println(Arrays.toString(tab));
    }
}
