package uwm.studia.programobiekt.cwiczenia16_10_2022_2.PD_z_cwicz;

import java.util.Scanner;

public class Main4_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                counter++;
            }
        }
        System.out.println("Ilość słów we wprowadzonym zdaniu to: " + (counter + 1));
    }
}
