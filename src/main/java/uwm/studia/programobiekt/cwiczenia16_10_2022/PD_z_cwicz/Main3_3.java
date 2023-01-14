package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy liczby po przecinku np. 1,2,3");
        String s = scanner.nextLine();
        String[] split = s.split(",");
        int i1 = Integer.parseInt(split[0]);
        int i2 = Integer.parseInt(split[1]);
        int i3 = Integer.parseInt(split[2]);
        if (i1 > i2 && i1 > i3) {
            System.out.println("Najwieksza liczba to: " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Najwieksza liczba to: " + i2);
        } else {
            System.out.println("Najwieksza liczba to: " + i3);
        }
    }
}
