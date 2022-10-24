package uwm.studia.programobiekt.cwiczenia23_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main5_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź x dla wzoru W=(x+1)+(x+2)+...+(x+n)");
        int x = scanner.nextInt();
        System.out.println("Wprowadź n");
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += (x + i);
        }
        System.out.println("Wynik to: " + result);
    }
}