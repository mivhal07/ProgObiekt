package uwm.studia.kolokwium.kol30_10_2022;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Wczytaj wartość z przedziału 1, a 150 włącznie");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 1 || n > 150) {
            System.out.println("Nie poprawna wartość");
        } else {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(2218) - 1109;
            }
            int max = 0;
            for (int i : array) {
                if (i > max) {
                    max = i;
                }
            }
            int counter = 0;
            for (int i : array) {
                if (i == max) {
                    counter++;
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println("Największym elementem z tablicy jest: " + max);
            System.out.println("Występuje: " + counter + " raz/y");

        }
    }
}
