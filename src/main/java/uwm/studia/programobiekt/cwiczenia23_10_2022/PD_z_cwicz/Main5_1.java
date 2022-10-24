package uwm.studia.programobiekt.cwiczenia23_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main5_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę w Fahrenhaitach");
        int f = scanner.nextInt();
        double c = (f - 32) * 0.555555555556;
        System.out.println("Stopnie Celsjusza: " + c);
    }
}
