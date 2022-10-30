package uwm.studia.kolokwium.kol30_10_2022;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        System.out.println("Wczytuj liczby, 0 kończy wczytywanie");
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        String next = scanner.next();
        char[] chars = next.toCharArray();
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (Integer.parseInt(String.valueOf(chars[i])) == 0) {
                break;
            }
            ints[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
        int counter = 0;
        for (int anInt : ints) {
            if (anInt != 0) {
                counter++;
            }
        }
        int[] ints1 = new int[counter];
        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = ints[i];
        }

        double avg = 0;
        for (int i : ints1) {
            avg += i;
        }
        System.out.println("Średnia arytmetyczna wszystkich liczb z tablicy wynosi: " + avg / ints1.length);


    }
}
