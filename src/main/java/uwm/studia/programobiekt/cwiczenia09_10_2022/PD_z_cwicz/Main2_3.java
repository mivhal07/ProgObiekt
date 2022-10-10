package uwm.studia.programobiekt.cwiczenia09_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main2_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Obliczymy Twoje BMI. Podaj masę ciała w kilogramach.");
        double waga = scanner.nextDouble();
        System.out.println("Teraz podaj swój wzrost w metrach.");
        double wzrost = scanner.nextDouble();
        double BMI = waga / Math.pow(wzrost, 2);
        System.out.println("Twoje BMI wynosi: " + BMI);
    }
}
