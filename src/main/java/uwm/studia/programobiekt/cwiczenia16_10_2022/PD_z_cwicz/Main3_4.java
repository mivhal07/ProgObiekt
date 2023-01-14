package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj najpierw znak operacji spośród '+,-,*,/'");
        char znak = scanner.nextLine().toCharArray()[0];
        System.out.println("Teraz podaj liczby po przecinku np. 2,4");
        String liczby = scanner.nextLine();
        String[] dwieLiczby = liczby.split(",");
        double i1 = Double.parseDouble(dwieLiczby[0]);
        double i2 = Double.parseDouble(dwieLiczby[1]);
        if (znak == '+') {
            System.out.println(i1 + i2);
        } else if (znak == '-') {
            System.out.println(i1 - i2);
        } else if (znak == '*') {
            System.out.println(i1 * i2);
        } else if (znak == '/') {
            System.out.println(i1 / i2);
        } else {
            System.out.println("Nie prawidłowy znak");
        }
    }
}
