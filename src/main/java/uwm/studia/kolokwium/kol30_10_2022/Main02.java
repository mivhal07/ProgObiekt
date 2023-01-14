package uwm.studia.kolokwium.kol30_10_2022;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wartość całkowitą dla M");
        int M = scanner.nextInt();
        System.out.println("Wprowadź wartość całkowitą dla N");
        int N = scanner.nextInt();
        System.out.println("Wartości to: \nN = " + N + "\nM = " + M);
        int[] array = zamien(M, N);
        System.out.println("Nowe wartości to:\nM = " + array[0] + "\nN = " + array[1]);

    }

    public static int[] zamien(int M, int N) {
        int m2 = N;
        int n2 = M;
        int[] array = {m2, n2};
        return array;
    }
}
