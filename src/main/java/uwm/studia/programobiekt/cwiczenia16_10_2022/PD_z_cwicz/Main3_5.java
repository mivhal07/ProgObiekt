package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby po przecinku, które mają być odpowiednio a,b,c w równaniu kwadratowym");
        String s = scanner.nextLine();
        String[] split = s.split(",");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Równanie nie ma pierwiastków");
        } else if (delta == 0) {
            System.out.println("Równanie ma jeden pierwiastek");
        } else {
            System.out.println("Równanie ma dwa pierwiastki");
        }

    }
}
