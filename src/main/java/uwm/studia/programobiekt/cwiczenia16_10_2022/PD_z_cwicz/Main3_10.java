package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą, której silnię mam obliczyć");
        int i = scanner.nextInt();
        int result = 1;
        for (int j = 1; j <= i; j++) {
            result *= j;
        }
        System.out.println(result);
    }
}
