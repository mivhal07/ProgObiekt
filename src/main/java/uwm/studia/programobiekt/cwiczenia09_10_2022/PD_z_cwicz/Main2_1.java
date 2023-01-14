package uwm.studia.programobiekt.cwiczenia09_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę w stopniach Celsjusza");
        double Cels = scanner.nextDouble();
        double Faren = 32 + (9 / 5) * Cels;
        System.out.println("Temperatura w stopniach Fahrenheita to: " + Faren);
    }
}
