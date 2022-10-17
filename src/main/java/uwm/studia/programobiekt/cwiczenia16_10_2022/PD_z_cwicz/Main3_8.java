package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją średnia np. 3,58");
        double średnia = scanner.nextDouble();
        if (średnia < 2.00) {
            System.out.println("Jak Ty zdałeś");
        } else if (średnia > 2.00 && średnia < 3.99) {
            System.out.println("Zasługujesz na stypendium w wysokości 0 zł");
        } else if (średnia > 4 && średnia < 4.79) {
            System.out.println("Zasługujesz na stypendium w wysokości 350 zł");
        } else if (średnia > 4.8 && średnia < 5.00) {
            System.out.println("Zasługujesz na stypendium w wysokości 550 zł");
        } else {
            System.out.println("Nie ma takiej średniej !!");
        }
    }
}
