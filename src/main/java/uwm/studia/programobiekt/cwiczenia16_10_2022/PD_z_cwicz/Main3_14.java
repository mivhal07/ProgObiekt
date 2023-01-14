package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Podaj liczbę.");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            boolean b = czy_doskonala(i);
            if (b == true) {
                counter++;
            }
        }
        System.out.println("Do podanej liczby jest: " + counter + " liczb doskonałych");
    }

    public static boolean czy_doskonala(int n) {
        int s = 1;
        double p = Math.sqrt(n);
        for (int i = 2; i <= p; i++)
            if (n % i == 0)
                s += i + n / i;

        if (n == p * p) {
            s -= p;
        }

        if (n == s) {
            return true;
        } else {
            return false;
        }

    }
}
