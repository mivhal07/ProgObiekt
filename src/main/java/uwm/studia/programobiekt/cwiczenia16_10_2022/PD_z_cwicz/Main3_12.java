package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_12 {

    public static void main(String[] args) {
        int result = 0;
        System.out.println("Podaj liczby które mam zsumować, '0' aby skończyć");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            }
            result += i;
        }
        System.out.println(result);
    }
}
