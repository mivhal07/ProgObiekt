package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.println("Podaj liczbę");
        int n = scanner.nextInt();
        if (n > 9 || n <= 0) {
            System.out.println("Nieprawidłowa wartość");
        } else {
            for (int i = 1; i <= n; n++) {
                if (i % 2 == 0)
                    suma -= i;
                else
                    suma += i;
            }
            System.out.println(suma);
        }
    }
}
