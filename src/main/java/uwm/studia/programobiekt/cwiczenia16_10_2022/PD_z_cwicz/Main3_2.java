package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int i = scanner.nextInt();
        System.out.println("Podaj druga liczbę");
        int k = scanner.nextInt();
        if (i % k == 0) {
            System.out.println("liczba " + k + " jest dzielnikiem liczby " + i);
        } else {
            System.out.println("liczba " + k + " nie jest dzielnikiem liczby " + i);
        }
    }
}
