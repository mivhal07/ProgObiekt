package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz2;

import java.util.Arrays;
import java.util.Scanner;

public class Main4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę, która określa wielkość tablicy");
        int n = scanner.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < tab.length; i++) {
            System.out.println(String.format("Wprowadź %s z %s liczb do tablicy", i + 1, tab.length));
            tab[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(tab));
    }
}
