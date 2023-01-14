package uwm.studia.programobiekt.cwiczenia23_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main5_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość");
        int długość = scanner.nextInt();
        System.out.println("Podaj szerokość");
        int szerokość = scanner.nextInt();
        System.out.println("Podaj znak np.*");
        String znak = scanner.next();
        char c = znak.toCharArray()[0];
        for (int i = 0; i < długość; i++) {
            for (int j = 0; j < szerokość; j++) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }
}
