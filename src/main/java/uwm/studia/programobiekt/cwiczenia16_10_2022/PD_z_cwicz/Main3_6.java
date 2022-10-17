package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj masę ciała w kg");
        double kg = scanner.nextDouble();
        System.out.println("Podaj wzrost w metrach");
        double wzrost = scanner.nextDouble();
        double BMI = kg / Math.pow(wzrost, 2);
        if (BMI < 16) {
            System.out.println("Wygłodzenie");
        } else if (16 < BMI && BMI < 16.99) {
            System.out.println("wychudzenie");
        } else if (17 < BMI && BMI < 18.49) {
            System.out.println("niedowaga");
        } else if (18.5 < BMI && BMI < 24.99) {
            System.out.println("pożądana masa ciała");
        } else if (25 < BMI && BMI < 29.99) {
            System.out.println("nadwaga");
        } else if (30 < BMI && BMI < 34.99) {
            System.out.println("otyłość I stopnia");
        } else if (35 < BMI && BMI < 39.99) {
            System.out.println("otyłość II stopnia (duża)");
        } else if (40 < BMI) {
            System.out.println("otyłość III stopnia (chorobliwa)");
        }
    }
}
