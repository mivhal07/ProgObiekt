package uwm.studia.programobiekt.cwiczenia23_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main5_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę 'a'");
        double a = scanner.nextDouble();
        System.out.println("Podaj liczbę 'b'");
        double b = scanner.nextDouble();
        System.out.println("Podaj liczbę 'x'");
        double x = scanner.nextDouble();
        if (check(a, b, x) == true) {
            System.out.println("Liczba mieści się miedzy przedziałem");
        } else {
            System.out.println("Liczba nie mieści się miedzy przedziałem");
        }
    }

    public static boolean check(double a, double b, double x) {
        if (x > a && x < b) {
            return true;
        } else {
            return false;
        }
    }
}
