package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main4_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj najpierw ilość elementów w tablicy");
        int n = scanner.nextInt();
        Integer[] tab = new Integer[n];
        for (int i = 0; i < tab.length; i++) {
            System.out.println(String.format("Wprowadź %s z %s liczb do tablicy", i + 1, tab.length));
            tab[i] = scanner.nextInt();
        }
        System.out.println("Maksymalna wartość w tablicy to: " + maxValue(tab) + " i jej indeks to: " + maxIndex(tab));
        System.out.print("Minimalna wartość w tablicy to: " + minValue(tab) + " i jej indeks to: ");
        minIndex(tab);
        System.out.println("Średnia wartość wszystkich elementów to: " + avarenge(tab));
        System.out.println("Ilość elementów dodatnich to: " + allOver0(tab));
    }

    public static int minValue(Integer[] tab) {
        int min = tab[0];
        for (int i = tab.length - 1; i >= 0; i--) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public static int maxValue(Integer[] tab) {
        int max = tab[0];
        for (int j : tab) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int maxIndex(Integer[] array) {
        int maxAt = 0;
        for (int i = 0; i < array.length; i++) {
            maxAt = array[i] > array[maxAt] ? i : maxAt;
        }
        return maxAt;
    }

    public static void minIndex(Integer[] array) {
        List<Integer> iList = Arrays.asList(array);
        System.out.println(iList.indexOf(Collections.min(iList)));
    }

    public static double avarenge(Integer[] tab) {
        double avg = 0;
        double result = 0;
        for (int i = 0; i < tab.length; i++) {
            avg += tab[i];
        }
        result = avg / tab.length;
        return result;
    }

    public static int allOver0(Integer[] tab) {
        int counter = 0;
        for (int i : tab) {
            if (i > 0) {
                counter++;
            }
        }
        return counter;
    }
}
