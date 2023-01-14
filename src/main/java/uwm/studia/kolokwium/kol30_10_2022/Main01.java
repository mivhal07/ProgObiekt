package uwm.studia.kolokwium.kol30_10_2022;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź a");
        int a = scanner.nextInt();
        System.out.println("Wprowadź c");
        int c = scanner.nextInt();
        double delta = Math.pow(2, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Brak rozwiązań");
        } else if (delta == 0) {
            double v = -2 / 2 * a;
            System.out.println("Wynik x1 = " + v);
        } else {
            double x1 = (2 - Math.sqrt(delta)) / 2 * a;
            double x2 = (-2 - Math.sqrt(delta)) / 2 * a;
            System.out.println("Wynik to x1= " + x1 + ", x2= " + x2);
        }
    }
}
