package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz2;

import java.util.Scanner;

public class Main4_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        char[] chars = scanner.nextLine().toCharArray();
        for (char aChar : chars) {
            for (int i = 0; i < chars.length; i++) {
                if (aChar == chars[i]) {
                    counter++;
                    String s = String.valueOf(aChar);
                    s.replace(aChar,' ');
                }
            }
            System.out.println(aChar + " - " + counter + ", ");
            counter = 0;
        }
    }
}
