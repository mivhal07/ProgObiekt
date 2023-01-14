package uwm.studia.programobiekt.cwiczenia09_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main2_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy współczynnik 'a' do równania kwadratowego");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugi współczynnik 'b' do równania kwadratowego");
        double b = scanner.nextDouble();
        System.out.println("Podaj ostatni współczynnik 'c' do równania kwadratowego");
        double c = scanner.nextDouble();
        double result = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta wynosi: " + result);
    }
}
