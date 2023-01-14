package uwm.studia.programobiekt.cwiczenia23_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main5_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę, a ja obliczę sumę jej cyfr");
        String s = scanner.next();
        char[] chars = s.toCharArray();
        int suma = 0;
        for (int i = 0; i < chars.length; i++) {
            suma += Integer.parseInt(String.valueOf(chars[i]));
        }
        System.out.println("Suma cyfr tej liczby to: " + suma);
    }
}
