package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_1 {

    private static boolean przestepny(int rok) {
        return ((rok % 4 == 0) && (rok % 100 != 0)) || (rok % 400 == 0);
    }

    public static void main(String[] args) {
        int rok;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rok do sprawdzenia.");
        rok = scanner.nextInt();

        if (przestepny(rok)) {
            System.out.println("Podany rok jest przestepny.");
        } else {
            System.out.println("Podany rok nie jest przestepny.");
        }
    }
}
