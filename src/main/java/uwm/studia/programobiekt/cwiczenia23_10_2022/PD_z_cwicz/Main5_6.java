package uwm.studia.programobiekt.cwiczenia23_10_2022.PD_z_cwicz;

import java.util.Arrays;

public class Main5_6 {

    public static void main(String[] args) {

        String[] tab = {"ala", "kot"};
        int mnoż = 2;
        przemnoz(tab, mnoż);
    }

    //b
    public static void przemnoz(String[] tab, int mnoz) {
        String[] tab2 = tab;
        for (int i = 0; i < mnoz; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab2[j] = (String) tab[j].concat(tab[j]).substring(tab2[j].length() , tab2[j].length());
            }
        }
//        for (String s : tab2) {
//            s.substring(0, s.length() / 10);
//        }

        System.out.println(Arrays.toString(tab2));

    }
}
